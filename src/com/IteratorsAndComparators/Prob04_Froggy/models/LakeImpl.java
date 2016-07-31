/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob04_Froggy.models;

import com.IteratorsAndComparators.Prob04_Froggy.interfaces.Lake;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LakeImpl<Integer> implements Lake<Integer> {
    
    private List<Integer> LakeOfInteger;

    public LakeImpl() {
        this.LakeOfInteger = new ArrayList<>();
    }

    public List<Integer> getLakeOfInteger() {
        return LakeOfInteger;
    }

    public void setLakeOfInteger(List<Integer> LakeOfInteger) {
        this.LakeOfInteger = LakeOfInteger;
    }
    
    
    
    @Override
    public Iterator<Integer> iterator() {
        return new FrogImpl<>(this);
    }

    
}
