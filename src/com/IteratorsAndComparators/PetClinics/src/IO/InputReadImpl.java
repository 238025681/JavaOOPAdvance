/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import interfaces.InputRead;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author kalin
 */
public class InputReadImpl implements InputRead  {

    
    @Override
    public BufferedReader bufferedReader(InputStream in) {

        return new BufferedReader(inStreamReader(in));
    }

    @Override
    public Scanner scanner(InputStream in) {

        return new Scanner(inStreamReader(in));
    }

    @Override
    public InputStreamReader inStreamReader(InputStream in) {
        return new InputStreamReader(in);
    }

}
