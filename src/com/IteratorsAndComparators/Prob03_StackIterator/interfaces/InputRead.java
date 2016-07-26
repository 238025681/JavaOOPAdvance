
package com.IteratorsAndComparators.Prob03_StackIterator.interfaces;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author kalin
 */
public interface InputRead {
    
     public BufferedReader bufferedReader(InputStream in);
     
     
     
      public Scanner scanner(InputStream in);
      
     
      
       public InputStreamReader inStreamReader(InputStream in);
        // new InputStreamReader(in);
    
}
