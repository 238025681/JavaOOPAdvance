package com.Interfaces.Prob04_Telephony.models;

import com.Interfaces.Prob04_Telephony.interfaces.Browsable;
import com.Interfaces.Prob04_Telephony.interfaces.Callable;

/**
 *
 * @author chobi
 */
public class Smartphone implements Browsable, Callable {
    private String model;

    public Smartphone(String model) {
        this.setModel(model);
    }


    @Override
    public void brows(String... url) {

        for (String string : url) {
            boolean isURL = string.matches("^(\\D*)$") ? true : false;

            if (!isURL) {
                System.out.println("Invalid URL!");
                continue;
            }

            System.out.printf("Browsing: %s!%n", string);
        }

    }

    @Override
    public void makeCall(String... url) {
        for (String string : url) {
            boolean isNumeric = string.matches("^(\\d*)$") ? true : false;
            
            if (!isNumeric) {
                System.out.println("Invalid number!");
                continue;
                
            }
            
            System.out.printf("Calling... %s%n", string);
        }
    }

    
    private void setModel(String model) {
        this.model = model;
    }
    
    
}
