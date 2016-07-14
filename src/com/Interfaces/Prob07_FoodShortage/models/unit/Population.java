package com.Interfaces.Prob07_FoodShortage.models.unit;




/**
 *
 * @author chobi
 */
public abstract class Population {
    private String name;

    public Population(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    
    
}
