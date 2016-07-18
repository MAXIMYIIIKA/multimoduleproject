package application.modules.module2;

import application.ModulePlatform;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Max Nichipor on 08.07.2016.
 */

@Configuration
@ComponentScan
public class Module2Context {

    static  Logger logger = Logger.getLogger(Module2Context.class);

    @Autowired
    public ModulePlatform modulePlatform;

    @Bean
    public Module2 module2(){
        Module2 module2 = new Module2();
        logger.debug("@Bean " + module2 + " created");
        modulePlatform.addModule(module2);
        return module2;
    }

}
