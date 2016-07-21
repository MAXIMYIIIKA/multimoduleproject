package application;

import interfaces.Module;
import org.apache.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Nichipor on 10.07.2016.
 */
public class ModulePlatform {

    static Logger logger = Logger.getLogger(ModulePlatform.class);

    private ArrayList<Module> modules;

    public ModulePlatform(){
        logger.debug(this + " object creation");
        this.modules = new ArrayList<>();
    }

    public ModulePlatform(List<Module> modules){
        this.modules = new ArrayList<>();
        for(Module module: modules){
            this.modules.add(module);
        }
    }

    public ArrayList<Module> getModules(){
        return modules;
    }

    public void addModule(Module module){
        logger.debug(module.getName() + " initialization");
        this.modules.add(module);
        logger.debug(module.getName() + " initialized");
    }

    @Override
    public String toString() {
        return "ModulePlatform{" +
                "modules=" + modules +
                '}';
    }

}
