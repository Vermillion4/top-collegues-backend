package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration("SgpConfiguration.class")
public class TopColleguesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopColleguesBackendApplication.class, args);
	}
}
