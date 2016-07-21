package module;

import interfaces.Module;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Max Nichipor on 06.07.2016.
 */

@Configuration
@ComponentScan
@Scope("application")
public class HelloModContext {

    static Logger logger = Logger.getLogger(HelloModContext.class);

    @Bean
    public Module buttonModuleInfo(){
        Module buttonInfo = new ButtonModuleInfo();
        logger.debug("@Bean " + buttonInfo + " created");
        return buttonInfo;
    }

    @Bean
    public ButtonModule factoryButton(){
        ButtonModule buttonModule = new ButtonModule(helloButton(), byeButton(), cleanButton());
        logger.debug("@Bean " + buttonModule + " created");
        return buttonModule;
    }

    @Bean
    public HelloButton helloButton(){
        HelloButton helloButton = new HelloButton();
        logger.debug("@Bean " + helloButton + " created");
        return helloButton;
    }

    @Bean
    public ByeButton byeButton(){
        ByeButton byeButton = new ByeButton();
        logger.debug("@Bean " + byeButton + " created");
        return byeButton;
    }

    @Bean
    public CleanButton cleanButton(){
        CleanButton cleanButton = new CleanButton();
        logger.debug("@Bean " + cleanButton + " created");
        return cleanButton;
    }
}
