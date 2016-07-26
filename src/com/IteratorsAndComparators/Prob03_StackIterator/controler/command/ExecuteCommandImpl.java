/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob03_StackIterator.controler.command;

import com.IteratorsAndComparators.Prob03_StackIterator.controler.Core;
import com.IteratorsAndComparators.Prob03_StackIterator.interfaces.ExecuteCommand;


public class ExecuteCommandImpl implements ExecuteCommand{

    @Override
    public void executePush(Core core, Integer element) {
        
        core.getCurrentStack().push(element);
    }

    @Override
    public void executePop(Core core) {
        
        core.getCurrentStack().pop();
    }

    @Override
    public String executePrint(Core core) {
        
        StringBuilder sb = new StringBuilder();
        core.getCurrentStack().forEach(stack -> {
            sb.append(stack).append(System.lineSeparator());
        });
        
        
        return sb.toString();
    }
    
}
