/*
 * Copyright (C) 2023 Matthew M. Gamble <mgamble@mgamble.ca>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package net.openlcr.utique.common.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author mgamble
 */
public class DIDRoute {
    private ArrayList<Route> targetRoutes;

    
    
    /**
     * @return the targetRoutes
     */
    public ArrayList<Route> getTargetRoutes() {
        if (this.targetRoutes == null) {
            this.targetRoutes = new ArrayList<>();
        }
        return targetRoutes;
    }

    /**
     * @param targetRoutes the targetRoutes to set
     */
    public void setTargetRoutes(ArrayList<Route> targetRoutes) {
        this.targetRoutes = targetRoutes;
    }
    
    public void addTargetRoute(Route route) {
        if (this.targetRoutes == null) {
            this.targetRoutes = new ArrayList<>();
        }
        /* Check if we already have a route to the same carrier */
        /* If the new route attempting to be added it MORE specific (more digits) then delete and add the new
           otherwise silently fail 
        */
        for (Iterator<Route> iterator = targetRoutes.iterator(); iterator.hasNext(); ) {
            Route r = iterator.next();
      //  for (Route r: targetRoutes) {
            if (r.getCarrierID() == route.getCarrierID()) {
                if (r.getDigits().length() <= route.getDigits().length()) {
                   iterator.remove();        
                } else {
                    return;
                }
            }
        }
        this.targetRoutes.add(route);
    }
    /* Very similar to Add route, however, this ensures it gets pop'd to the top - used mostly for 
    static customer routing */
    
    public void prependTargetRoute(Route route) {
        if (this.targetRoutes == null) {
            this.targetRoutes = new ArrayList<>();
        }

        // see if the route already exists - if it does, pop it, then remove it
        if (this.targetRoutes.contains(route)) {
            this.targetRoutes.remove(route);
        }
        this.targetRoutes.add(0, route);
    }
    
    // Used to remove a route to a specific carrier for a speceific number to ensure
    // we can avoid using some carriers for some customers
    public void removeTargetCarrier(int carrierID) {
        if (this.targetRoutes == null) {
            this.targetRoutes = new ArrayList<>();
        }
        this.targetRoutes.stream().filter((route) -> (route.getCarrierID() == carrierID)).forEachOrdered((route) -> {
            this.targetRoutes.remove(route);
        });
    }
    public void orderTargetRoutes() {
        if (this.targetRoutes != null) {
            
            //sort

        Collections.sort(targetRoutes);
        // Sort the routes
      //     targetRoutes.sort(null);
        }
    }
}
