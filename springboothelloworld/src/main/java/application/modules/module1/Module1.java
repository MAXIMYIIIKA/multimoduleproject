package application.modules.module1;

import interfaces.Module;
import org.apache.log4j.Logger;

/**
 * Created by Max Nichipor on 08.07.2016.
 */
public class Module1 {

    static Logger logger = Logger.getLogger(Module1.class);

    private final static String PHRASE = "test module 1";

    public Module1(){
        logger.debug(this + " object creation");
    }

    public String doAction() {
        return PHRASE;
    }

    @Override
    public String toString() {
        return "Module1{}";
    }
}
