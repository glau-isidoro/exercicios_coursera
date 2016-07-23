package pizzaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarrinhoDeComprasTest {

	@Test
	public void testaSeCarrinhoAdicionaPizzaSemIngredientes() {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		CarrinhoDeCompras umPedido = new CarrinhoDeCompras();
		umPedido.adicionaPizzaNoCarrinho(pizza1);
		umPedido.adicionaPizzaNoCarrinho(pizza2);
		umPedido.adicionaPizzaNoCarrinho(pizza3);
		
		assertEquals(0, umPedido.quantasPizzas, 0.00001);
	}
	
	@Test
	public void testaSomaDePrecosDasPizzasNoCarrinho() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("molho de tomate");
		pizza1.adicionaIngrediente("muzzarella");
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("molho de tomate");
		pizza2.adicionaIngrediente("muzzarella");
		pizza2.adicionaIngrediente("calabresa");
		pizza2.adicionaIngrediente("cebola");
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("molho de tomate");
		pizza3.adicionaIngrediente("muzzarella");
		pizza3.adicionaIngrediente("bacon");
		pizza3.adicionaIngrediente("cebola");
		pizza3.adicionaIngrediente("picles");
		pizza3.adicionaIngrediente("azeitona");
		
		CarrinhoDeCompras umPedido = new CarrinhoDeCompras();
		umPedido.adicionaPizzaNoCarrinho(pizza1);
		umPedido.adicionaPizzaNoCarrinho(pizza2);
		umPedido.adicionaPizzaNoCarrinho(pizza3);
		
		assertEquals(58, umPedido.precoTotalDoPedido(), 0.00001);
	}


}
