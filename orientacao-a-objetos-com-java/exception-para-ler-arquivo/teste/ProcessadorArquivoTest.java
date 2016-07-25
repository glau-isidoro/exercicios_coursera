import static org.junit.Assert.*;

import org.junit.Test;


public class ProcessadorArquivoTest {

	@Test
	public void testSucesso() throws LeituraArquivoException {
		ProcessadorArquivo.processa("ler-desse-arquivo.txt");
		assertEquals("Glaucia", ProcessadorArquivo.conteudoArquivo.get("nome"));
		assertEquals("Isidoro", ProcessadorArquivo.conteudoArquivo.get("sobrenome"));
		assertEquals("28", ProcessadorArquivo.conteudoArquivo.get("idade"));
	}

	
	
	@Test(expected=LeituraArquivoException.class)
	public void testErroPraLerArquivo() throws LeituraArquivoException {
		ProcessadorArquivo.processa("arquivoInexistente.txt");
	}
	
	@Test
	public void testErroPraLerArquivoTryCatch() {
		try{
			ProcessadorArquivo.processa("arquivoInexistente.txt");
		} catch (LeituraArquivoException e) {
			assertTrue(e.getMessage().contains("Erro ao abrir o arquivo"));
		}
	}
	
	
	
	@Test(expected=LeituraArquivoException.class)
	public void testArquivoVazio() throws LeituraArquivoException {
		ProcessadorArquivo.processa("vazio.txt");
	}
	
	@Test
	public void testArquivoVazioTryCatch() {
		try{
			ProcessadorArquivo.processa("vazio.txt");
		} catch (LeituraArquivoException e) {
		assertTrue(e.getMessage().contains("Arquivo vazio"));
		}
	}
	
	
	
	@Test(expected=LeituraArquivoException.class)
	public void testArquivoMuitasFlechas() throws LeituraArquivoException {
		ProcessadorArquivo.processa("invalidoMaisFlechas.txt");
	}
	
	@Test
	public void testArquivoMuitasFlechasTryCatch() {
		try{
			ProcessadorArquivo.processa("invalidoMaisFlechas.txt");
		} catch (LeituraArquivoException e) {
			assertTrue(e.getMessage().contains("Formato de arquivo inválido"));
		}
	}
	
	
	
	@Test(expected=LeituraArquivoException.class)
	public void testArquivoSemFlechas() throws LeituraArquivoException {
		ProcessadorArquivo.processa("invalidoSemFlechas.txt");
	}
	
	@Test
	public void testArquivoSemFlechasTryCatch() {
		try{
			ProcessadorArquivo.processa("invalidoSemFlechas.txt");
		} catch (LeituraArquivoException e) {
			assertTrue(e.getMessage().contains("Formato de arquivo inválido"));
		}
	}
	
	
}
