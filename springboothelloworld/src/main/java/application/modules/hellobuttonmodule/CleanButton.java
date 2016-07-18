package application.modules.hellobuttonmodule;

import application.modules.hellobuttonmodule.interfaces.PhraseButton;
import org.apache.log4j.Logger;

/**
 * Created by Max Nichipor on 06.07.2016.
 */
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
