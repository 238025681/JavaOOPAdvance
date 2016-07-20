package com.Generics.Prob01_GenericBox;

import com.Generics.Prob01_GenericBox.models.ClassInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chobi
 */
public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            List<Double> inputList = new ArrayList<>();

            int inputLine = Integer.parseInt(reader.readLine());
            for (int i = 0; i < inputLine; i++) {

                inputList.add(Double.parseDouble(reader.readLine()));
            }

            Double inputString = Double.parseDouble(reader.readLine());
            
            System.out.println(ClassInfo.compareElement(inputList, inputString));

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
