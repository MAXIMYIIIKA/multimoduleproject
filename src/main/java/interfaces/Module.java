package interfaces;

import org.springframework.stereotype.Component;

/**
 * Created by Max Nichipor on 10.07.2016.
 */

@Component
public interface Module {
    ModuleInfo getInfo();
}
