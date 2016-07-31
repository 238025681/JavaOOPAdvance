/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler.command;



import controler.Core;
import interfaces.Executable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 *
 * @author kalin
 */
public final class CommandDispatcher {

    private final String COMMAND_PACKAGE = "controler.command.";
    private Core core;
    private String[] data;

    public CommandDispatcher(Core core) {

        this.setCore(core);
        
    }

    public String[] getData() {
        return data;
    }

    private void setData(String[] data) {
        this.data = data;
    }
    

    public Core getCore() {
        return core;
    }

    private void setCore(Core core) {
        this.core = core;
    }

    public Executable dispatch(String commands, String... params) {
        
        this.setData(params);
        
        Executable exe = null;

        try {

            Class<Executable> exeClass = (Class<Executable>) Class.forName(COMMAND_PACKAGE + commands + "Command");

            Constructor ctor = exeClass.getDeclaredConstructor(Core.class);

            exe = (Executable) ctor.newInstance(this.getCore());
            this.resolveDependancies(exe, exeClass);

       
        } catch (ReflectiveOperationException e) {
            
           throw new RuntimeException("Invalid Command!");
        } 


        return exe;
    }

    private void resolveDependancies(Executable exe, Class<Executable> exeClass) throws IllegalAccessException {
        Field[] fields = exeClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if (!field.isAnnotationPresent(Inject.class)) {
                continue;
            }

            Field[] theseFields = CommandDispatcher.class.getDeclaredFields();
            
            for (Field theseField : theseFields) {
                theseField.setAccessible(true);
                if (!theseField.getType().equals(field.getType())) {
                    continue;
                }

                field.set(exe, theseField.get(this));
            }
        }
    }

}
