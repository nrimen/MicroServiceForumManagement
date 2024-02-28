package tn.esprit.piDev.feedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EntityScan(basePackages = {"tn.esprit.piDev.entities"})
@ComponentScan(basePackages = {"tn.esprit.piDev.repositories","tn.esprit.piDev.controllers","tn.esprit.piDev.services","tn.esprit.piDev.config"})
@EnableJpaRepositories(basePackages = "tn.esprit.piDev.repositories")
@EnableAspectJAutoProxy
public class FeedBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedBackApplication.class, args);
	}

}
