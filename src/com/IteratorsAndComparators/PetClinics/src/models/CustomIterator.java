/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.Clinic;
import interfaces.Room;
import java.util.Iterator;

/**
 *
 * @author kalin
 * @param <Clinic>
 * 
 */
public abstract class CustomIterator<T> implements Iterable<Room>, Iterator<Room> {

    private Clinic clinic;
    private int IteratorIndex;
    private int index;

    public CustomIterator(Clinic clinic) {
        this.setClinic(clinic);
        this.setIteratorIndex(0);
        this.setIndex(this.getClinic().getRooms().length / 2);
       
    }

    protected int getIndex() {
        return index;
    }

    protected void setIndex(int index) {
        this.index = index;
    }

    
    protected Clinic getClinic() {
        return clinic;
    }

    private void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    protected void setIteratorIndex(int IteratorIndex) {
        this.IteratorIndex = IteratorIndex;
    }

    protected int getIteratorIndex() {
        return IteratorIndex;
    }
    
    
    
    
    

    public boolean hasNext() {
        return this.getClinic().getRooms().length > this.getIteratorIndex();
    }

    public void remove() {
    }

    public Iterator<Room> iterator() {
        return this;
    }

}
