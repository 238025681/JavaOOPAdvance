package com.Interfaces.Prob07_FoodShortage.models.unit;

import com.Interfaces.Prob07_FoodShortage.interfaces.Migratable;



/**
 *
 * @author chobi
 */
public class Robot extends  Population implements Migratable{
    
    private String id;

    public Robot(String name, String id) {
        super(name);
        this.setId(id);
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setId(String id) {
        this.id = id;
    }
    
}
    