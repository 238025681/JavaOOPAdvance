/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob09_CollectionHierarchy.models;

import com.Interfaces.Prob09_CollectionHierarchy.interfaces.Removeable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author chobi
 */
public class AddRemoveCollection implements Removeable{
    private LinkedList<String> myList;

    public AddRemoveCollection() {
        this.myList = new LinkedList<>();
    }
    
    

    @Override
    public int add(String element) {
        
        this.myList.addFirst(element);
        return this.myList.size() - this.myList.size();
    }

    @Override
    public List<String> remove(int index) {
        List<String> result = new ArrayList<>();
        int removeElements = this.myList.size() > index ? index : this.myList.size();
        for (int i = 0; i < removeElements; i++) {
            
            result.add(this.myList.removeLast());
            
        }
        return result;
    }
    
}
