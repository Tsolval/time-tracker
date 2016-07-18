package net.tsolval.psp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application configuration class.  Add or reference Spring configurations here.
 *
 * @author tsolval
 */
@SpringBootApplication
public class TimeTrackerApplication {

	/**
	 * This is the main starting point for the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TimeTrackerApplication.class, args);
	}
}
