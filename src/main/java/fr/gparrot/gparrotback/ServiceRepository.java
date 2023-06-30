package fr.gparrot.gparrotback;


import fr.gparrot.gparrotback.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Repository de la Class Service. Va permettre d'interroger la bdd
 */


@RepositoryRestResource(collectionResourceRel = "service", path = "service")
@CrossOrigin(origins="*")
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
