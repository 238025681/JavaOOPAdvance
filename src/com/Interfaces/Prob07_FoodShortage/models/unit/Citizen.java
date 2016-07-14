package com.Interfaces.Prob07_FoodShortage.models.unit;

import com.Interfaces.Prob07_FoodShortage.interfaces.Birthable;
import com.Interfaces.Prob07_FoodShortage.interfaces.Migratable;



/**
 *
 * @author chobi
 */
public class Citizen extends Humman implements Migratable, Birthable{
    private String id;
    private String birthdate;
    private int food;

    public Citizen(String name, int age, String id, String birthdate) {
        super(name, age);
        this.setId(id);
        this.setBirthdate(birthdate);
        this.food = 0;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

  
    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    
}
    