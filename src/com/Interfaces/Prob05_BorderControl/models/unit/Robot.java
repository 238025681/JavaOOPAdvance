
package com.Interfaces.Prob05_BorderControl.models.unit;

/**
 *
 * @author chobi
 */
public class Robot extends  Population{
    
    private String model;

    public Robot(String model, String id) {
        super(id);
        this.setModel(model);
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }
    
}
    