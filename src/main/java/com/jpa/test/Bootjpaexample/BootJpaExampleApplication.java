package com.jpa.test.Bootjpaexample;

import com.jpa.test.Bootjpaexample.repository.UserRepository;
import com.jpa.test.Bootjpaexample.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
	 SpringApplication.run(BootJpaExampleApplication.class, args);



	}

}
