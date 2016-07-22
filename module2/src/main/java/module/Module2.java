package module;

import interfaces.Module;
import interfaces.ModuleInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 08.07.2016.
 */

@Service
public class Module2 implements Module{

    private static final Logger logger = Logger.getLogger(Module2.class);

    private final static String PHRASE = "test module 2";

    public Module2(){
        logger.debug(this + " object creation");
    }

    public String doAction() {
        return PHRASE;
    }

    @Override
    public String toString() {
        return "Module2{}";
    }

    @Override
    public ModuleInfo getInfo() {
        return new Module2Info();
    }
}
