package jogo.principal;

import java.util.Scanner;

import jogo.logica.FabricaMecanicaDoJogo;
import jogo.logica.MecanicaDoJogo;


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Você consegue decifrar essas palavras?\n");
		
		Scanner in = new Scanner(System.in);
		
		FabricaMecanicaDoJogo jogo = new FabricaMecanicaDoJogo();
		MecanicaDoJogo jogar = jogo.escolherJogo();
		System.out.println(jogar.comecarJogo());
		
		while(jogar.getVidas() > 0) {
			System.out.println("Que palavra é essa?");
			System.out.println(jogar.novaPalavra());
			
			while(jogar.getChances() > 0) {
				String chute = in.nextLine();
				System.out.println(jogar.tentativa(chute));
			}
		}
		
		in.close();
		
		if(jogar.getPontos() > 20) {
			System.out.println(jogar.ganhouJogo());
		} else {
			System.out.println(jogar.fimDoJogo());
		}
	}

}
