/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob04_Froggy.IO;

import com.IteratorsAndComparators.Prob04_Froggy.interfaces.WriterOutput;

/**
 *
 * @author kalin
 */
public class WriterOutputImpl implements WriterOutput {

    @Override
    public void print(String message) {

        System.out.print(message);
    }

    @Override
    public void printNewLine(String message) {
        System.out.println(message);
    }

    @Override
    public void printFormattedLine(String format, String message) {

        System.out.printf(format, message);

    }

}
