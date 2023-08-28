package com.quixada.ufc.br.Agenda.repository;

// import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.quixada.ufc.br.Agenda.model.Contato;

@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface ContatoRepository extends JpaRepository<Contato, UUID> {
    // Optional<Contato> deleteInativo(Contato contato);
}
