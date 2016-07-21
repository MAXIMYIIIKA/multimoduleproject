package application;

import interfaces.Module;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by Max Nichipor on 10.07.2016.
 */
@Configuration
@ComponentScan
public class AppContext {

    static Logger logger = Logger.getLogger(AppContext.class);

    @Autowired
    public Module module;

    @Bean
    public ModulePlatform modulePlatform(){
        ModulePlatform modulePlatform = new ModulePlatform();
        logger.debug("@Bean " + modulePlatform + " created");
        modulePlatform.addModule(module);
        return modulePlatform;
    }

}
