package fr.gparrot.gparrotback;


import fr.gparrot.gparrotback.entities.Commentaire;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Repository de la Class Commentaire. Va permettre d'interroger la bdd
 */


@RepositoryRestResource(collectionResourceRel = "commentaire", path = "commentaire")
@CrossOrigin(origins="*")
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    Page<Commentaire> findByValid(Boolean valid, Pageable pageable);
}
