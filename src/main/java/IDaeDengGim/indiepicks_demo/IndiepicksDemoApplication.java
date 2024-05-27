package IDaeDengGim.indiepicks_demo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class IndiepicksDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndiepicksDemoApplication.class, args);
	}

}
