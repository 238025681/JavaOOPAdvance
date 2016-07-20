/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob10_MooD.models;

import java.util.StringJoiner;

/**
 *
 * @author chobi
 */
public class Archangel<T extends Number> extends CharactersImpl{
    private String hashedPassword; 

    public Archangel(String userName, T level, T specialPoint) {
        super(userName, level, specialPoint);
        this.setHashedPassword();
    }

    @Override
    public String getHashedPassword() {
        return this.hashedPassword;
    }
    
    

    @Override
    protected Number multiply() {
        return this.getLevel() * this.getSpecialPoint().intValue();
    }
    
    private void setHashedPassword() {
        
        Integer hashCode = this.getUserName().length() * 21;
        
        StringBuilder hashCodeString = new StringBuilder();
        hashCodeString.append(this.getUserName()).reverse();
        
        this.hashedPassword =  hashCodeString + "" + hashCode;
    }
   
}
