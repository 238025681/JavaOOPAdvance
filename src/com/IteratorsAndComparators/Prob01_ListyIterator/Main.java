package com.IteratorsAndComparators.Prob01_ListyIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.IteratorsAndComparators.Prob01_ListyIterator.models.ListyIteratorImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 *
 * @author chobi
 */
public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            ListyIteratorImpl listyIterator = null;
            String inputString = reader.readLine();

            while (!inputString.equalsIgnoreCase("end")) {
                String[] input = inputString.split("[\\s]+");

                String command = input[0].toLowerCase();

                switch (command) {
                    case "create":

                        listyIterator = new ListyIteratorImpl(Arrays.copyOfRange(input, 1, input.length));
                        break;

                    case "move":
                        System.out.println(listyIterator.move());
                        break;

                    case "print":
                        System.out.println(listyIterator.print());
                        break;

                    case "hasnext":
                       
                        System.out.println(listyIterator.hasNext());
                        break;

                    default:
                        throw new AssertionError();
                }

                inputString = reader.readLine();

            }

        } catch (NoSuchElementException ne) {
            System.out.println(ne.getMessage());
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

   
}
