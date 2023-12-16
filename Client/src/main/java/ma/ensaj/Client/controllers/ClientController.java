package ma.ensaj.Client.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ma.ensaj.Client.entities.Client;
import ma.ensaj.Client.repositories.ClientRepository;

@RestController
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;

	@GetMapping("/clients")
	public List findAll() {
		return clientRepository.findAll();
	}
	@GetMapping("/clients/{id}")
	public Client findById (@PathVariable Long id) throws Exception{
		return this.clientRepository.findById(id).orElseThrow(()-> new
				Exception("Ce Client n'existe pas "));
	}
}