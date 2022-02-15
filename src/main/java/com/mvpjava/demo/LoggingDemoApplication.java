package com.mvpjava.demo;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingDemoApplication implements CommandLineRunner{
	static Logger logger = Logger.getLogger("com.mvpjava.demo.LoggingDemoApplication");

	FileHandler fileHandler = null;
	FileHandler errFileHandler = null;


	public static void main(String[] args) {
		SpringApplication.run(LoggingDemoApplication.class, args);
		logger.info("Application starting ...");
        
		while (true) {
			IntStream.range(1, 5).forEach(number -> logger.fine("number:" + number));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				logger.severe("Thread was interrupted ...exiting application");
			}
			
			logger.severe("Endless loop detected!");
		}
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			fileHandler = new FileHandler("/tmp/java-app.log");
			errFileHandler = new FileHandler("/tmp/java-app-errors.log");

			fileHandler.setFormatter(new SimpleFormatter());
			fileHandler.setLevel(Level.FINEST);

			errFileHandler.setFormatter(new SimpleFormatter());
			errFileHandler.setLevel(Level.SEVERE);

			logger.addHandler(fileHandler);
			logger.addHandler(errFileHandler);

			logger.setLevel(Level.ALL);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.config("Logging setup is complete" + args.length);
		logger.info  ("Number args:" + args.length);
	}

}
