
package com.Generics.Prob01_GenericBox.models;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author chobi
 */
public class ClassInfo<T>{
    
    
    public static <T> void inputInfo(T element){
    
        System.out.println(element.getClass().getName().toString() + ": " + element);
    
    }
    public static<T> void swapElement(List<T> args, int firs, int second) {
       
        Collections.swap(args, firs, second);
        args.forEach(s -> inputInfo(s));
        
    }
    
    public static<T extends Comparable> int compareElement(List<T> args, T element) {
        int count = 0;
        for (T arg : args) {
            if (element.compareTo(arg) < 0) {
                count++;
            }
        }
        return count;
    }
    
    
}
