package zw.ac.shexatech.student_mgt_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class StudentMgtAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMgtAppApplication.class, args);
	}

}
