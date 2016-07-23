import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarrinhoDeComprasTest {

	static Produto p1;
	static Produto p2;
	static Produto p3;
	static Produto p4;
	static Produto p5;
	static Produto p6;
	static Produto p7;
	static Produto p8;
	CarrinhoDeCompras pedido;
	
	@BeforeClass
	public static void criaProdutos() {
		p1 = new ProdutoComTamanho("camiseta", 'p', 010101, 29.90);
		p2 = new ProdutoComTamanho("camiseta", 'p', 010101, 29.90);
		p3 = new ProdutoComTamanho("camiseta", 'm', 010101, 29.90);
		p4 = new ProdutoComTamanho("jaqueta", 'g', 040404, 59.90);
		p5 = new ProdutoComTamanho("bermuda", 'm', 030303, 39.90);
		p6 = new ProdutoComTamanho("bermuda", 'g', 030303, 39.90);
		p7 = new ProdutoComTamanho("meia-calça", 'm', 050505, 9.90);
		p8 = new Produto("meia-calça tamanho único", 050505, 9.90);
	}
	
	@Before
	public void criaCarrinho() {
		pedido = new CarrinhoDeCompras();
	}
	
	@Test
	public void instanciasDiferentesProdutosIguaisSaoProdutosIguaisProCarrinho() {
		pedido.adicionaProduto(p1, 2);
		pedido.adicionaProduto(p2, 1);
		assertEquals(3, pedido.quantidadeDeAlgumProdutoDoCarrinho(p1));	
	}
	
	@Test
	public void produtosDiferentesCodigosIguaisSaoProdutosDiferentesProCarrinho() {
		pedido.adicionaProduto(p7, 3);
		pedido.adicionaProduto(p8, 2);
		assertFalse(p7.equals(p8));
		assertEquals(3, pedido.quantidadeDeAlgumProdutoDoCarrinho(p7));
		assertEquals(2, pedido.quantidadeDeAlgumProdutoDoCarrinho(p8));
	}

	@Test
	public void produtosIguaisTamanhosDiferentesSãoProdutosDiferentesProCarrinho() {
		pedido.adicionaProduto(p2, 3);
		pedido.adicionaProduto(p3, 2);
		assertNotEquals(5, pedido.quantidadeDeAlgumProdutoDoCarrinho(p2));
		assertEquals(3, pedido.quantidadeDeAlgumProdutoDoCarrinho(p2));
		assertEquals(2, pedido.quantidadeDeAlgumProdutoDoCarrinho(p3));
	}
	
	@Test
	public void removeProdutosDoCarrinho() {
		pedido.adicionaProduto(p3, 5);
		pedido.adicionaProduto(p5, 1);
		pedido.removeProduto(p3, 3);
		pedido.removeProduto(p5, 1);
		assertEquals(2, pedido.quantidadeDeAlgumProdutoDoCarrinho(p3));
		assertEquals(0, pedido.quantidadeDeAlgumProdutoDoCarrinho(p5));
	}
	
	@Test
	public void naoRemoveQuandoQuantidadeMaiorQueTemNoCarrinhoOuQuandoProdutoNaoTaNoCarrinho() {
		pedido.adicionaProduto(p4, 1);
		pedido.removeProduto(p6, 3);
		pedido.removeProduto(p4, 2);
		assertEquals(1, pedido.quantidadeDeAlgumProdutoDoCarrinho(p4));
		assertEquals(0, pedido.quantidadeDeAlgumProdutoDoCarrinho(p5));
	}
	
	@Test
	public void calculaPrecoTotalDaCompra() {
		pedido.adicionaProduto(p1, 1);
		pedido.adicionaProduto(p2, 2);
		pedido.adicionaProduto(p3, 1);
		pedido.adicionaProduto(p4, 2);
		pedido.adicionaProduto(p5, 1);
		pedido.adicionaProduto(p6, 2);
		pedido.adicionaProduto(p7, 1);
		pedido.adicionaProduto(p8, 2);
		assertEquals(388.80, pedido.calculaValorTotalDaCompra(), 0.00001);
		assertNotEquals(388.79, pedido.calculaValorTotalDaCompra(), 0.00001);
		assertNotEquals(388.81, pedido.calculaValorTotalDaCompra(), 0.00001);
	}
}
