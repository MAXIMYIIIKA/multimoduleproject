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
public class Module1Context {

    static Logger logger = Logger.getLogger(Module1Context.class);

    @Bean
    public Module module1Info(){
        Module module1Info = new Module1Info();
        logger.debug("@Bean " + module1Info + " created");
        return module1Info;
    }

    @Bean
    public Module1 module1(){
        Module1 module1 = new Module1();
        logger.debug("@Bean " + module1 + " created");
        return module1;
    }
}
