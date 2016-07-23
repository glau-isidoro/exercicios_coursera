package jogo.logica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralharDois implements Embaralhador {

	String palavraEmbaralhada = "";
	private int pontuacao;
	
	@Override
	public void setPontuacao(String palavra) {
		if(palavra.length() > 6) {
			pontuacao = 5;
		} else {
			pontuacao = 4;
		}
	}
	
	@Override
	public int getPontuacao() {
		return pontuacao;
	}
	
	@Override
	public String embaralhar(String palavraOriginal) {
		List<String> letters = Arrays.asList(palavraOriginal.split(""));
		Collections.sort(letters);
		for (String letter : letters) {
			palavraEmbaralhada += letter;
		}
		setPontuacao(palavraEmbaralhada);
		return palavraEmbaralhada;
	}

}
