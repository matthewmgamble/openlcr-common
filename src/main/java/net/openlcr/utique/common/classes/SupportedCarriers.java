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

/*

This file contains an ENUM list of all carriers supported for the "type" argument and is
used by the CLI loader to validate we can support processing rate sheet files from that carrier.

This needs to be moved to be more generic to support non-Canadian carriers in the future

*/
package net.openlcr.utique.common.classes;


/**
 *
 * @author mgamble
 */
public enum SupportedCarriers {
    IRISTEL("iristel"),
    VOIPMS("voipms"),
    THINKTEL("thinktel"), 
    BELL("bell"),
    PRIMUS("primus"),
    BANDWIDTH("bandwidth"),
    FLOWROUTE("flowroute");
    
    private final String text;

    /**
     * @param text
     */
    private SupportedCarriers(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }

   
}
