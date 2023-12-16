package ma.ensaj.Client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ensaj.Client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
