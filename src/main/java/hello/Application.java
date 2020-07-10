package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class Application {
	public Application() {
		System.out.println("-- Application object created at: " + LocalDateTime.now());
	}

	@RequestMapping("/")
	public String home() {
		System.out.println("-- / called at: " + LocalDateTime.now());
		return "<b>Hello Docker World</b>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}