package com.Interfaces.Prob06_BirthdayCelebrations.models.controls;

import com.Interfaces.Prob06_BirthdayCelebrations.interfaces.Migratable;
import com.Interfaces.Prob06_BirthdayCelebrations.models.unit.BiologicUnit;





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
    
    public void checkBirthdates (BiologicUnit unit){
        if (unit.getBirthdate().endsWith(this.pattern)) {
            System.out.println(unit.getBirthdate());
        }
    }
    
}
