package module;

import interfaces.ModuleInfo;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 21.07.2016.
 */

@Service
public class ButtonModuleInfo implements ModuleInfo {
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
