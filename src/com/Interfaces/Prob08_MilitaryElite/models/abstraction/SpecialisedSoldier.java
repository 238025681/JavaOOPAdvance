package com.Interfaces.Prob08_MilitaryElite.models.abstraction;

import com.Interfaces.Prob08_MilitaryElite.models.PrivateImpl;
import com.Interfaces.Prob08_MilitaryElite.interfaces.Collectable;

/**
 *
 * @author chobi
 */
public abstract class SpecialisedSoldier extends PrivateImpl implements Collectable {

    private String corps;

    public SpecialisedSoldier(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    private void setCorps(String corps) {
        
         
            this.corps = corps;
        

    }

    @Override
    public String toString() {
        

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append("Corps: ")
                .append(this.corps)
                .append(System.lineSeparator());
        return sb.toString();
    }

}
