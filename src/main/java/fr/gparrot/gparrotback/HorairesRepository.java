package fr.gparrot.gparrotback;


import fr.gparrot.gparrotback.entities.Horaires;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Repository de la Class Horaires. Va permettre d'interroger la bdd
 */


@RepositoryRestResource(collectionResourceRel = "horaires", path = "horaires")
@CrossOrigin(origins="*")
public interface HorairesRepository extends JpaRepository<Horaires, Long> {
}
