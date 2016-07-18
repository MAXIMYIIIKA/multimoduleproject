package application;

import application.interfaces.Module;
import org.apache.log4j.Logger;


import java.util.ArrayList;
import java.util.Collection;

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

    public ArrayList<Module> getModules(){
        return modules;
    }

    public void addModule(Module module){
        logger.debug(module.getNAME() + " initialization");
        this.modules.add(module);
        logger.debug(module.getNAME() + " initialized");
    }

    @Override
    public String toString() {
        return "ModulePlatform{" +
                "modules=" + modules +
                '}';
    }

}
