/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob02_MultipleImplementation.models;

import com.Interfaces.Prob02_MultipleImplementation.interfaces.Birthable;
import com.Interfaces.Prob02_MultipleImplementation.interfaces.Identifiable;
import com.Interfaces.Prob02_MultipleImplementation.interfaces.Person;

/**
 *
 * @author chobi
 */
public class Citizen  implements Person, Identifiable, Birthable{
    
    private String name;
    private int age; 
    private  String id;
    private String birthdate;

    public Citizen(String name, int age, String id, String birthdate) {
        this.setAge(age);
        this.setName(name);
        this.setId(id);
        this.setBirthdate(birthdate);
    }

    
   
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
       return this.age;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
     private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
    
    

    
}
