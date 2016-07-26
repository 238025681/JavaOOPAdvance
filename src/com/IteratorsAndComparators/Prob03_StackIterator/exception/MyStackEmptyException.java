/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob03_StackIterator.exception;

/**
 *
 * @author kalin
 */
public class MyStackEmptyException extends RuntimeException{

    public MyStackEmptyException() {
        super("No elements");
    }
    
    
}
