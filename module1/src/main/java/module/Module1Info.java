package module;

import interfaces.Module;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Max Nichipor on 21.07.2016.
 */

@Service
public class Module1Info implements Module {
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
