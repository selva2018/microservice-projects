package com.ticky.property;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/prop/config.props")
@ConfigurationProperties(prefix="error")
public class ErrorProperty {
	private Map<String, String> description;

	public String getDescription(String errorCode) {
		return description.get(errorCode);
	}

	public void setDescription(Map<String, String> description) {
		this.description = description;
	}
	
	
	

}
