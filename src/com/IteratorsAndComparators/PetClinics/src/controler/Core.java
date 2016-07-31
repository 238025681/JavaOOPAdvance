
package controler;



import IO.InputReadImpl;
import IO.WriterOutputImpl;
import controler.command.CommandDispatcher;
import exception.MyException;
import interfaces.Clinic;
import interfaces.Executable;
import interfaces.InputRead;
import interfaces.Pet;
import interfaces.WriterOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author kalin
 */
public class Core {

    private InputRead reader;
    private boolean running;
    private CommandDispatcher dispatcher;
    private WriterOutput writerOutput;
    private Map<String, Clinic> clinics;
    private Map<String, Pet> pets;
    

    public Core() {
        
        this.setReader(new InputReadImpl());
        this.setRunning(true);
        this.setDispatcher(new CommandDispatcher(this));
        this.setWriterOutput(new WriterOutputImpl());
        this.setClinics(new TreeMap<>());
        this.setPets(new TreeMap<>());
        
    }

    public Map<String, Pet> getPets() {
        return pets;
    }

    private void setPets(Map<String, Pet> pets) {
        this.pets = pets;
    }

    public Map<String, Clinic> getClinics() {
        return clinics;
    }

    private void setClinics(Map<String, Clinic> clinics) {
        this.clinics = clinics;
    }
    

    public WriterOutput getWriterOutput() {
        return writerOutput;
    }

    private void setWriterOutput(WriterOutput output) {
        this.writerOutput = output;
    }

    public InputRead getReader() {
        return reader;
    }

    private void setReader(InputRead reader) {

        this.reader = reader;
    }

    public boolean isRunning() {
        return running;
    }

    private void setRunning(boolean running) {
        this.running = running;
    }

    public CommandDispatcher getDispatcher() {
        return dispatcher;
    }

    private void setDispatcher(CommandDispatcher dispatcher) {

        this.dispatcher = dispatcher;
    }



    public void run() throws IOException {
        
        BufferedReader input = reader.bufferedReader(System.in);
        int index = Integer.parseInt(input.readLine());
        String result = "";
        
        for (int i = 0; i < index; i++) {
        
            String[] token = input.readLine().trim().split("\\s+");
            
            Executable command = this.getDispatcher().dispatch(token[0], token);

            try {
                
                result = command.execute();
            } catch (MyException e) {
                
                System.out.println(e.getMessage());
                
                continue;
            }

            if (result.equals("")) {
                
                continue;
            }

            this.getWriterOutput().print(result);

            
        }

    }

}
