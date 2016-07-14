package com.Interfaces.Prob03_Ferrari.models;

import com.Interfaces.Prob03_Ferrari.interfaces.Ferrari;

/**
 *
 * @author chobi
 */
public class FerrariImpl implements Ferrari {

    private final String MODEL = "488-Spider";
    private String driverName;

    public FerrariImpl(String driverName) {
        this.setDriverName(driverName);

    }

    @Override
    public String getDriverName() {
        return this.driverName;
    }

    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String getModel() {
        return this.MODEL;
    }

    private void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getModel())
                .append("/")
                .append(this.useBrakes())
                .append("/")
                .append(this.pushGas())
                .append("/")
                .append(this.getDriverName());
        return sb.toString();
    }

}
