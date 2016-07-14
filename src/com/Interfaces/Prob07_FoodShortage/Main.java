package com.Interfaces.Prob07_FoodShortage;

import com.Interfaces.Prob07_FoodShortage.interfaces.Birthable;
import com.Interfaces.Prob07_FoodShortage.interfaces.Buyer;
import com.Interfaces.Prob07_FoodShortage.models.controls.Checkpoint;
import com.Interfaces.Prob07_FoodShortage.models.unit.Citizen;
import com.Interfaces.Prob07_FoodShortage.models.unit.Humman;
import com.Interfaces.Prob07_FoodShortage.models.unit.Pet;
import com.Interfaces.Prob07_FoodShortage.models.unit.Population;
import com.Interfaces.Prob07_FoodShortage.models.unit.Rebel;
import com.Interfaces.Prob07_FoodShortage.models.unit.Robot;
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

            int peopleNum = Integer.parseInt(reader.readLine());
            String input;

            Checkpoint borderControl = new Checkpoint();
            List<Humman> buyers = new LinkedList<>();

            for (int i = 0; i < peopleNum; i++) {

                String[] candidats = reader.readLine().split("\\s+");

                buyers.add(registerHumans(candidats));
            }
            while (!(input = reader.readLine()).equals("End")) {

                borderControl.setPattern(input);
                Humman buyer = buyers
                        .stream()
                        .filter(s -> s.getName().equals(borderControl.getPattern()))
                        .findFirst()
                        .orElse(null);

                if (!(buyer == null)) {
                    borderControl.sellFood(buyer);
                }
            }
            
            int totalFoodbuys = buyers.stream().mapToInt(b -> b.getFood()).sum();
            System.out.println(totalFoodbuys);

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static Birthable registerEmigrant(String[] emigrant) {
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

            
            case "Pet":
                birthdate = emigrant[2];
                return new Pet(name, birthdate);

            default:
                return null;
        }
    }

    private static Humman registerHumans(String[] candidats) {

        String name = candidats[0];
        int age = Integer.parseInt(candidats[1]);

        if (candidats.length == 4) {

            String id = candidats[2];
            String birthdate = candidats[3];

            return new Citizen(name, age, id, birthdate);

        } else if (candidats.length == 3) {

            String group = candidats[2];

            return new Rebel(name, age, group);
        }
        return null;

    }

}
