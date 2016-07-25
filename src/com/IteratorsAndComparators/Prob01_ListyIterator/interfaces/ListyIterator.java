
package com.IteratorsAndComparators.Prob01_ListyIterator.interfaces;

import java.util.Iterator;

/**
 *
 * @author chobi
 */
public interface ListyIterator<T> extends Iterator<T>{
    
    boolean move(); 
    
    T print(); 
    
}
