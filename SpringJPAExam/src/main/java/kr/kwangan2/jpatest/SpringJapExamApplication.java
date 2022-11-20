package kr.kwangan2.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJapExamApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringJapExamApplication.class);
		application.run(args);
	}

}
