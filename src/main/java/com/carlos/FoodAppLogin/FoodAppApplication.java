package com.carlos.FoodAppLogin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class FoodAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodAppApplication.class, args);
		corsConfigure();
		System.out.println("Prepare for automatic deploy in heroku");
	}

	
	 public static WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/greeting-javaconfig").allowedOrigins("https://murmuring-dawn-57579.herokuapp.com/");
	            }
	        };
	    }
}
