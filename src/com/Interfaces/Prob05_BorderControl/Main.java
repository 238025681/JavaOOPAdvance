/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob05_BorderControl;

import com.Interfaces.Prob05_BorderControl.interfaces.Migratable;
import com.Interfaces.Prob05_BorderControl.models.controls.Checkpoint;
import com.Interfaces.Prob05_BorderControl.models.unit.Citizen;
import com.Interfaces.Prob05_BorderControl.models.unit.Robot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author chobi
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            
            String input;
            Checkpoint borderControl = new Checkpoint();
            List<Migratable> emigrants = new LinkedList<>();
            
            while (!(input = reader.readLine()).equals("End")) {
                String[] emigrant = input.split("\\s+");
                registerEmigrant(emigrant, emigrants);
            }
            
            input = reader.readLine();
            borderControl.setPattern(input);
           
            for (Migratable emigrant : emigrants) {
                borderControl.checkId(emigrant);
            }
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static void registerEmigrant(String[] emigrant, List<Migratable> emigrants) {
        String name = emigrant[0];
        Migratable unit = null;
        if (emigrant.length == 3) {
            
            int age = Integer.parseInt(emigrant[1]);
            String id = emigrant[2];
            
            unit = new Citizen(name, age, id);
            
        } else if (emigrant.length == 2) {
            
            String id = emigrant[1];
            unit = new Robot(name, id);
        }
        
        emigrants.add(unit);
    }
    
}
