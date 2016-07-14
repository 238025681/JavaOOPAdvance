package com.Interfaces.Prob07_FoodShortage.models.unit;

/**
 *
 * @author chobi
 */
public class Rebel extends Humman {

    private int food;
    private String group;

    public Rebel(String name, int age, String group) {
        super(name, age);
        this.setGroup(group);
        this.food = 0;
    }

    public String getGroup() {
        return group;
    }

    private void setGroup(String group) {
        this.group = group;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public void buyFood() {
        this.food += 5;
    }

}
