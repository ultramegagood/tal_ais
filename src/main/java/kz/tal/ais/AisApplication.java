package kz.tal.ais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
public class AisApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AisApplication.class, args);
	}

	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}


}
