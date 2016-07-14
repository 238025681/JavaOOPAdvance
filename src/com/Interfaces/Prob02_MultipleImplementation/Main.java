package com.Interfaces.Prob02_MultipleImplementation;

import com.Interfaces.Prob02_MultipleImplementation.interfaces.Birthable;
import com.Interfaces.Prob02_MultipleImplementation.interfaces.Identifiable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chobi
 */
public class Main {

    public static void main(String[] args) {
        Class[] citizenInterfaces = com.Interfaces.Prob02_MultipleImplementation.models.Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
            Method[] methods = Birthable.class.getDeclaredMethods();
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            methods = Identifiable.class.getDeclaredMethods();
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthdate = scanner.nextLine();
            Identifiable identifiable = new com.Interfaces.Prob02_MultipleImplementation.models.Citizen(name, age, id, birthdate);
            Birthable birthable = new com.Interfaces.Prob02_MultipleImplementation.models.Citizen(name, age, id, birthdate);
        }
    }

}
