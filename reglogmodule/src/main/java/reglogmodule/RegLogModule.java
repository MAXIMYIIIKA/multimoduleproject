package reglogmodule;

import interfaces.Module;
import interfaces.ModuleInfo;
import org.springframework.stereotype.Component;

/**
 * Created by Max Nichipor on 01.08.2016.
 */

@Component
public class RegLogModule implements Module{
    @Override
    public ModuleInfo getInfo() {
        return new RegLogModuleInfo();
    }

    @Override
    public String toString() {
        return "RegLogModule{}";
    }
}
