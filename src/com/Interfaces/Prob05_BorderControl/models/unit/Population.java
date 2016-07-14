package com.Interfaces.Prob05_BorderControl.models.unit;

import com.Interfaces.Prob05_BorderControl.interfaces.Migratable;

/**
 *
 * @author chobi
 */
public abstract class Population implements Migratable{
    private String id;

    public Population(String id) {
        this.setId(id);
    }

    private void setId(String id) {
        this.id = id;
    }
    
    
    @Override
    public String getId() {
        return this.id;
    }
    
}
