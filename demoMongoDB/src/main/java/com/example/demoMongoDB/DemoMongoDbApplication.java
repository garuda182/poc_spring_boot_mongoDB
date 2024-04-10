package com.example.demoMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMongoDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoMongoDbApplication.class, args);
	}

	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(String... arg) throws Exception{
		this.clienteService.save("18", "masculino","solteiro","desenvolvedor","não sei o que é isso","superior","1", "20","30","12345","sucesso","melhorar");
	}
}


