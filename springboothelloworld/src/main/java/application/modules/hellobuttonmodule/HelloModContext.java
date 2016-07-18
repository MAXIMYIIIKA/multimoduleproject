package application.modules.hellobuttonmodule;

import application.ModulePlatform;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Max Nichipor on 06.07.2016.
 */

@Configuration
@ComponentScan
public class HelloModContext {

    static Logger logger = Logger.getLogger(HelloModContext.class);

    @Autowired
    public ModulePlatform modulePlatform;

    @Bean
    public ButtonModule factoryButton(){
        ButtonModule buttonModule = new ButtonModule(helloButton(), byeButton(), cleanButton());
        logger.debug("@Bean " + buttonModule + " created");
        modulePlatform.addModule(buttonModule);
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
