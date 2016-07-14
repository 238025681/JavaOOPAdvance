package com.Interfaces.Prob07_FoodShortage.models.controls;

import com.Interfaces.Prob07_FoodShortage.interfaces.Birthable;
import com.Interfaces.Prob07_FoodShortage.interfaces.Buyer;
import com.Interfaces.Prob07_FoodShortage.interfaces.Migratable;
import com.Interfaces.Prob07_FoodShortage.models.unit.Humman;
import java.util.List;

/**
 *
 * @author chobi
 */
public class Checkpoint {

    private String pattern;

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
    

    public void checkId(Migratable unit) {

        if (unit.getId().endsWith(this.pattern)) {
            System.out.println(unit.getId());
        }
    }

    public void checkBirthdates(Birthable unit) {
        if (unit.getBirthdate().endsWith(this.pattern)) {
            System.out.println(unit.getBirthdate());
        }

    }

    public void sellFood(Humman unit) {
        unit.buyFood();
    }

}
