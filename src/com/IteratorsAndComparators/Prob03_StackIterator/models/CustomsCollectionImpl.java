/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob03_StackIterator.models;

import com.IteratorsAndComparators.Prob03_StackIterator.interfaces.CustomsCollection;

/**
 *
 * @author kalin
 */
public class CustomsCollectionImpl<T> implements CustomsCollection<T> {

    private CustomsCollection<T> next;
    private T data;

    public CustomsCollectionImpl(T data, CustomsCollection<T> next) {
        this.setNext(next);
        this.data = data;
    }

    @Override
    public CustomsCollection<T> getNext() {
        
        return this.next;
    }

    @Override
    public void setNext(CustomsCollection<T> next) {
        
        this.next = next;
    }

    @Override
    public T getData() {
        
        return this.data;
    }

    @Override
    public void setData(T data) {
        
        this.data = data;
    }

}
