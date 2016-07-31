/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler.command;

import controler.Core;
import interfaces.Clinic;

/**
 *
 * @author kalin
 */
public class HasEmptyRoomsCommand extends Command{
    
    @Inject
    private String[] data;

    public HasEmptyRoomsCommand(Core core) {
        super(core);
    }

    @Override
    public String execute() {
        
        Clinic currentClinic = this.getCore().getClinics().get(data[1]);
        
        return String.format("%s%n", currentClinic.HasEmptyRooms());
        
    }
    
}
