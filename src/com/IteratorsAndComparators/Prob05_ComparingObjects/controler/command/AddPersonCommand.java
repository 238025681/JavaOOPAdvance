/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob05_ComparingObjects.controler.command;

import com.IteratorsAndComparators.Prob05_ComparingObjects.controler.Core;
import com.IteratorsAndComparators.Prob05_ComparingObjects.interfaces.Person;
import com.IteratorsAndComparators.Prob05_ComparingObjects.models.PersonImpl;

/**
 *
 * @author kalin
 */
public class AddPersonCommand extends Command{
    
    @Inject
    String[] data;

    public AddPersonCommand(Core core) {
        super(core);
    }

    @Override
    public String execute() {
        
        Person newPerson = new PersonImpl(data[0], data[2], Integer.parseInt(data[1]));
        this.getCore().addPerson(newPerson);
        
        return "";
    }
    
}
