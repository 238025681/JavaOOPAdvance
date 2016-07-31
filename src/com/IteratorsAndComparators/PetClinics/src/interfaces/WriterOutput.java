/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author kalin
 */
public interface WriterOutput {

    void print(String message);

    void printNewLine(String message);
    
    void printFormattedLine(String format, String message);
}
