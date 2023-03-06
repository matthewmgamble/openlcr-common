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
public class SystemConfiguration {

    private String logFileName = "utique.log";
    private String logDir = "/var/log/utique/";
    private String mySQLServer = "192.168.177.129";
    private String mySQLUser = "root";
    private String mySQLPass = "lcrpass";
    private String mySQLDatabase = "lcr";
    private String sipPort = "5060";
    private String sipAddress = "127.0.0.1";
    private String sipErrorCode = "416";
    private String sipResponseCode = "300";
    private String sipPlatform = "metaswitch";
    private boolean e164Enabled = true;
    private boolean send100Trying = false;
    private String locale = "US";
    private boolean cacheEnabled = true;
    private int httpPort = 9000;
    /**
     * @return the logFileName
     */
    public String getLogFileName() {
        return logFileName;
    }

    /**
     * @param logFileName the logFileName to set
     */
    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    /**
     * @return the logDir
     */
    public String getLogDir() {
        return logDir;
    }

    /**
     * @param logDir the logDir to set
     */
    public void setLogDir(String logDir) {
        this.logDir = logDir;
    }

    /**
     * @return the mySQLServer
     */
    public String getMySQLServer() {
        return mySQLServer;
    }

    /**
     * @param mySQLServer the mySQLServer to set
     */
    public void setMySQLServer(String mySQLServer) {
        this.mySQLServer = mySQLServer;
    }

    /**
     * @return the mySQLUser
     */
    public String getMySQLUser() {
        return mySQLUser;
    }

    /**
     * @param mySQLUser the mySQLUser to set
     */
    public void setMySQLUser(String mySQLUser) {
        this.mySQLUser = mySQLUser;
    }

    /**
     * @return the mySQLPass
     */
    public String getMySQLPass() {
        return mySQLPass;
    }

    /**
     * @param mySQLPass the mySQLPass to set
     */
    public void setMySQLPass(String mySQLPass) {
        this.mySQLPass = mySQLPass;
    }

    /**
     * @return the mySQLDatabase
     */
    public String getMySQLDatabase() {
        return mySQLDatabase;
    }

    /**
     * @param mySQLDatabase the mySQLDatabase to set
     */
    public void setMySQLDatabase(String mySQLDatabase) {
        this.mySQLDatabase = mySQLDatabase;
    }

    /**
     * @return the sipPort
     */
    public String getSipPort() {
        return sipPort;
    }

    /**
     * @param sipPort the sipPort to set
     */
    public void setSipPort(String sipPort) {
        this.sipPort = sipPort;
    }

    /**
     * @return the sipAddress
     */
    public String getSipAddress() {
        return sipAddress;
    }

    /**
     * @param sipAddress the sipAddress to set
     */
    public void setSipAddress(String sipAddress) {
        this.sipAddress = sipAddress;
    }

    /**
     * @return the sipCodeError
     */
    public String getSipCodeError() {
        return getSipErrorCode();
    }

    /**
     * @param sipCodeError the sipCodeError to set
     */
    public void setSipCodeError(String sipCodeError) {
        this.setSipErrorCode(sipCodeError);
    }

    /**
     * @return the sipResponseCode
     */
    public String getSipResponseCode() {
        return sipResponseCode;
    }

    /**
     * @param sipResponseCode the sipResponseCode to set
     */
    public void setSipResponseCode(String sipResponseCode) {
        this.sipResponseCode = sipResponseCode;
    }

    /**
     * @return the sipPlatform
     */
    public String getSipPlatform() {
        return sipPlatform;
    }

    /**
     * @param sipPlatform the sipPlatform to set
     */
    public void setSipPlatform(String sipPlatform) {
        this.sipPlatform = sipPlatform;
    }

    /**
     * @return the sipErrorCode
     */
    public String getSipErrorCode() {
        return sipErrorCode;
    }

    /**
     * @param sipErrorCode the sipErrorCode to set
     */
    public void setSipErrorCode(String sipErrorCode) {
        this.sipErrorCode = sipErrorCode;
    }

    /**
     * @return the e164Enabled
     */
    public boolean getE164Enabled() {
        return e164Enabled;
    }

    /**
     * @param e164Enabled the e164Enabled to set
     */
    public void setE164Enabled(boolean e164Enabled) {
        this.e164Enabled = e164Enabled;
    }
    
    /**
     * @return the send100Trying
     */
    public boolean isSend100Trying() {
        return send100Trying;
    }

    /**
     * @param send100Trying the send100Trying to set
     */
    public void setSend100Trying(boolean send100Trying) {
        this.send100Trying = send100Trying;
    }
    
    /**
     * @return the locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * @param locale the locale to set
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * @return the httpPort
     */
    public int getHttpPort() {
        return httpPort;
    }

    /**
     * @param httpPort the httpPort to set
     */
    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }

    /**
     * @return the cacheEnabled
     */
    public boolean getCacheEnabled() {
        return cacheEnabled;
    }

    /**
     * @param cacheEnabled the cacheEnabled to set
     */
    public void setCacheEnabled(boolean cacheEnabled) {
        this.cacheEnabled = cacheEnabled;
    }
    
}
