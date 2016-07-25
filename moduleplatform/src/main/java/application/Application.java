package application;



import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Max Nichipor on 05.07.2016.
 */

@SpringBootApplication
public class Application {

    static Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("Application running...");
        SpringApplication.run(Application.class, args);
    }
}
