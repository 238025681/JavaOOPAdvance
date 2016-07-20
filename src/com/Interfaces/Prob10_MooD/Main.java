/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob10_MooD;

import com.Interfaces.Prob10_MooD.models.Archangel;
import com.Interfaces.Prob10_MooD.models.CharactersImpl;
import com.Interfaces.Prob10_MooD.models.Demon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chobi
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            CharactersImpl newCharacters = null;
        String[] input = reader.readLine().split(" \\| ");
        
            newCharacters = createCharacter(input, newCharacters);
                       
            System.out.println(newCharacters);
        
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
    

    private static CharactersImpl createCharacter(String[] input, CharactersImpl newCharacters) throws NumberFormatException, AssertionError {
        switch (input[1]) {
            case "Demon":
                newCharacters = new Demon(input[0], Integer.parseInt(input[3]), Double.parseDouble(input[2]));
                break;
            case "Archangel":
                newCharacters = new Archangel(input[0], Integer.parseInt(input[3]), Double.parseDouble(input[2]));
                break;
            default:
                throw new AssertionError();
        }
        return newCharacters;
    }
    
}
