package com.Interfaces.Prob06_BirthdayCelebrations;

import com.Interfaces.Prob06_BirthdayCelebrations.interfaces.Migratable;
import com.Interfaces.Prob06_BirthdayCelebrations.models.controls.Checkpoint;
import com.Interfaces.Prob06_BirthdayCelebrations.models.unit.BiologicUnit;
import com.Interfaces.Prob06_BirthdayCelebrations.models.unit.Citizen;
import com.Interfaces.Prob06_BirthdayCelebrations.models.unit.Pet;
import com.Interfaces.Prob06_BirthdayCelebrations.models.unit.Population;
import com.Interfaces.Prob06_BirthdayCelebrations.models.unit.Robot;
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
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {

            String input;
            Checkpoint borderControl = new Checkpoint();
            List<Population> emigrants = new LinkedList<>();

            while (!(input = reader.readLine()).equals("End")) {
                
                String[] emigrant = input.split("\\s+");
                
                emigrants.add(registerEmigrant(emigrant));
            }

            input = reader.readLine();
            borderControl.setPattern(input);
            emigrants.forEach(em ->{
                if (em instanceof BiologicUnit) {
                    borderControl.checkBirthdates((BiologicUnit)em);
                }
            });

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static Population registerEmigrant(String[] emigrant) {
        String unit = emigrant[0];
        String name = emigrant[1];
        String id;
        int age;
        String birthdate;

        switch (unit) {
            case "Citizen":

                age = Integer.parseInt(emigrant[2]);
                id = emigrant[3];
                birthdate = emigrant[4];

                return new Citizen(name, age, id, birthdate);

            case "Robot":

                id = emigrant[2];
                return new Robot(name, id);

            case "Pet":
                birthdate = emigrant[2];
                return new Pet(name, birthdate);
                
            default:
                return null;
        }
    }

}
