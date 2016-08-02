package application;

import interfaces.Module;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Max Nichipor on 10.07.2016.
 */

@Component
public class ModulePlatform {

    static Logger logger = Logger.getLogger(ModulePlatform.class);

    @Autowired
    private List<Module> modules;

    public List<Module> getModules(){
        return modules;
    }

    @Override
    public String toString() {
        return '{' +
                "\"modules\":" + modules +
                '}';
    }

}
