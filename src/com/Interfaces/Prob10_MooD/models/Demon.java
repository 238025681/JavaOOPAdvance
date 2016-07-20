/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob10_MooD.models;

/**
 *
 * @author chobi
 * @param <T>
 */
public class Demon<T extends Number> extends CharactersImpl{
    
    private String hashedPassword; 

    public Demon(String userName, T level, T specialPoint) {
        super(userName, level, specialPoint);
        this.setHashedPassword();
    }

    @Override
    public String getHashedPassword() {
        return this.hashedPassword;
    }

    @Override
    protected Number multiply() {
        return this.getLevel() * this.getSpecialPoint().doubleValue();
    }
    
    
     private void setHashedPassword() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(this.getUserName().length() * 217);
        this.hashedPassword = sb.toString();
    }

   
     
     
    
}
