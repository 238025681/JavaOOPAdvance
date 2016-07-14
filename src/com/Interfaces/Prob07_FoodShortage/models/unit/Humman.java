
package com.Interfaces.Prob07_FoodShortage.models.unit;

import com.Interfaces.Prob07_FoodShortage.interfaces.Buyer;


/**
 *
 * @author chobi
 */
public abstract class Humman extends Population implements Buyer{
    
        private int age;
    
    public Humman(String name, int age) {
        super(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    
    
    
    
    
    
}
