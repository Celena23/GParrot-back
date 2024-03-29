package fr.gparrot.gparrotback.config;

import fr.gparrot.gparrotback.entities.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Employe.class);
        config.exposeIdsFor(Photo.class);
        config.exposeIdsFor(Vehicule.class);
        config.exposeIdsFor(Commentaire.class);
        config.exposeIdsFor(Service.class);
        config.exposeIdsFor(Horaires.class);
    }
}

