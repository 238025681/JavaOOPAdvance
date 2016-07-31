/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob05_ComparingObjects.interfaces;

/**
 *
 * @author kalin
 */
public interface Person  extends Comparable<Person>{
    
    String getTown();
    
    String getName();
    
    int getAge();
    
}
