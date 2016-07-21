package module;

import interfaces.Module;

/**
 * Created by Max Nichipor on 21.07.2016.
 */
public class Module2Info implements Module {
    private final static String NAME = "Module2";

    @Override
    public String getName(){
        return NAME;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
