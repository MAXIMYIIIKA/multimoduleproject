package module1;

import interfaces.ModuleInfo;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 21.07.2016.
 */

@Service
public class Module1Info implements ModuleInfo {
    private final static String NAME = "Module1";

    @Override
    public String getName(){
        return NAME;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
