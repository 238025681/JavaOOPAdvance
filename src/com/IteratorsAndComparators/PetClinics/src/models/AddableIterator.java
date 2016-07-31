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
public class AddableIterator extends CustomIterator<Room>{
    
    private int movementFactor;
    

    public AddableIterator(Clinic clinic) {
        super(clinic);
        this.movementFactor = 0;
    }

    @Override
    public Room next() {
        int currentIndex = this.getIndex();
        
        if (this.getIteratorIndex() % 2 == 0) {
            
            currentIndex += this.movementFactor;
            
            this.movementFactor++;
            
        }else {
            
            currentIndex -= this.movementFactor;
        }
        if (this.hasNext()) {
            
            Room currentClinic = this.getClinic().getRooms()[currentIndex];
            this.setIteratorIndex(this.getIteratorIndex() + 1);
            return currentClinic;
        }
        
        throw new NoSuchElementException();
    }
    
}
