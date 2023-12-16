package ma.merbah.servicevoiture;

import ma.merbah.servicevoiture.entities.Voiture;
import ma.merbah.servicevoiture.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceVoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceVoitureApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository){

		return args -> {
			voitureRepository.save(new Voiture(Long.parseLong("1"),"M87654RT678","AUDI","RS7",Long.parseLong("2")));
			voitureRepository.save(new Voiture(Long.parseLong("2"),"GCGHHYU3456","AUDI","RS6",Long.parseLong("2")));
			voitureRepository.save(new Voiture(Long.parseLong("3"),"DTRI4567989","AUDI","Q8",Long.parseLong("2")));

		};
	}
}
