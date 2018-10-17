package com.birumerah.deli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private Environment env;
	 
    public static void main(String[] args) {
    	logger.debug(">>>> start app..");
    	Application app = new Application();
    	logger.debug(">>>> port : "+app.env.getProperty("server.port"));
        SpringApplication.run(Application.class, args);
    }

}
