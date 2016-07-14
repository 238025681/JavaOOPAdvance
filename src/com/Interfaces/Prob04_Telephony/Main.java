/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces.Prob04_Telephony;

import com.Interfaces.Prob04_Telephony.models.Smartphone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author chobi
 */
public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            Smartphone phone = new Smartphone("LG");
            
            phone.makeCall(reader.readLine().split(" "));
            phone.brows(reader.readLine().split(" "));
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }

}
