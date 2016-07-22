package application;

import interfaces.Module;
import interfaces.ModuleInfo;
import module.ButtonModuleInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Max Nichipor on 10.07.2016.
 */

@Component
public class ModulePlatform {

    static Logger logger = Logger.getLogger(ModulePlatform.class);

//    @Autowired
//    private ButtonModuleInfo bmi;

    private List<Module> modules;

    public ModulePlatform(){
    }

    @Autowired
    public ModulePlatform(List<Module> modules){
        this.modules = modules;
    }

    public List<Module> getModules(){
        return modules;
    }

    public void addModule(Module module){
        logger.debug(module.getInfo().getName() + " initialization");
        this.modules.add(module);
        logger.debug(module.getInfo().getName() + " initialized");
    }

    @Override
    public String toString() {
        return "ModulePlatform{" +
                "modules=" + modules +
                '}';
    }

}
