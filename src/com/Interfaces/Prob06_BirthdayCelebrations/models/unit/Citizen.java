
package com.Interfaces.Prob06_BirthdayCelebrations.models.unit;

import com.Interfaces.Prob06_BirthdayCelebrations.interfaces.Migratable;

/**
 *
 * @author chobi
 */
public class Citizen extends BiologicUnit implements Migratable{
    private String id;
    private int age;

    public Citizen(String name, int age, String id, String birthdate) {
        super(name, birthdate);
        this.setId(id);
        this.setAge(age);
    }
    

    @Override
    public String getId() {
        return this.id;
    }

  
    private void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
    
    
}
    