package module;

import interfaces.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 21.07.2016.
 */

@Service
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
