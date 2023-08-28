package com.quixada.ufc.br.Agenda.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.quixada.ufc.br.Agenda.model.Contato;
import com.quixada.ufc.br.Agenda.repository.ContatoRepository;

import jakarta.transaction.Transactional;

@Service
public class ContatoService {
    final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Transactional
    public void deleteInativo(Contato contato) {
        if(!contato.getStatus()) contatoRepository.delete(contato);
    }

    public Optional<Contato> findById(UUID id) {
        return contatoRepository.findById(id);
    }
}
