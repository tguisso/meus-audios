package com.meus_audios.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Audio {
	
	private String titulo;
	private int totalReproducoes;
	private int totalCurtidas;
	private int classificacao;
	
	public void curte() {
		this.totalCurtidas++;
	}
	
	public void reproduz() {
		this.totalReproducoes++;
	}

}
