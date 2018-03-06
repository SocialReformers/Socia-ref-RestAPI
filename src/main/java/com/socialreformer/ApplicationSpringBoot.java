package main.java.com.socialreformer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import main.java.com.socialreformer.service.EventService;
import main.java.com.socialreformer.service.EventServiceImpl;


@SpringBootApplication(scanBasePackages={"main.java.com.socialreformer/maim.resources"})

@ComponentScan
public class ApplicationSpringBoot {
	public static void main(String args[]){
		   SpringApplication.run(ApplicationSpringBoot.class, args);
	}
	

	

}
