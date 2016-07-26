/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob03_StackIterator.models;

import com.IteratorsAndComparators.Prob03_StackIterator.exception.MyStackEmptyException;
import com.IteratorsAndComparators.Prob03_StackIterator.interfaces.Stack;
import com.IteratorsAndComparators.Prob03_StackIterator.interfaces.CustomsCollection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author kalin
 */
public class StackImpl<T> implements Stack<T> {

    private CustomsCollection<T> currentCollection;
    private int index;

    public StackImpl() {

        this.currentCollection = null;
    }

    @Override
    public T pop() {
        
        if (this.isEmpty()) {
            
            throw new MyStackEmptyException();
        }
        
        T returnValue = this.currentCollection.getData();
        this.currentCollection = this.currentCollection.getNext();
        this.index--;
        return returnValue;
    }

    @Override
    public void push(T number) {
        
        this.currentCollection = new CustomsCollectionImpl<>(number, this.currentCollection);
        this.index++;
    }

    @Override
    public T peek() {
        
        return this.currentCollection.getData();
    }

    @Override
    public int size() {
        
        return this.index;
    }

    @Override
    public boolean isEmpty() {
        
        return this.size() == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            CustomsCollection<T> collection = currentCollection;
          
            @Override
            public boolean hasNext() {
                
                return collection != null;
            }

            @Override
            public T next() {
                
                if (this.hasNext()) {
                    
                    T element = collection.getData();
                    collection = collection.getNext();
                    return element;
                }
                
                throw new NoSuchElementException();
            }
        };
    }

}
