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

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mgamble
 */
public class NPAEntry {
    private String NPA;
    private String NXX;
    private RouteDestination country;
    private String notes;

    public NPAEntry(ResultSet rs) throws SQLException {
        this.NPA = rs.getString("NPA");
        this.NXX = rs.getString("NXX");
        this.country = RouteDestination.valueOf(rs.getString("Country"));
        this.notes = rs.getString("Notes");
    }
    /**
     * @return the NPA
     */
    public String getNPA() {
        return NPA;
    }

    /**
     * @param NPA the NPA to set
     */
    public void setNPA(String NPA) {
        this.NPA = NPA;
    }

    /**
     * @return the NXX
     */
    public String getNXX() {
        return NXX;
    }

    /**
     * @param NXX the NXX to set
     */
    public void setNXX(String NXX) {
        this.NXX = NXX;
    }

    /**
     * @return the country
     */
    public RouteDestination getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(RouteDestination country) {
        this.country = country;
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
}
