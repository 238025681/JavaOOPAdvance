
package models;

import interfaces.Pet;
import java.util.StringJoiner;


public class PetImpl implements Pet {
    
    private String name;
    private Integer age;
    private String kind;

    /**
     *
     * @param name
     * @param age
     * @param kind
     */
    public PetImpl(String name, int age, String kind) {
        this.setName(name);
        this.setAge(age);
        this.setKind(kind);
    }

    
    

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getKind() {
        return this.kind;
    }
    
    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
      
        StringJoiner sj = new StringJoiner(" ");
        
        sj.add(this.getName()).add(this.getAge().toString()).add(this.getKind());
        
        return sj.toString();
    }
    
    
    
}
