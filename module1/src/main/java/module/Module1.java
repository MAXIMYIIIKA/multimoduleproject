package module;

import interfaces.Module;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 08.07.2016.
 */

@Service
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
