package module;

import interfaces.Module;

/**
 * Created by Max Nichipor on 21.07.2016.
 */
public class ButtonModuleInfo implements Module {
    private final static String NAME = "Button module";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
