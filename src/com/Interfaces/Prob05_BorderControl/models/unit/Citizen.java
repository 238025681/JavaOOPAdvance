
package com.Interfaces.Prob05_BorderControl.models.unit;

/**
 *
 * @author chobi
 */
public class Citizen extends Population{
    private String name;
    private int age;

    public Citizen(String name, int age, String id) {
        super(id);
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
    
    
}
    