package com.meus_audios.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MusicaUnitTest {
	
	@Test
	void deveIncrementarCurtidas() {
		Musica musica = new Musica();
		
		for (int i = 0; i < 3; i++) {
			musica.curte();
		}
		
		int totalCurtidas = musica.getTotalCurtidas();
		assertEquals(3, totalCurtidas);
	}

}
