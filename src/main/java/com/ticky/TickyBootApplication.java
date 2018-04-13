package com.ticky;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//Added
@SpringBootApplication
@EnableConfigurationProperties
public class TickyBootApplication {
	  

		public static void main(String[] args) {
			SpringApplication.run(TickyBootApplication.class, args);
		}
	 

}
