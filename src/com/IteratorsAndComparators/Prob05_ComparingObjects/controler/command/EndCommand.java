/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob05_ComparingObjects.controler.command;

import com.IteratorsAndComparators.Prob05_ComparingObjects.controler.Core;
import com.IteratorsAndComparators.Prob05_ComparingObjects.interfaces.Person;
import java.util.StringJoiner;

/**
 *
 * @author kalin
 */
public class EndCommand extends Command{
    
    @Inject
    String[] data;

    public EndCommand(Core core) {
        super(core);
    }

    @Override
    public String execute() {
        
        int index = (Integer.parseInt(data[0]));
        
        if (index >= this.getCore().getPerson().size()) {
            return "No matches";
        }
        
        Person currentPerson = this.getCore().getPerson().get(index);
        
        
        int totalEqual = 0;
        int totalPepole = this.getCore().getPerson().size();
        
        for (Person person : this.getCore().getPerson()) {
        
            if (currentPerson.compareTo(person) == 0) {
                totalEqual++;
            }
        }
        if (totalEqual == 0) {
            
            return "No matches";
            
        }else{
            
            return String.format("%d %d %d", totalEqual, (totalPepole - totalEqual), totalPepole );
        }
        
        
    }
    
}
