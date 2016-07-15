package com.Interfaces.Prob08_MilitaryElite.models;

import com.Interfaces.Prob08_MilitaryElite.models.abstraction.SpecialisedSoldier;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author chobi
 */
public class Commando extends SpecialisedSoldier {

    private List<Missions> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corps, List<Missions> missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new LinkedList<>();
        this.setMissions(missions);
    }

    public List<Missions> getMissions() {
        return missions;
    }

    private void setMissions(List<Missions> missions) {
        this.missions = missions;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Missions:");

        this.getMissions().forEach(m -> {
            sb.append(System.lineSeparator())
                    .append("  " + m);
        });

        return sb.toString();
    }

}
