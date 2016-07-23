package jogo.logica;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jogo.logica.BancoDePalavras;
import jogo.logica.Embaralhador;
import jogo.logica.EmbaralharDois;
import jogo.logica.EmbaralharTres;
import jogo.logica.EmbaralharUm;

public class EmbaralhadorTest {
	
	private String palavra;
	
	@Before
	public void pegaPalavra() {
		BancoDePalavras teste = new BancoDePalavras();
		palavra = teste.escolherPalavra();
	}
	
	@Test
	public void testEmbaralharUm() {
		Embaralhador embaralhaUm = new EmbaralharUm();	
		assertNotEquals(palavra, embaralhaUm.embaralhar(palavra));
	}
	
	@Test
	public void testEmbaralharDois() {
		Embaralhador embaralhaDois = new EmbaralharDois();
		assertNotEquals(palavra, embaralhaDois.embaralhar(palavra));
	}
	
	@Test
	public void testEmbaralharTres() {
		Embaralhador embaralhaTres = new EmbaralharTres();
		assertNotEquals(palavra, embaralhaTres.embaralhar(palavra));
	}

}
