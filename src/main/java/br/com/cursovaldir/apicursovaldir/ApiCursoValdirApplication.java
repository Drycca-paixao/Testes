package br.com.cursovaldir.apicursovaldir;

import br.com.cursovaldir.apicursovaldir.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCursoValdirApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCursoValdirApplication.class, args);
        SpringApplication.run(ApiCursoValdirApplication.class, args);
    }

    User user = new User(1, "drycca","mail@mail.com",  "123");
}
