package jogo.logica;

import java.util.Random;

public class FabricaMecanicaDoJogo {
	
	private Random rand = new Random();
	private int qualJogo = Math.abs(rand.nextInt()) % 300;
	MecanicaDoJogo jogoEscolhido;

	public MecanicaDoJogo escolherJogo() {
		if(qualJogo % 2 == 0 && qualJogo % 3 == 0) {
			return jogoEscolhido = new JogoUm();
		} else if(qualJogo % 2 == 0) {
			return jogoEscolhido = new JogoDois();
		} else {
			return jogoEscolhido = new JogoTres();
		}
	}

}
