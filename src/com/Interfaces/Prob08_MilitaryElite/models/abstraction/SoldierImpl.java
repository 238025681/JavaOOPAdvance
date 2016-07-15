package com.Interfaces.Prob08_MilitaryElite.models.abstraction;

import com.Interfaces.Prob08_MilitaryElite.interfaces.Soldier;

/**
 *
 * @author chobi
 */
public abstract class SoldierImpl implements Soldier {

    private int id;
    private String firstName;
    private String lastName;

    public SoldierImpl(int id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstname(firstName);
        this.setLastName(lastName);
    }

    @Override
    public String getFirstname() {
        return this.firstName;
    }

    private void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getId() {
        return this.id;
    }

    private void setId(int id) {
        this.id = id;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d", this.getFirstname(), this.getLastName(), this.getId()));

        return sb.toString();
    }
}
