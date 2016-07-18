package application;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Max Nichipor on 10.07.2016.
 */
@Configuration
@ComponentScan
public class AppContext {

    static Logger logger = Logger.getLogger(AppContext.class);

    @Bean
    public ModulePlatform modulePlatform(){
        ModulePlatform modulePlatform = new ModulePlatform();
        logger.debug("@Bean " + modulePlatform + " created");
        return modulePlatform;
    }

}
