package fr.gparrot.gparrotback;


import fr.gparrot.gparrotback.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Repository de la Class Photo. Va permettre d'interroger la bdd
 */


@RepositoryRestResource(collectionResourceRel = "photo", path = "photo")
@CrossOrigin(origins="*")
public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
