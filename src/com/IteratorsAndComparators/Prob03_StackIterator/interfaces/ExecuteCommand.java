package com.IteratorsAndComparators.Prob03_StackIterator.interfaces;

import com.IteratorsAndComparators.Prob03_StackIterator.controler.Core;

/**
 *
 * @author kalin
 */
public interface ExecuteCommand {

    void executePush(Core core, Integer element);

    void executePop(Core core);

    String executePrint(Core core);

}
