package module;

import interfaces.Module;
import org.apache.log4j.Logger;
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

    @Bean
    public Module module2Info(){
        Module module2Info = new Module2Info();
        logger.debug("@Bean " + module2Info + " created");
        return module2Info;
    }

    @Bean
    public Module2 module2(){
        Module2 module2 = new Module2();
        logger.debug("@Bean " + module2 + " created");
        return module2;
    }

}
