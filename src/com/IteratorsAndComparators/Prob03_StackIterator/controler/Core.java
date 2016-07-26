/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob03_StackIterator.controler;

import com.IteratorsAndComparators.Prob03_StackIterator.IO.InputReadImpl;
import com.IteratorsAndComparators.Prob03_StackIterator.controler.command.CommandDispatcher;
import com.IteratorsAndComparators.Prob03_StackIterator.interfaces.Stack;
import com.IteratorsAndComparators.Prob03_StackIterator.models.StackImpl;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author kalin
 */
public class Core {

    private BufferedReader reader;
    private boolean runnig;
    private CommandDispatcher dispatcher;
    private Stack<Integer> currentStack;

    public Core() {
        this.setReader();
        this.setRunnig();
        this.setDispatcher();
        this.setCurrentStack();
    }

    public BufferedReader getReader() {
        return reader;
    }

    private void setReader() {

        this.reader = new InputReadImpl().bufferedReader(System.in);
    }

    public boolean isRunnig() {
        return runnig;
    }

    private void setRunnig() {
        this.runnig = true;
    }

    public CommandDispatcher getDispatcher() {
        return dispatcher;
    }

    private void setDispatcher() {
        
        this.dispatcher = new CommandDispatcher(this);
    }

    public Stack getCurrentStack() {
        return currentStack;
    }

    private void setCurrentStack() {
        
        this.currentStack = new StackImpl<>();
    }

    
    public void run() throws IOException {
        
        

        while (runnig) {
            
            String[] token = reader.readLine().split("[ ,]+");
           
            this.getDispatcher().dispatch(token[0], token);
        
        }

    }

    public void stop() {

        this.runnig = false;
    }

}
