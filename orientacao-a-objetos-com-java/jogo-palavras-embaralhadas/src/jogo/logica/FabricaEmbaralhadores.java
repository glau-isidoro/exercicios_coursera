package jogo.logica;

import java.util.Random;

public class FabricaEmbaralhadores {
	
	private Random rand = new Random();
	private int qualEmbaralhador = Math.abs(rand.nextInt()) % 300;
	Embaralhador embaralhador;

	public Embaralhador escolherEmbaralhador() {
		if(qualEmbaralhador % 2 == 0 && qualEmbaralhador % 3 == 0) {
			return embaralhador = new EmbaralharTres();
		} else if(qualEmbaralhador % 2 == 0) {
			return embaralhador = new EmbaralharDois();
		} else {
			return embaralhador = new EmbaralharUm();
		}
	}
	
}
