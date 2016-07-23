import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoComTamanhoTest {

	@Test
	public void codigosIguaisTamanhosIguaisProdutosIguais() {
		Produto p1 = new ProdutoComTamanho("camiseta gola V", 'm', 010101, 25.90);
		Produto p2 = new ProdutoComTamanho("camiseta gola U", 'm', 010101, 25.90);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	public void codigosIguaisTamanhosDiferentesProdutosDiferentes() {
		Produto p1 = new ProdutoComTamanho("jaqueta", 'p', 040404, 59.90);
		Produto p2 = new ProdutoComTamanho("jaqueta", 'g', 040404, 59.90);
		assertFalse(p1.equals(p2));
	}


}
