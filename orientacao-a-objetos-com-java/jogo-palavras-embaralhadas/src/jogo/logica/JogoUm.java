package jogo.logica;

public class JogoUm implements MecanicaDoJogo {

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
		return "Você começa com 3 vidas. A cada erro, você perde 2 vidas e recebe outra palavra. \nQuando acertar, ganha uma "
				+ "vida, e os pontos são calculados conforme o tamanho das palavras. \nO jogo acaba quando acabarem suas vidas.";
	}
	
	@Override
	public String tentativa(String chute) {
		String resultado = "";
		if(palavra.equals(chute)) {
			vidas++;
			chances--;
			pontos += (palavra.length() / 3);
			resultado = "Parabéns, você acertou!\nAgora você tem " + vidas + " vidas e ganhou mais " + (palavra.length() / 3) + " pontos!";
		} else {
			vidas -= 2;
			chances--;
			resultado = "Você errou.\nVocê ainda tem " + vidas + " vidas.";
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
		chances++;
		return palavraEmbaralhada;
	}
	
	@Override
	public String ganhouJogo() {
		return "Por um momento achei que você fosse jogar pra sempre! Você fez " + pontos + " pontos, parabéns!";
	}
	
	@Override
	public String fimDoJogo() {
	return "Ixi, suas vidas já acabaram... Infelizmente você fez só " + pontos + " pontos.";
	}
	
}
