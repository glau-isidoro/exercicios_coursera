import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void codigosIguaisProdutosIguais() {
		Produto p1 = new Produto("camiseta gola V", 010101, 25.90);
		Produto p2 = new Produto("camiseta gola U", 010101, 25.90);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	public void codigosDiferentesProdutosDiferentes() {
		Produto p1 = new Produto("calça", 020202, 59.90);
		Produto p2 = new Produto("bermuda", 030303, 39.90);
		assertFalse(p1.equals(p2));
	}

}
