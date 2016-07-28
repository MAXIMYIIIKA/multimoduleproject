package buttonmodule;

import buttonmodule.interfaces.PhraseButton;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by Max Nichipor on 06.07.2016.
 */

@Component
public class ByeButton implements PhraseButton {

    static Logger logger = Logger.getLogger(ByeButton.class);

    private final static String PHRASE = "Bye-bye!";

    public ByeButton(){
        logger.debug(this + " object creation");
    }

    @Override
    public String sayPhrase() {
        return PHRASE;
    }

    @Override
    public String toString() {
        return "ByeButton{}";
    }
}
