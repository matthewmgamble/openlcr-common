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
package net.openlcr.common.classes;

/**
 *
 * @author mgamble
 */
public class Route implements Comparable{
        private int routeID;
    private String digits;
    private double price;
    private int carrierID;
    private int rounding_base;
    private int rounding_increment;
    private String description;
    private String notes;
    private boolean active = true;
    private RouteModification routeModification = RouteModification.NONE;
    private String modificationString = "";

    /**
     * @return the routeID
     */
    public int getRouteID() {
        return routeID;
    }

    /**
     * @param routeID the routeID to set
     */
    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    /**
     * @return the digits
     */
    public String getDigits() {
        return digits;
    }

    /**
     * @param digits the digits to set
     */
    public void setDigits(String digits) {
        this.digits = digits;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

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
     * @return the rounding_base
     */
    public int getRounding_base() {
        return rounding_base;
    }

    /**
     * @param rounding_base the rounding_base to set
     */
    public void setRounding_base(int rounding_base) {
        this.rounding_base = rounding_base;
    }

    /**
     * @return the rounding_increment
     */
    public int getRounding_increment() {
        return rounding_increment;
    }

    /**
     * @param rounding_increment the rounding_increment to set
     */
    public void setRounding_increment(int rounding_increment) {
        this.rounding_increment = rounding_increment;
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

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
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
     * @return the routeModification
     */
    public RouteModification getRouteModification() {
        return routeModification;
    }

    /**
     * @param routeModification the routeModification to set
     */
    public void setRouteModification(RouteModification routeModification) {
        this.routeModification = routeModification;
    }

    /**
     * @return the modificationString
     */
    public String getModificationString() {
        return modificationString;
    }

    /**
     * @param modificationString the modificationString to set
     */
    public void setModificationString(String modificationString) {
        this.modificationString = modificationString;
    }

    @Override
    public int compareTo(Object o) {
        Route p = (Route) o;
         return Double.compare(this.getPrice(), p.getPrice());
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



   

}
