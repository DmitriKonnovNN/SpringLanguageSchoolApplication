package LanguageSchool.LSApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class LsApplication {
	public static void main(String[] args) {
		SpringApplication.run(LsApplication.class, args);
	}
}
