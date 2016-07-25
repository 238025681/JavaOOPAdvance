
package com.IteratorsAndComparators.Prob01_ListyIterator.models;

import com.IteratorsAndComparators.Prob01_ListyIterator.interfaces.ListyIterator;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author chobi
 */
public class ListyIteratorImpl<T> implements ListyIterator<T>{
    
    List<T> currenList;
    private int currentIndex;

    public ListyIteratorImpl(T[] currenList) {
        this.setCurrenList(currenList);
        this.setCurrentIndex(0);
    }

    public List<T> getCurrenList() {
        return this.currenList;
    }

    private void setCurrenList(T[] currenList) {
        
        this.currenList = Arrays.asList(currenList);
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    private void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
    

    @Override
    public boolean move() {
        
        if (hasNext()) {
            this.setCurrentIndex(this.getCurrentIndex() + 1);
            return true;
        }
        
        return false;
    }

    @Override
    public T print() {
        if (!this.currenList.isEmpty()) {
            
            return this.currenList.get(this.currentIndex);
            
        }
        throw new IllegalStateException("Invalid Operation!");
    }

    @Override
    public boolean hasNext() {
        
        return this.getCurrentIndex() < this.currenList.size() - 1;
        
    }

    @Override
    public T next() {
        if (hasNext()) {
            
            int currentElement = this.getCurrentIndex();
            this.setCurrentIndex(this.getCurrentIndex() + 1);
            
            return this.getCurrenList().get(currentElement);
        }
        
        throw new NoSuchElementException();
    }

   
}
