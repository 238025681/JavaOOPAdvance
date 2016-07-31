package models;

import interfaces.Room;

public class RoomImpl<Pet> implements Room<Pet> {
    
    private Pet pet;

    public RoomImpl() {
    
    }

    @Override
    public Pet getPet() {
        
        return pet;
    }

   
    
     @Override
    public void addPet(Pet pet) {
     
        this.pet = pet;

    }

    @Override
    public void removePet() {

        this.pet = null;

    }

    @Override
    public String print() {
      
        return this.toString();
    }

    @Override
    public String toString() {
        return pet.toString();
    }

   

 
}


