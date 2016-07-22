package module;

import module.interfaces.PhraseButton;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by Max Nichipor on 06.07.2016.
 */

@Component
public class CleanButton implements PhraseButton {

    static Logger logger = Logger.getLogger(CleanButton.class);

    public CleanButton(){
        logger.debug(this + " object creation");
    }

    @Override
    public String sayPhrase() {
        return null;
    }

    @Override
    public String toString() {
        return "CleanButton{}";
    }
}
