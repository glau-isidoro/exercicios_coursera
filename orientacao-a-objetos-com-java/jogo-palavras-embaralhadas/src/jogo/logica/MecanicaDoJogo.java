package jogo.logica;

public interface MecanicaDoJogo {
	
	public int getVidas();
	public int getPontos();
	public int getChances();
	public String comecarJogo();
	public String novaPalavra();
	public String tentativa(String chute);
	public String fimDoJogo();
	public String ganhouJogo();
}
