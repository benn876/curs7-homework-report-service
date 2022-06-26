package org.fasttrackit.reportservice;

import org.fasttrackit.restaurant.client.RestaurantClientRTConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = {
		"org.fasttrackit.reportservice",
		"org.fasttrackit.restaurant.client"
})
@EnableConfigurationProperties(value = RestaurantClientRTConfig.class)
public class ReportServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportServiceApplication.class, args);
	}

}
