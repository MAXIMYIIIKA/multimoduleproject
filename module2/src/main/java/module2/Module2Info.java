package module2;

import interfaces.Module;
import interfaces.ModuleInfo;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 21.07.2016.
 */

@Service
public class Module2Info implements ModuleInfo {
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
