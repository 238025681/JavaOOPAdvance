/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob10_MooD.models;

import com.Interfaces.Prob10_MooD.interfaces.Characters;

/**
 *
 * @author chobi
 */
public abstract class CharactersImpl<T extends Number> implements Characters {

    private String userName;
    private Integer level;
    private T specialPoint;

    public CharactersImpl(String userName, T level, T specialPoint) {
        this.setUserName(userName);
        this.setLevel(level);
        this.setSpecialPoint(specialPoint);

    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private void setLevel(T level) {
        this.level = level.intValue();
    }

    private void setSpecialPoint(T specialPoint) {
        this.specialPoint = specialPoint;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public abstract String getHashedPassword();

    @Override
    public Integer getLevel() {
        return this.level;
    }

    @Override
    public T getSpecialPoint() {
        return this.specialPoint;
    }

    @Override
    public String toString() {

        /*
        <”username”> | <”hashed password”> -> <character type>
<special points * level>

        
         */
        StringBuilder sb = new StringBuilder();
        sb.append("\"" + this.getUserName() + "\"").append(" | ")
                .append("\"" + this.getHashedPassword() + "\"").append(" -> ")
                .append(this.getClass().getSimpleName()).append(System.lineSeparator())
                .append(this.multiply());
        return sb.toString();
    }

    protected abstract Number multiply();

}
