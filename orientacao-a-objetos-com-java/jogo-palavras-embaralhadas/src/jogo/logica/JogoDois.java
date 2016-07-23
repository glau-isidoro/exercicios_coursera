package jogo.logica;

public class JogoDois implements MecanicaDoJogo {

	private String palavraEmbaralhada;
	private String palavra;
	private int vidas;
	private int pontos;
	private int chances;
	
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
		vidas = 3;
		pontos = 0;
		chances = 0;
		return "Você começa com 3 vidas, e tem 3 chances para acertar cada palavra. Quando perder as 3 chances, perde uma vida e vai pra próxima palavra.\n"
				+ "Ganha 3 pontos se acertar na primeira tentativa, 2 na segunda e 1 na terceira.\nO jogo acaba quando acabarem suas vidas.";
	}
	
	@Override
	public String tentativa(String chute) {
		String resultado = "";
		if(palavra.equals(chute)) {
			pontos += chances;
			resultado = "Parabéns, você acertou!\nSomou mais " + chances + " na sua pontuação!";
			chances = 0;
		} else {
			chances--;
			if(chances == 0) {
				vidas--;
			}
			resultado = "Você errou. Agora você tem " + chances + " chances e " + vidas + " vidas.";
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
		chances = 3;
		return palavraEmbaralhada;
	}
	
	@Override
	public String ganhouJogo() {
		return "Você estava indo bem, mas suas vidas acabaram. Você fez " + pontos + " pontos, parabéns!";
	}
	
	@Override
	public String fimDoJogo() {
	return "Ixi, suas vidas já acabaram. Infelizmente você fez só " + pontos + " pontos.";
	}
}
