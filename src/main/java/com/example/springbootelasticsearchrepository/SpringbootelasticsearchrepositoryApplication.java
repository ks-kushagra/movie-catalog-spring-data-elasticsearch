package com.example.springbootelasticsearchrepository;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import com.example.springbootelasticsearchrepository.logging.Logging;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootelasticsearchrepositoryApplication {    
	public static void main(String[] args) {
                 
                Logging.run();
                Logging.logger.info("Application is Starting");
		SpringApplication.run(SpringbootelasticsearchrepositoryApplication.class, args);
                
	}

}
