package com.Interfaces.Prob08_MilitaryElite.models;

/**
 *
 * @author chobi
 */
public class Repairs {
    
    private String partName;
    private int workedHour;

    public Repairs(String partName, int workedHour) {
        this.setPartName(partName);
        this.setWorkedHour(workedHour);
    }

    public String getPartName() {
        return partName;
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    public int getWorkedHour() {
        return workedHour;
    }

    private void setWorkedHour(int workedHour) {
        this.workedHour = workedHour;
    }

    @Override
    public String toString() {
        
        //Part Name: <partName> Hours Worked: <hoursWorked>
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Part Name: %s Hours Worked: %s", this.getPartName(), this.getWorkedHour()));
        
        return sb.toString();
    }
    
    
    
}
