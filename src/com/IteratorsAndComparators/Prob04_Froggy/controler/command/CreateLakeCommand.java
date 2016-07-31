/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob04_Froggy.controler.command;

import com.IteratorsAndComparators.Prob04_Froggy.controler.Core;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author kalin
 */
public class CreateLakeCommand extends Command {

    @Inject
    String[] data;

    public CreateLakeCommand(Core core) {
        super(core);
    }

    @Override
    public String execute() {
        List<Integer> numberToPush = Arrays.stream(this.data).map(Integer::parseInt).collect(Collectors.toList());

        numberToPush.stream().forEach((number) -> {
            
            this.getCore().getLake().getLakeOfInteger().add(number);
            
        });
        return "";
    }

}
