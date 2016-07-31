
package com.IteratorsAndComparators.Prob04_Froggy.models;

import com.IteratorsAndComparators.Prob04_Froggy.interfaces.Frog;
import com.IteratorsAndComparators.Prob04_Froggy.interfaces.Lake;
import java.util.NoSuchElementException;

public class FrogImpl<Integer> implements Frog<Integer> {

    private Lake lake;
    private int currentIndex;

    public FrogImpl(Lake lake) {
        this.setLake(lake);
        this.setCurrentIndex(0);
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    private void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Lake getLake() {
        return lake;
    }

    private void setLake(Lake lake) {
        this.lake = lake;
    }

    @Override
    public boolean hasNext() {
        
        if ((this.getCurrentIndex() % 2) == 0 && 
                this.getCurrentIndex() >= this.getLake().getLakeOfInteger().size()) {
            
             this.setCurrentIndex(1);
             
        }
        
        return this.getCurrentIndex() < this.getLake().getLakeOfInteger().size();

    }

    @Override
    public Integer next() {
        int index = this.currentIndex;
        
        if (this.hasNext()) {
            
            this.currentIndex += 2;
        
            return (Integer) this.getLake().getLakeOfInteger().get(index);
        }

        throw new NoSuchElementException();
    }
}
