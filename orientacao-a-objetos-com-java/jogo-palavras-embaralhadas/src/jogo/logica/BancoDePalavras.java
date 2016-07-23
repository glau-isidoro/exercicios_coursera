package jogo.logica;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {

	private String palavraSorteada;
	private Random rand = new Random();
	private int qualPalavra = Math.abs(rand.nextInt()) % 40;
	private Scanner entrada;
	
	public String escolherPalavra() {
		if(qualPalavra > 40 || qualPalavra == 0) {
			qualPalavra = 1;
		}
		try {
			InputStream file = new FileInputStream("listadepalavras.txt");
			entrada = new Scanner(file);
			for(int i = 1; i <= qualPalavra; i++) {
				palavraSorteada = entrada.nextLine();
			}
			entrada.close();
		} catch(IOException e) {
		}
		return palavraSorteada;
	}
	
}
