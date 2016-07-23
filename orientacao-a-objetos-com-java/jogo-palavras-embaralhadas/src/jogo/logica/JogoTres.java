package jogo.logica;

public class JogoTres implements MecanicaDoJogo {

	private String palavraEmbaralhada;
	private String palavra;
	private int vidas;
	private int pontos;
	private int chances;
	private int pontoDaPalavra;
	

	@Override
	public int getVidas() {
		return vidas;
	}

	@Override
	public int getPontos() {
		return pontos;
	}
	
	@Override
	public int getChances() {
		return chances;
	}

	@Override
	public String comecarJogo() {
		vidas = 1;
		pontos = 0;
		chances = 0;
		return "Você tem 3 chances para acertar cada palavra. Se não acertar em 3 chances, o jogo acaba. \n"
				+ "Cada nível de dificuldade tem uma pontuação diferente que varia de 1 a 5.";
	}
	
	@Override
	public String tentativa(String chute) {
		String resultado = "";
		if(palavra.equals(chute)) {
			pontos += pontoDaPalavra;
			chances = 0;
			resultado = "Parabéns, você acertou!\nGanhou " + pontoDaPalavra + " pontos com essa palavra.";
		} else {
			chances--;
			if(chances == 0) {
				vidas--;
			}
			resultado = "Você errou. Ainda tem " + getChances() + " chances.";
		}
		return resultado;
	}
	
	@Override
	public String novaPalavra() {
		BancoDePalavras palavraCerta = new BancoDePalavras();
		FabricaEmbaralhadores embaralharPalavra = new FabricaEmbaralhadores();
		Embaralhador embaralhar = embaralharPalavra.escolherEmbaralhador();
		palavra = palavraCerta.escolherPalavra();
		palavraEmbaralhada = embaralhar.embaralhar(palavra);
		pontoDaPalavra = embaralhar.getPontuacao();
		chances = 3;
		return palavraEmbaralhada;
	}
	
	@Override
	public String ganhouJogo() {
		return "Ufa, até que enfim não conseguiu descobrir que palavra que era! Você fez " + getPontos() + " pontos, parabéns!";
	}
	
	@Override
	public String fimDoJogo() {
	return "Não foi dessa vez... Infelizmente você fez só " + getPontos() + " pontos.";
	}
}
