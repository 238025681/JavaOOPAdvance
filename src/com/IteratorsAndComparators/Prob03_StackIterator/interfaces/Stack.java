/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob03_StackIterator.interfaces;

/**
 *
 * @author kalin
 */
public interface Stack<T> extends Iterable<T>{

    T pop();

    void push(T number);

    T peek();

    int size();

    boolean isEmpty();
}
