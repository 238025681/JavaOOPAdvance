package com.Interfaces.Prob06_BirthdayCelebrations.models.unit;

import com.Interfaces.Prob06_BirthdayCelebrations.interfaces.Migratable;


/**
 *
 * @author chobi
 */
public abstract class Population{
    private String name;

    public Population(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }
    
    
    
}
