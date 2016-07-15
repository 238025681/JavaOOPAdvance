package com.Interfaces.Prob08_MilitaryElite;

import com.Interfaces.Prob08_MilitaryElite.interfaces.Private;
import com.Interfaces.Prob08_MilitaryElite.interfaces.Soldier;
import com.Interfaces.Prob08_MilitaryElite.models.Commando;
import com.Interfaces.Prob08_MilitaryElite.models.Engineer;
import com.Interfaces.Prob08_MilitaryElite.models.LeutenantGeneralImpl;
import com.Interfaces.Prob08_MilitaryElite.models.Missions;
import com.Interfaces.Prob08_MilitaryElite.models.PrivateImpl;
import com.Interfaces.Prob08_MilitaryElite.models.Repairs;
import com.Interfaces.Prob08_MilitaryElite.models.Spy;
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

    private static List<Soldier> soldiers;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            soldiers = new LinkedList<>();
            String input;

            while (!(input = reader.readLine()).equals("End")) {

                String[] commands = input.split("\\s+");
                
                if (commands[0].equals("Engineer") || commands[0].equals("Commando")) {

                    if (!(commands[5].equals("Airforces")) && !(commands[5].equals("Marines"))) {

                        continue;

                    }

                }
                
                soldiers.add(createSoldier(commands));

            }
            soldiers.forEach(System.out::println);

        } catch (IOException ioe) {
            System.out.println(ioe.getStackTrace());
        }
    }

    private static Soldier createSoldier(String[] commands) {

        String unit = commands[0];
        int id = Integer.parseInt(commands[1]);
        String firstName = commands[2];
        String lastName = commands[3];
        double salary;
        String corps;

        switch (unit) {

            case "Private":
                salary = Double.parseDouble(commands[4]);
                return new PrivateImpl(id, firstName, lastName, salary);

            case "LeutenantGeneral":

                salary = Double.parseDouble(commands[4]);
                List<Private> privates = getPrivates(commands);
                return new LeutenantGeneralImpl(id, firstName, lastName, salary, privates);

            case "Engineer":

                salary = Double.parseDouble(commands[4]);
                corps = commands[5];
                List<Repairs> repairses = getRepairs(commands);

                return new Engineer(id, firstName, lastName, salary, corps, repairses);

            case "Commando":

                salary = Double.parseDouble(commands[4]);
                corps = commands[5];

                List<Missions> missionses = getMission(commands);
                return new Commando(id, firstName, lastName, salary, corps, missionses);

            case "Spy":
                int codeNumber = Integer.parseInt(commands[4]);

                return new Spy(id, firstName, lastName, codeNumber);

            default:
                return null;

        }

    }

    private static List<Private> getPrivates(String[] commands) {
        List<Private> currentList = new LinkedList<>();
        for (int i = 5; i < commands.length; i++) {

            int privateID = Integer.parseInt(commands[i]);
            Private tempPrivate = (Private) soldiers.stream().filter(s -> s.getId() == privateID).findFirst().orElse(null);
            currentList.add(tempPrivate);

        }
        return currentList;
    }

    private static List<Repairs> getRepairs(String[] commands) {

        List<Repairs> tempRepairses = new LinkedList();
        for (int i = 6; i < commands.length; i += 2) {
            String partName = commands[i];
            int workedHour = Integer.parseInt(commands[i + 1]);
            tempRepairses.add(new Repairs(partName, workedHour));
        }

        return tempRepairses;
    }

    private static List<Missions> getMission(String[] commands) {
        List<Missions> tempMissionses = new LinkedList<>();
        for (int i = 6; i < commands.length; i += 2) {
            String codeName = commands[i];
            String state = commands[i + 1];
            if (state.equals("inProgress") || state.equals("Finished")) {
                tempMissionses.add(new Missions(codeName, state));
            }

        }
        return tempMissionses;
    }

}
