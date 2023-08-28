package com.quixada.ufc.br.Agenda.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quixada.ufc.br.Agenda.model.Contato;
import com.quixada.ufc.br.Agenda.service.ContatoService;

public class ContatoController {

    final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    // @DeleteMapping("/contatos/inativos/{id}")
    // public ResponseEntity<Object> deleteInativo(@PathVariable(value = "id") UUID id) {
    //     Optional<Contato> contato = contatoService.findById(id);
    //     if(contato.isEmpty())
    //         return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contato não encontrado.");
    //     if(contato.get().getStatus())
    //         return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contato está ativo.");
    //     contatoService.deleteInativo(contato.get());
    //     return ResponseEntity.status(HttpStatus.OK).body("Contato inativo deletado com sucesso");
    // }
}
