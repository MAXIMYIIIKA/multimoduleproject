package module;

import module.interfaces.PhraseButton;
import org.apache.log4j.Logger;

/**
 * Created by Max Nichipor on 06.07.2016.
 */

public class ButtonModule {

    static Logger logger = Logger.getLogger(ButtonModule.class);

    private PhraseButton helloButton;
    private PhraseButton byeButton;
    private PhraseButton cleanButton;

    public ButtonModule(PhraseButton helloButton, PhraseButton byeButton, PhraseButton cleanButton){
        logger.debug(this + " object creation");
        this.helloButton = helloButton;
        this.byeButton = byeButton;
        this.cleanButton = cleanButton;
    }

    public PhraseButton getHelloButton() {
        return helloButton;
    }

    public void setHelloButton(PhraseButton helloButton) {
        this.helloButton = helloButton;
    }

    public PhraseButton getByeButton() {
        return byeButton;
    }

    public void setByeButton(PhraseButton byeButton) {
        this.byeButton = byeButton;
    }

    public PhraseButton getCleanButton() {
        return cleanButton;
    }

    public void setCleanButton(PhraseButton cleanButton) {
        this.cleanButton = cleanButton;
    }

    public PhraseButton getButton(String param){
        switch (param){
            case "Hello":
                return getHelloButton();
            case "Bye":
                return getByeButton();
            default:
                return getCleanButton();
        }
    }

    @Override
    public String toString() {
        return "ButtonModule{}";
    }
}
