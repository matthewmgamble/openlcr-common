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
public class UserSessionState {
    
    // State information

    private String sessionID;
    private String userDisplayName;
    private String remoteIP;
    private String emailAddress;

    /**
     * @return the sessionID
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * @param sessionID the sessionID to set
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * @return the userDisplayName
     */
    public String getUserDisplayName() {
        return userDisplayName;
    }

    /**
     * @param userDisplayName the userDisplayName to set
     */
    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    /**
     * @return the remoteIP
     */
    public String getRemoteIP() {
        return remoteIP;
    }

    /**
     * @param remoteIP the remoteIP to set
     */
    public void setRemoteIP(String remoteIP) {
        this.remoteIP = remoteIP;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
