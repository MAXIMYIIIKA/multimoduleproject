package application;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Max Nichipor on 05.07.2016.
 */

@ComponentScan("..")
@SpringBootApplication
public class Application {

    static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("application.Application running...");
        SpringApplication.run(Application.class, args);
    }
}
