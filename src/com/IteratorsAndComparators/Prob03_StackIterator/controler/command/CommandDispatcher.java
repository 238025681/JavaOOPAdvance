/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob03_StackIterator.controler.command;

import com.IteratorsAndComparators.Prob03_StackIterator.controler.Core;
import com.IteratorsAndComparators.Prob03_StackIterator.IO.WriterOutputImpl;
import com.IteratorsAndComparators.Prob03_StackIterator.exception.MyStackEmptyException;
import com.IteratorsAndComparators.Prob03_StackIterator.interfaces.ExecuteCommand;
import com.IteratorsAndComparators.Prob03_StackIterator.interfaces.WriterOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kalin
 */
public final class CommandDispatcher {

    private Core core;
    private ExecuteCommand executeCommand;
    private WriterOutput writerOutput;

    public CommandDispatcher(Core core) {

        this.setCore(core);
        this.setWriterOutput();
        this.setExecuteCommand();
    }

    public Core getCore() {
        return core;
    }

    private void setCore(Core core) {
        this.core = core;
    }

    public WriterOutput getWriterOutput() {
        return writerOutput;
    }

    private void setWriterOutput() {
        this.writerOutput = new WriterOutputImpl();
    }

    public ExecuteCommand getExecuteCommand() {
        return executeCommand;
    }

    private void setExecuteCommand() {
        this.executeCommand = new ExecuteCommandImpl();
    }

    public void dispatch(String command, String... parameters) {
        List<Integer> numberToPush = Arrays.stream(parameters).skip(1).map(Integer::parseInt).collect(Collectors.toList());

        switch (command.toLowerCase()) {

            case "push":

                for (Integer element : numberToPush) {
                    this.getExecuteCommand().executePush(this.core, element);
                }

                break;

            case "pop":
                try {

                    this.getExecuteCommand().executePop(this.core);

                } catch (MyStackEmptyException mse) {
                    this.getWriterOutput().printNewLine(mse.getMessage());
                }

                break;

            case "end":

                this.getWriterOutput().print(this.executeCommand.executePrint(this.core));

                while (!this.core.getCurrentStack().isEmpty()) {

                    this.getWriterOutput().printNewLine(this.core.getCurrentStack().peek().toString());
                    
                    try {
                        this.core.getCurrentStack().pop();
                    } catch (MyStackEmptyException mse) {

                        this.getWriterOutput().printNewLine(mse.getMessage());
                    }

                }

                this.core.stop();

                break;

        }

    }

}
