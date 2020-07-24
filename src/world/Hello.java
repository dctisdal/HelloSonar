package hello;

import java.util.logging.Logger;
import java.util.logging.level;

public class Hello {
	public static void main(String[] args) {
		// prints "Hello World" to terminal window
		Logger logger = Logger.getLogger(Hello.class.getName());
		logger.log(Level.INFO, "Hello World!");
	}
}