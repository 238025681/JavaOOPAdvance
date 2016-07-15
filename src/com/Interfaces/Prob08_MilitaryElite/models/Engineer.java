package com.Interfaces.Prob08_MilitaryElite.models;

import com.Interfaces.Prob08_MilitaryElite.models.abstraction.SpecialisedSoldier;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author chobi
 */
public class Engineer extends SpecialisedSoldier {
    
    private List<Repairs> repairs;
    
    public Engineer(int id, String firstName, String lastName, double salary, String corps, List<Repairs> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new LinkedList<>();
        this.setRepairs(repairs);
    }
    
    public List<Repairs> getRepairs() {
        return repairs;
    }
    
    public void setRepairs(List<Repairs> repairs) {
        this.repairs = repairs;
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Repairs:");
                
        
        this.getRepairs().forEach(r -> {
            sb.append(System.lineSeparator())
                    .append("  " + r);
        });
        
        return sb.toString();
    }
    
}
