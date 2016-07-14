package com.Interfaces.Prob05_BorderControl.models.controls;

import com.Interfaces.Prob05_BorderControl.interfaces.Migratable;
import com.Interfaces.Prob05_BorderControl.models.unit.Population;

/**
 *
 * @author chobi
 */
public class Checkpoint {
    private String pattern;


    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
    
    
    
    public void checkId(Migratable unit){
                
        if (unit.getId().endsWith(this.pattern)) {
            System.out.println(unit.getId());
        }
    }
    
}
