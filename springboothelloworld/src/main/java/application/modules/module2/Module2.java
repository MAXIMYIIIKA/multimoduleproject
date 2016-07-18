package application.modules.module2;

import application.interfaces.Module;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by Max Nichipor on 08.07.2016.
 */

@Component
public class Module2 implements Module {

    private static final Logger logger = Logger.getLogger(Module2.class);

    private final static String PHRASE = "test module 2";
    private final static String NAME = "Module2";

    public Module2(){
        logger.debug(this + " object creation");
    }

    @Override
    public String getNAME(){
        return NAME;
    }

    public String doAction() {
        return PHRASE;
    }

    @Override
    public String toString() {
        return "Module2{}";
    }
}
