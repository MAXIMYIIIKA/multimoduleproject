package application.modules.module1;

import interfaces.Module;

/**
 * Created by Max Nichipor on 21.07.2016.
 */
public class ModuleInfo implements Module {
    private final static String NAME = "Module1";

    @Override
    public String getName(){
        return NAME;
    }

    @Override
    public String toString() {
        return getName();
    }
}
