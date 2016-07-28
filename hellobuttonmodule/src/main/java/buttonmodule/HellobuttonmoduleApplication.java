package buttonmodule;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
public class HellobuttonmoduleApplication {

	static Logger logger = Logger.getLogger(HellobuttonmoduleApplication.class);

	public static void main(String[] args) {
		logger.debug("Application running... ");
		SpringApplication.run(HellobuttonmoduleApplication.class, args);
	}
}
