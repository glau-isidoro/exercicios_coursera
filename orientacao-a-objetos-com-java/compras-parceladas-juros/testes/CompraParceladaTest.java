import static org.junit.Assert.*;

import org.junit.Test;

public class CompraParceladaTest {

	double valorProdutos;
	
	@Test
	public void compra1parcela() {
		valorProdutos = 90;
		CompraParcelada c = new CompraParcelada(valorProdutos, 1, 0.02);
		System.out.println(c.total());
		assertEquals(91.80, c.total(), 0.00001);
	}

	@Test
	public void compra2parcelas() {
		valorProdutos = 270;
		CompraParcelada c = new CompraParcelada(valorProdutos, 2, 0.02);
		assertEquals(280.91, c.total(), 0.00001);
	}
	
	@Test
	public void compra5parcelas() {
		valorProdutos = 483;
		CompraParcelada c = new CompraParcelada(valorProdutos, 5, 0.02);
		assertEquals(533.27, c.total(), 0.00001);
	}
	
	@Test
	public void compra10parcelas() {
		valorProdutos = 735;
		CompraParcelada c = new CompraParcelada(valorProdutos, 10, 0.02);
		assertEquals(895.96, c.total(), 0.00001);
	}
}
