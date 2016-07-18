package application.modules.module1;

import application.interfaces.Module;
import org.apache.log4j.Logger;

/**
 * Created by Max Nichipor on 08.07.2016.
 */
public class Module1 implements Module {

    static Logger logger = Logger.getLogger(Module1.class);

    private final static String PHRASE = "test module 1";
    private final static String NAME = "Module1";

    public Module1(){
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
        return "Module1{}";
    }
}
