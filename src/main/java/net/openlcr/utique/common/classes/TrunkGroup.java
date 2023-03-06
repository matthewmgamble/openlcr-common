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

/**
 *
 * @author mgamble
 */
public class TrunkGroup {
    private int carrerID;
    private String trunkGroupID;
    private String ipAddress;
    private int port = 5060;
    private int priority;
    private String description;

    /**
     * @return the carrerID
     */
    public int getCarrerID() {
        return carrerID;
    }

    /**
     * @param carrerID the carrerID to set
     */
    public void setCarrerID(int carrerID) {
        this.carrerID = carrerID;
    }

    /**
     * @return the trunkGroupID
     */
    public String getTrunkGroupID() {
        return trunkGroupID;
    }

    /**
     * @param trunkGroupID the trunkGroupID to set
     */
    public void setTrunkGroupID(String trunkGroupID) {
        this.trunkGroupID = trunkGroupID;
    }

    /**
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress the ipAddress to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
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
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }
}
