
package com.Interfaces.Prob06_BirthdayCelebrations.models.unit;

import com.Interfaces.Prob06_BirthdayCelebrations.interfaces.Birthable;

/**
 *
 * @author chobi
 */
public abstract class BiologicUnit extends Population implements Birthable{
    private String birthdate;
    
    public BiologicUnit(String name, String birthdate) {
        super(name);
        this.setBirthdate(birthdate);
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    
    @Override
    public String getBirthdate() {
        return this.birthdate;
    }
    
}
