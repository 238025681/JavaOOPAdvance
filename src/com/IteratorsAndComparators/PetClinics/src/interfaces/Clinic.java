/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.AddableIterator;
import models.ReleaseIterator;

/**
 *
 * @author kalin
 */
public interface Clinic {

    public String getName();

    public Room[] getRooms();

    String print();

    boolean HasEmptyRooms();

    public ReleaseIterator getReleaseIterator();

    public AddableIterator getAddableIterator();

}
