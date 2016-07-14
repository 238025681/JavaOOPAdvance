
package com.Interfaces.Prob01_DefineAnInterfaceIPerson.models;

import com.Interfaces.Prob01_DefineAnInterfaceIPerson.interfaces.Person;

/**
 *
 * @author chobi
 */
public class Citizen  implements Person{
    
    String name;
    int age; 

    public Citizen(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    
    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
    
    

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
       return this.age;
    }
    
}
