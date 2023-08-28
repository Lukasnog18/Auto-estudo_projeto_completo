package com.quixada.ufc.br.Agenda.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class SpringDataRestConfig implements RepositoryRestConfigurer {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**").allowedMethods("*");

        EntityManager em = entityManagerFactory.createEntityManager();
        config.exposeIdsFor(em.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));

    }

    @Bean
    public PageableHandlerMethodArgumentResolverCustomizer pageableCustomizer() {
        return (resolver) -> {
            resolver.setOneIndexedParameters(true);
        };
    }
}

