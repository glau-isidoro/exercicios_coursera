package pizzaria;


public class Principal {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		Pizza pizza4 = new Pizza();
		
		pizza1.adicionaIngrediente("molho de tomate");
		pizza1.adicionaIngrediente("muzzarella");
		pizza2.adicionaIngrediente("molho de tomate");
		pizza2.adicionaIngrediente("calabresa");
		pizza2.adicionaIngrediente("cebola");
		pizza3.adicionaIngrediente("muzzarella");
		pizza3.adicionaIngrediente("bacon");
		pizza3.adicionaIngrediente("manjericão");
		pizza3.adicionaIngrediente("azeitona");
		pizza3.adicionaIngrediente("picles");
		pizza3.adicionaIngrediente("muzzarella");
		
		CarrinhoDeCompras umPedido = new CarrinhoDeCompras();
		umPedido.adicionaPizzaNoCarrinho(pizza1);
		umPedido.adicionaPizzaNoCarrinho(pizza2);
		umPedido.adicionaPizzaNoCarrinho(pizza3);
		umPedido.adicionaPizzaNoCarrinho(pizza4);
		
		CarrinhoDeCompras outroPedido = new CarrinhoDeCompras();
		Pizza pizza5 = new Pizza();
		Pizza pizza6 = new Pizza();
		pizza5.adicionaIngrediente("bacon");
		pizza5.adicionaIngrediente("picles");
		pizza5.adicionaIngrediente("muzzarella");
		pizza6.adicionaIngrediente("calabresa");
		outroPedido.adicionaPizzaNoCarrinho(pizza5);
		outroPedido.adicionaPizzaNoCarrinho(pizza6);
		
	
		System.out.println("Preço do pedido: " + umPedido.precoTotalDoPedido() + " por " + umPedido.quantasPizzas + " pizza(s)");
		System.out.println("Preço do pedido: " + outroPedido.precoTotalDoPedido() + " por " + outroPedido.quantasPizzas + " pizza(s)");
			
		System.out.println("Total de ingredientes usados em todas as pizzas: " + Pizza.totalIngredientes);
		
		System.out.println("Total usado de cada ingrediente:");
		Pizza.mostrarQtdDeCadaIngrediente();

	}

}
