/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob05_ComparingObjects.models;

import com.IteratorsAndComparators.Prob05_ComparingObjects.interfaces.Person;


public class PersonImpl implements Person {
    
    private String name;
    private String town;
    private int age;

    public PersonImpl(String name, String town, int age) {
        this.setName(name);
        this.setTown(town);
        this.setAge(age);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setTown(String town) {
        this.town = town;
    }

    private void setAge(int age) {
        this.age = age;
    }
    
    

    @Override
    public String getTown() {
        
        return this.town;
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
    public int compareTo(Person person) {
        int result = this.getName().compareTo(person.getName());
        
        if (result == 0) {
            
            result = Integer.compare(this.getAge(), person.getAge());
        }
        
        if (result == 0) {
            
            result = this.getTown().compareTo(person.getTown());
        }
        
        return result;
    }
    
}
