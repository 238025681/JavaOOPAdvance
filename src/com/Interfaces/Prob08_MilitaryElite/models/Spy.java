package com.Interfaces.Prob08_MilitaryElite.models;

import com.Interfaces.Prob08_MilitaryElite.models.abstraction.SoldierImpl;

/**
 *
 * @author chobi
 */
public class Spy extends SoldierImpl {

    private int codeNumber;

    public Spy(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    private void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        super.toString();
        //Name: <firstName> <lastName> Id: <id>
        //Code Number: <codeNumber>
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append(String.format("Code Number: %d", this.getCodeNumber()));

        return sb.toString();
    }

}
