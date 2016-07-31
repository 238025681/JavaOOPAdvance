/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IteratorsAndComparators.Prob04_Froggy.controler.command;

import com.IteratorsAndComparators.Prob04_Froggy.controler.Core;
import com.IteratorsAndComparators.Prob04_Froggy.interfaces.Executable;

/**
 *
 * @author kalin
 */
public abstract class Command implements Executable {

    private Core core;

    protected Command(Core core) {

        this.setCore(core);
    }

    public Core getCore() {
        return core;
    }

    private void setCore(Core core) {
        this.core = core;
    }

}
