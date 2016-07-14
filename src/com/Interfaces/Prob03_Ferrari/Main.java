
package com.Interfaces.Prob03_Ferrari;

import com.Interfaces.Prob03_Ferrari.interfaces.Ferrari;
import com.Interfaces.Prob03_Ferrari.models.FerrariImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author chobi
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            Ferrari newCar = new FerrariImpl(reader.readLine());
            
            System.out.println(newCar);            
        } catch (Exception e) {
        }
    }
    
}
