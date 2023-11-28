package es.dsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="es.dsw")
public class TSpringBootProjectDemo10Application {

	public static void main(String[] args) {
		SpringApplication.run(TSpringBootProjectDemo10Application.class, args);
	}

}
