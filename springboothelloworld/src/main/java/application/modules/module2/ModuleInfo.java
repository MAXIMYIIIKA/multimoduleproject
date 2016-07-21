package application.modules.module2;

import interfaces.Module;

/**
 * Created by Max Nichipor on 21.07.2016.
 */
public class ModuleInfo implements Module {
    private final static String NAME = "Module2";

    @Override
    public String getName(){
        return NAME;
    }

    @Override
    public String toString() {
        return getName();
    }
}
