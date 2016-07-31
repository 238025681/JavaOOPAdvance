/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob04_Froggy.controler;

import com.IteratorsAndComparators.Prob04_Froggy.IO.InputReadImpl;
import com.IteratorsAndComparators.Prob04_Froggy.IO.WriterOutputImpl;
import com.IteratorsAndComparators.Prob04_Froggy.controler.command.CommandDispatcher;
import com.IteratorsAndComparators.Prob04_Froggy.interfaces.Executable;
import com.IteratorsAndComparators.Prob04_Froggy.interfaces.InputRead;
import com.IteratorsAndComparators.Prob04_Froggy.interfaces.Lake;
import com.IteratorsAndComparators.Prob04_Froggy.interfaces.WriterOutput;
import com.IteratorsAndComparators.Prob04_Froggy.models.LakeImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringJoiner;

/**
 *
 * @author kalin
 */
public class Core {

    private InputRead reader;
    private boolean runnig;
    private CommandDispatcher dispatcher;
    private WriterOutput writerOutput;
    
    private Lake lake;


    public Core() {
        this.setReader(new InputReadImpl());
        this.setRunnig(true);
        this.setDispatcher(new CommandDispatcher(this));
        this.setWriterOutput(new WriterOutputImpl());
        this.setLake(new LakeImpl());
    }
    
    
    public Lake getLake() {
        return lake;
    }

    private void setLake(Lake lake) {
        this.lake = lake;
    }

    public WriterOutput getWriterOutput() {
        return writerOutput;
    }

    private void setWriterOutput(WriterOutput output) {
        this.writerOutput = output;
    }

    public InputRead getReader() {
        return reader;
    }

    private void setReader(InputRead read) {

        this.reader = read;
    }

    public boolean isRunnig() {
        return runnig;
    }

    private void setRunnig(boolean running) {
        this.runnig = running;
    }

    public CommandDispatcher getDispatcher() {
        return dispatcher;
    }

    private void setDispatcher(CommandDispatcher dispatcher) {

        this.dispatcher = dispatcher;
    }

    public void run() throws IOException {
        
        BufferedReader currentReader = this.getReader().bufferedReader(System.in);
        
        String result = "";
        while (runnig) {

            String[] token = currentReader.readLine().split("[ ,]+");

            if (!token[0].equalsIgnoreCase("end")) {
                
             Executable command = this.getDispatcher().dispatch("CreateLake", token);
             
             result = command.execute();
                
            } else {
                
                this.stop();
            }

            

            if (result.equals("")) {

                continue;
            }

            this.getWriterOutput().print(result);

        }

        this.writerOutput.printNewLine(finalRsult());

    }

    public void stop() {

        this.runnig = false;
    }

    private String finalRsult() {

        
        StringJoiner sj = new StringJoiner(", ");
        this.getLake().forEach(s ->{
            
            sj.add(s.toString());
            
        });

        return sj.toString();
    }

}
