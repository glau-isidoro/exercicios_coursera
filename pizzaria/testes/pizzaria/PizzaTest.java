package pizzaria;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class PizzaTest {

	@After
	public void zeraIngredientes() {
		Pizza.zeraIngredientes();
	}
	
	@Test
	public void testaPrecoPizza2ingredientes() {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("molho de tomate");
		pizza1.adicionaIngrediente("muzzarella");
		assertEquals(15, pizza1.getPreco(), 0.00001);
	}
	
	@Test
	public void testaPrecoPizza3a5ingredientes() {
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("molho de tomate");
		pizza2.adicionaIngrediente("muzzarella");
		pizza2.adicionaIngrediente("calabresa");
		pizza2.adicionaIngrediente("cebola");
		assertEquals(20, pizza2.getPreco(), 0.00001);
	}
	
	@Test
	public void testaPrecoMaisDe5ingredientes() {
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("molho de tomate");
		pizza3.adicionaIngrediente("muzzarella");
		pizza3.adicionaIngrediente("bacon");
		pizza3.adicionaIngrediente("cebola");
		pizza3.adicionaIngrediente("picles");
		pizza3.adicionaIngrediente("azeitona");
		assertEquals(23, pizza3.getPreco(), 0.00001);
	}
	
	@Test
	public void verificaListaIngredientes() {
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
		
		assertEquals(3, Pizza.mapaDeIngredientes.get("molho de tomate"), 0.00001);
		assertEquals(3, Pizza.mapaDeIngredientes.get("muzzarella"), 0.00001);
		assertEquals(1, Pizza.mapaDeIngredientes.get("calabresa"), 0.00001);
		assertEquals(2, Pizza.mapaDeIngredientes.get("cebola"), 0.00001);
		assertEquals(1, Pizza.mapaDeIngredientes.get("bacon"), 0.00001);
		assertEquals(1, Pizza.mapaDeIngredientes.get("picles"), 0.00001);
		assertEquals(1, Pizza.mapaDeIngredientes.get("azeitona"), 0.00001);	
	}


}
