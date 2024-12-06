package batch.e3.student_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Student REST API", description = "Rest api which has endpoints for performing crud operation on student table",version = "1.0.0",contact = @Contact(name = "Saish",email = "saishkulkarni7@gmail.com",url = "https://www.github.com/saishkulkarni")))
public class StudentCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudApplication.class, args);
	}

}
