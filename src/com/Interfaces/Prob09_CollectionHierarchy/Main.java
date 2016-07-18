package com.Interfaces.Prob09_CollectionHierarchy;

import com.Interfaces.Prob09_CollectionHierarchy.interfaces.Addable;
import com.Interfaces.Prob09_CollectionHierarchy.models.AddCollection;
import com.Interfaces.Prob09_CollectionHierarchy.models.AddRemoveCollection;
import com.Interfaces.Prob09_CollectionHierarchy.models.MyList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 *
 * @author chobi
 */
public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            List<Addable> myCollections = new ArrayList<>();

            Addable addCollection = new AddCollection();
            myCollections.add(addCollection);

            Addable addRemoveCollection = new AddRemoveCollection();
            myCollections.add(addRemoveCollection);

            Addable myList = new MyList();
            myCollections.add(myList);

            String[] input = reader.readLine().split(" ");
            int removeIndex = Integer.parseInt(reader.readLine());

            System.out.println(addElements(input, myCollections));
            
            
            
            myCollections.forEach(m -> {
                if (m instanceof AddRemoveCollection) {
                    System.out.println(((AddRemoveCollection) m).remove(removeIndex)
                                                                .toString()
                                                                .replace("[", "")
                                                                .replace("]", "")
                                                                .replace(",", ""));
                }
            
            });
            
            myCollections.forEach(m -> {
                if (m instanceof MyList) {
                    System.out.println(((MyList) m).remove(removeIndex)
                                                                .toString()
                                                                .replace("[", "")
                                                                .replace("]", "")
                                                                .replace(",", ""));
                }
            
            });

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static String addElements(String[] input, List<Addable> myCollections) {

        StringJoiner addCollect = new StringJoiner(" ");
        StringJoiner addRemoveCollect = new StringJoiner(" ");
        StringJoiner myList = new StringJoiner(" ");

        for (int i = 0; i < input.length; i++) {
            String currentString = input[i];

            myCollections.forEach(m -> {

                if (m instanceof AddCollection) {
                    addCollect.add(String.format("%d", m.add(currentString)));
                }

                if (m instanceof AddRemoveCollection) {
                    addRemoveCollect.add(String.format("%d", m.add(currentString)));
                }

                if (m instanceof MyList) {
                    myList.add(String.format("%d", m.add(currentString)));
                }
            });

        }
        StringBuilder sb = new StringBuilder();
        sb.append(addCollect)
                .append(System.lineSeparator())
                .append(addRemoveCollect)
                .append(System.lineSeparator())
                .append(myList);

        return sb.toString();
    }

}
