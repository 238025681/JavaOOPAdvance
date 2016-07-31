/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler.command;

import controler.Core;
import models.PetImpl;

/**
 *
 * @author kalin
 */
public class CreatePetCommand extends CreateCommand {
    private String[] data;

    public CreatePetCommand(Core core, String... data) {
        super(core);
        this.data = data;
       
    }

    @Override
    public String execute() {

        String petName = this.data[2];
        
        int petAge = Integer.parseInt(this.data[3]);
        
        String petKind = this.data[4];
        
         this.getCore().getPets().put(petName, new PetImpl(petName, petAge, petKind));

        return "";
    }

}
