package ma.ensaj.Client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import ma.ensaj.Client.entities.Client;
import ma.ensaj.Client.repositories.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		
	}

	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
		return args->{
			clientRepository.save(new Client(Long.parseLong("1"),"Houda ","MERBAH",Float.parseFloat("21")));
			clientRepository.save(new Client(Long.parseLong("2"),"Awatif ","MERBAH",Float.parseFloat("20")));
			clientRepository.save(new Client(Long.parseLong("3"),"Samira ","Anbari",Float.parseFloat("30")));
		};
		
	}
}
