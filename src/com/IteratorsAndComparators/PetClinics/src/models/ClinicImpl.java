/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import exception.MyException;
import interfaces.Clinic;
import interfaces.Room;

public class ClinicImpl implements Clinic {

    private String name;
    private Room[] rooms;
    private AddableIterator addableIterator;
    private ReleaseIterator releaseIterator;

    public ClinicImpl(String name, int numberOfRooms) {
        
        this.setRooms(numberOfRooms);
        this.setName(name);
        this.setAddableIterator(new AddableIterator(this));
        this.setReleaseIterator(new ReleaseIterator(this));

    }

    public AddableIterator getAddableIterator() {
        return addableIterator;
    }

    public ReleaseIterator getReleaseIterator() {
        return releaseIterator;
    }
    
    

    private void setAddableIterator(AddableIterator addableIterator) {
        this.addableIterator = addableIterator;
    }

    private void setReleaseIterator(ReleaseIterator releaseIterator) {
        this.releaseIterator = releaseIterator;
    }
    

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {

        this.name = name;
    }

    @Override
    public Room[] getRooms() {

        return this.rooms;
    }

    private void setRooms(int numberOfRooms) {

        if (numberOfRooms % 2 != 0) {

            this.rooms = new Room[numberOfRooms];
            
            for (int i = 0; i < numberOfRooms; i++) {
            
                this.getRooms()[i] = new RoomImpl();
                
            }

        } else {

            throw new MyException();
        }

    }
  
    @Override
    public String print() {
        
        StringBuilder sb = new StringBuilder();
        
        for (Room room : this.getRooms()) {
            if (room.getPet() == null) {
                sb.append("Room empty").append(System.lineSeparator());
            }else{
                sb.append(room).append(System.lineSeparator());
            }
        }
        
        return sb.toString();
    }

    @Override
    public boolean HasEmptyRooms() {
        
       boolean isEmptyRoom = false;
       
        for (Room room : rooms) {
            if (room.getPet() == null) {
                isEmptyRoom = true;
                break;
            }
        }
        return isEmptyRoom;
    }

  

   
    
    

}
