package boot.sixth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Example6Application {

	public static void main(String[] args) {
		SpringApplication.run(Example6Application.class, args);
	}
}
