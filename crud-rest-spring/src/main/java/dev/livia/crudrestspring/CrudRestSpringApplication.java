package dev.livia.crudrestspring;

import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.livia.crudrestspring.model.Contato;
import dev.livia.crudrestspring.repository.ContatoRepository;

@SpringBootApplication
public class CrudRestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudRestSpringApplication.class, args);
	}
	

}
