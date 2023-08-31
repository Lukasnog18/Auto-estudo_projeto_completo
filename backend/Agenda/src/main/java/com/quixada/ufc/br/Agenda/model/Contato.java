package com.quixada.ufc.br.Agenda.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
@Entity
public class Contato {
    // private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;

    @NotNull
    private String nome;
    @NotNull
    private String telefone;
    private String endereco;
    private Boolean status;
    
    public Contato() {
    }

}
