package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final InstrumentoRepository repository;

	@Autowired
	public DatabaseLoader(InstrumentoRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Instrumento("Guitarra", "Cuerda", "de madera,con caja de resonancia"));
		this.repository.save(new Instrumento("Ukulele", "Cuerda", "de madera,con caja de resonancia"));
		this.repository.save(new Instrumento("Melodica", "Viento", "de madera,con caja de resonancia"));
	}
}