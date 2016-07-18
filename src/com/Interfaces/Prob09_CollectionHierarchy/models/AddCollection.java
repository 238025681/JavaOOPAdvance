/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob09_CollectionHierarchy.models;

import com.Interfaces.Prob09_CollectionHierarchy.interfaces.Addable;
import java.util.LinkedList;

/**
 *
 * @author chobi
 */
public class AddCollection implements Addable{
    private LinkedList<String> myList;

    public AddCollection() {
        this.myList = new LinkedList<>();
    }
    
    

    @Override
    public int add(String element) {
        
        this.myList.addLast(element);
        return this.myList.size() - 1;
    }
    
}
