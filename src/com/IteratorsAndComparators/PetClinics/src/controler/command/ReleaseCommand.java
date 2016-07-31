/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler.command;

import controler.Core;
import interfaces.Clinic;
import interfaces.Room;

/**
 *
 * @author kalin
 */
public class ReleaseCommand extends Command{
    
    @Inject
    private String[] data;

    public ReleaseCommand(Core core) {
        super(core);
    }

    @Override
    public String execute() {
        
        Clinic currentClinic = this.getCore().getClinics().get(data[1]);
       
        boolean isRemoved = false;
        
        for (Room rooms : currentClinic.getReleaseIterator()) {
           
            if (rooms.getPet() != null) {
                rooms.removePet();
                isRemoved = true;
                break;
            }
            
        }
        
        return String.format("%s%n", isRemoved);
    }
    
}
