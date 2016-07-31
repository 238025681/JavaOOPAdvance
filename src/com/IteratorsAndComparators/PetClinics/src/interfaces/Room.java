package interfaces;

/**
 *
 * @author kalin
 * @param <Pet>
 */
public interface Room<Pet> {

    void addPet(Pet pet);

    void removePet();

    public Pet getPet();

    String print();
    

}
