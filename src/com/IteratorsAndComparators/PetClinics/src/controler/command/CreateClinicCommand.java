package controler.command;

import controler.Core;
import exception.MyException;
import models.ClinicImpl;

/**
 *
 * @author kalin
 */
public class CreateClinicCommand extends CreateCommand {
    
    private String[] data;

    public CreateClinicCommand(Core core, String... data) {
        super(core);
        this.data = data;
    }

    @Override
    public String execute() {

        String clinicName = this.data[2];
        int clinicRooms = Integer.parseInt(this.data[3]);
        try {
            
        this.getCore().getClinics().put(clinicName, new ClinicImpl(clinicName, clinicRooms));
        
        } catch (MyException e) {
            System.out.println(e.getMessage());
            return "";
        }
        
        return "";
    }

}
