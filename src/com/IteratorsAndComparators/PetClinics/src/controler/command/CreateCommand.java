package controler.command;

import controler.Core;

/**
 *
 * @author kalin
 */
public class CreateCommand extends Command {

    @Inject
    private String[] data;

    public CreateCommand(Core core) {
        super(core);
    }

    protected String[] getData() {
        
        return data;
    }
    

    @Override
    public String execute() {
        
        String command = data[1];
        String result = "";
        Command createPet;

        switch (command) {

            case "Pet":
                createPet = new CreatePetCommand(this.getCore(), this.getData());
                result = createPet.execute();

                break;

            case "Clinic":
                createPet = new CreateClinicCommand(this.getCore(), this.getData());
                result = createPet.execute();
                
                break;

        }

        return result;
    }

}
