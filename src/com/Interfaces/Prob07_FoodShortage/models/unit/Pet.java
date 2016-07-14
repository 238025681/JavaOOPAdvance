package com.Interfaces.Prob07_FoodShortage.models.unit;

import com.Interfaces.Prob07_FoodShortage.interfaces.Birthable;



/**
 *
 * @author chobi
 */
public class Pet implements Birthable{
    private String name;
    private String birthdate;

    public Pet(String name, String birthdate) {
        this.setName(name);
        this.setBirthdate(birthdate);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    
    @Override
    public String getBirthdate() {
        return this.birthdate; 
    }
    
   
    
}
