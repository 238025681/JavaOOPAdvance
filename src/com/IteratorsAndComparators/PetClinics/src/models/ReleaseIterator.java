/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.Clinic;
import interfaces.Room;
import java.util.NoSuchElementException;

/**
 *
 * @author kalin
 */
public class ReleaseIterator extends CustomIterator<Room> {

    public ReleaseIterator(Clinic clinic) {
        super(clinic);

    }

    @Override
    public Room next() {
        
        if (this.getIndex() == this.getClinic().getRooms().length) {
            this.setIndex(0);
        }
        
        if (this.hasNext()) {
            
            Room currentClinic = this.getClinic().getRooms()[this.getIndex()];
            this.setIteratorIndex(this.getIteratorIndex() + 1);
            this.setIndex(this.getIndex() + 1);
            return currentClinic;
        }
        
        throw new NoSuchElementException();
    }

}
