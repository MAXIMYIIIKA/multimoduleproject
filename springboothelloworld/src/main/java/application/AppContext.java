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
    public List<Module> modules;

    @Bean
    public ModulePlatform modulePlatform(){
        ModulePlatform modulePlatform = new ModulePlatform(modules);
        logger.debug("@Bean " + modulePlatform + " created");
        return modulePlatform;
    }

}
