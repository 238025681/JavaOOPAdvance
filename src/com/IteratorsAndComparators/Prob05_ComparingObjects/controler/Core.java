package com.IteratorsAndComparators.Prob05_ComparingObjects.controler;

import com.IteratorsAndComparators.Prob05_ComparingObjects.IO.InputReadImpl;
import com.IteratorsAndComparators.Prob05_ComparingObjects.IO.WriterOutputImpl;
import com.IteratorsAndComparators.Prob05_ComparingObjects.controler.command.CommandDispatcher;
import com.IteratorsAndComparators.Prob05_ComparingObjects.interfaces.Executable;
import com.IteratorsAndComparators.Prob05_ComparingObjects.interfaces.InputRead;
import com.IteratorsAndComparators.Prob05_ComparingObjects.interfaces.Person;
import com.IteratorsAndComparators.Prob05_ComparingObjects.interfaces.WriterOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kalin
 */
public class Core {

    private InputRead reader;
    private boolean runnig;
    private CommandDispatcher dispatcher;
    private WriterOutput writerOutput;

    List<Person> person;

    public Core() {
        this.setReader(new InputReadImpl());
        this.setRunnig(true);
        this.setDispatcher(new CommandDispatcher(this));
        this.setWriterOutput(new WriterOutputImpl());
        this.person = new ArrayList<>();

    }

    public List<Person> getPerson() {
        return person;
    }

    public void addPerson(Person person) {
        this.person.add(person);
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

    private void setReader(InputRead reader) {

        this.reader = reader;
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

        BufferedReader read = this.getReader().bufferedReader(System.in);

        String result = "";

        while (runnig) {

            String[] token = read.readLine().split("[ ,]+");

            if (!token[0].equalsIgnoreCase("end")) {

                Executable command = this.getDispatcher().dispatch("AddPerson", token);

                result = command.execute();

            } else {

                token = read.readLine().split("[ ,]+");

                Executable command = this.getDispatcher().dispatch("End", token);

                result = command.execute();

                this.stop();
            }

            if (result.equals("")) {

                continue;
            }

            this.getWriterOutput().printNewLine(result);

        }


    }

    public void stop() {

        this.runnig = false;
    }


}
