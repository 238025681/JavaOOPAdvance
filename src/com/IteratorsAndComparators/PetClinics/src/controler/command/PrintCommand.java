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
public class PrintCommand extends Command {

    @Inject
    private String[] data;

    public PrintCommand(Core core) {
        super(core);
    }

    @Override
    public String execute() {
        String clinicName = data[1];
        Clinic currentClinic = this.getCore().getClinics().get(clinicName);
        String printed = "";
        if (data.length > 2) {
            
            if (currentClinic.getRooms()[Integer.parseInt(data[2]) - 1].getPet() == null) {
                printed = String.format( "Room empty%n");
            }else{
                printed = String.format("%s%n", currentClinic.getRooms()[Integer.parseInt(data[2]) - 1].print());
            }
            

        } else {

            printed = currentClinic.print();

        }
        return printed;
    }

}
