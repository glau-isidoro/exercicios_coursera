package pizzaria;


public class Principal {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		pizza1.adicionaIngrediente("molho de tomate");
		pizza1.adicionaIngrediente("muzzarella");
		pizza2.adicionaIngrediente("molho de tomate");
		pizza2.adicionaIngrediente("calabresa");
		pizza2.adicionaIngrediente("cebola");
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
		
	
		System.out.println("Preço do pedido: " + umPedido.precoTotalDoPedido() + " por " + umPedido.quantasPizzas + " pizza(s)");
			
		System.out.println("Total de ingredientes usados em todas as pizzas: " + Pizza.totalIngredientes);
		
		System.out.println("Total usado de cada ingrediente:");
		System.out.println(Pizza.mapaDeIngredientes.entrySet());

	}

}
