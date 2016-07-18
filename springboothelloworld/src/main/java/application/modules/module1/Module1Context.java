package application.modules.module1;

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
public class Module1Context {

    static Logger logger = Logger.getLogger(Module1Context.class);

    @Autowired
    public ModulePlatform modulePlatform;

    @Bean
    public Module1 module1(){
        Module1 module1 = new Module1();
        logger.debug("@Bean " + module1 + " created");
        modulePlatform.addModule(module1);
        return module1;
    }
}
