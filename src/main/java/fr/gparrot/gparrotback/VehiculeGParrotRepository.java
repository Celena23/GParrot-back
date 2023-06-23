package fr.gparrot.gparrotback;


import fr.gparrot.gparrotback.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Repository de la Class Vehicule. Va permettre d'interroger la bdd
 */


@RepositoryRestResource(collectionResourceRel = "vehicule", path = "vehicule")
@CrossOrigin(origins="*")
public interface VehiculeGParrotRepository extends JpaRepository<Vehicule, Long> {
}
