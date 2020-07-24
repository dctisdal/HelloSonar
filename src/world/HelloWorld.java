package world;

import java.util.logging.Logger;
import java.util.logging.level;

public class HelloWorld {
	public static void main(String[] args) {
		// prints "Hello World" to terminal window
		Logger logger = Logger.getLogger(HelloWorld.class.getName());
		logger.log(Level.INFO, "Hello World!");
	}
}