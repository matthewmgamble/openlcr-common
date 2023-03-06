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

/**
 *
 * @author mgamble
 */
public class Carrier {
    private int carrierID;
    private String carrierName;
    private boolean active = true;
    private boolean useE164 = true;
    private String description;
    private ArrayList<TrunkGroup> trunkGroups;
    /**
     * @return the carrierID
     */
    public int getCarrierID() {
        return carrierID;
    }

    /**
     * @param carrierID the carrierID to set
     */
    public void setCarrierID(int carrierID) {
        this.carrierID = carrierID;
    }

    /**
     * @return the carrierName
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * @param carrierName the carrierName to set
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the trunkGroups
     */
    public ArrayList<TrunkGroup> getTrunkGroups() {
        if (this.trunkGroups == null) {
            this.trunkGroups = new ArrayList<>();
        }
        return trunkGroups;
    }

    /**
     * @param trunkGroups the trunkGroups to set
     */
    public void setTrunkGroups(ArrayList<TrunkGroup> trunkGroups) {
        this.trunkGroups = trunkGroups;
    }
    
    public void addTrunkGroup(TrunkGroup trunkGroup) {
        if (this.trunkGroups == null) {
            this.trunkGroups = new ArrayList<>();
        }
        this.trunkGroups.add(trunkGroup);
    }

    /**
     * @return the useE164
     */
    public boolean isUseE164() {
        return useE164;
    }

    /**
     * @param useE164 the useE164 to set
     */
    public void setUseE164(boolean useE164) {
        this.useE164 = useE164;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
