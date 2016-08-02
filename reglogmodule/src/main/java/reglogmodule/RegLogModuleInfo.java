package reglogmodule;

import interfaces.ModuleInfo;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 01.08.2016.
 */

@Service
public class RegLogModuleInfo implements ModuleInfo {
    private final static String NAME = "register-login module";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString() {
        return getName();
    }
}
