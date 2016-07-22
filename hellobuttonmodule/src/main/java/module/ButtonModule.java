package module;

import interfaces.Module;
import interfaces.ModuleInfo;
import module.interfaces.PhraseButton;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 06.07.2016.
 */

@Component
public class ButtonModule implements Module{

    static Logger logger = Logger.getLogger(ButtonModule.class);

    @Autowired
    private HelloButton helloButton;

    @Autowired
    private ByeButton byeButton;

    @Autowired
    private CleanButton cleanButton;

    public ButtonModule(){
        logger.debug(this + " object creation");
    }

    public PhraseButton getHelloButton() {
        return helloButton;
    }

    public void setHelloButton(HelloButton helloButton) {
        this.helloButton = helloButton;
    }

    public PhraseButton getByeButton() {
        return byeButton;
    }

    public void setByeButton(ByeButton byeButton) {
        this.byeButton = byeButton;
    }

    public PhraseButton getCleanButton() {
        return cleanButton;
    }

    public void setCleanButton(CleanButton cleanButton) {
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

    @Override
    public ModuleInfo getInfo() {
        return new ButtonModuleInfo();
    }
}
