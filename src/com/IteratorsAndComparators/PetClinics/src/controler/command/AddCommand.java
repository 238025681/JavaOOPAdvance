package controler.command;

import controler.Core;
import exception.MyException;
import interfaces.Clinic;
import interfaces.Pet;
import interfaces.Room;

/**
 *
 * @author kalin
 */
public class AddCommand extends Command {

    @Inject
    private String[] data;

    public AddCommand(Core core) {
        super(core);
    }

    @Override
    public String execute() {
        //Add Gosho Rizovo
        String petName = data[1];
        String clinicName = data[2];

        Clinic currentClinic = this.getCore().getClinics().get(clinicName);
        if (!this.getCore().getPets().containsKey(petName) || !this.getCore().getClinics().containsKey(clinicName)) {
            throw new MyException();
        }
        
        Pet currentPet = this.getCore().getPets().get(petName);

        boolean isSuccess = false;

        for (Room room : this.getCore().getClinics().get(clinicName).getAddableIterator()) {
            if (room.getPet() == null) {
                room.addPet(currentPet);

                isSuccess = true;
                break;
            }

        }

        return String.format("%s%n", isSuccess);
    }

}
