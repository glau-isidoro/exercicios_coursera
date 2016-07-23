package jogo.logica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralharTres implements Embaralhador {

	String palavraEmbaralhada = "";
	private int pontuacao;
		
	@Override
	public void setPontuacao(String palavra) {
		if(palavra.length() > 6) {
			pontuacao = 2;
		} else {
			pontuacao = 1;
		}
	}
	
	@Override
	public int getPontuacao() {
		return pontuacao;
	}
		
	@Override
	public String embaralhar(String palavraOriginal) {
		List<String> letters = Arrays.asList(palavraOriginal.split(""));
		Collections.reverse(letters);
		for (String letter : letters) {
			palavraEmbaralhada += letter;
		}
		setPontuacao(palavraEmbaralhada);
		return palavraEmbaralhada;
	}

}

	
