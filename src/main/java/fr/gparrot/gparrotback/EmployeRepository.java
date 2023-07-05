package fr.gparrot.gparrotback;


import fr.gparrot.gparrotback.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

/**
 * Repository de la Class Employe. Va permettre d'interroger la bdd
 */


@RepositoryRestResource(collectionResourceRel = "employe", path = "employe")
@CrossOrigin(origins="*")
public interface EmployeRepository extends JpaRepository<Employe, Long> {
    Optional<Employe> findByIdentifierAndPassword(String identifier, String password);
}
