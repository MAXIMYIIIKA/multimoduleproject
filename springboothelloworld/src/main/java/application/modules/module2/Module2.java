package application.modules.module2;

import interfaces.Module;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by Max Nichipor on 08.07.2016.
 */

@Component
public class Module2 {

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
}
