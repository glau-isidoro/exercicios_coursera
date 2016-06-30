package pizzaria;


public class CarrinhoDeCompras {
	
		
	private double precoTotal;
	int quantasPizzas;
		
		
	public void adicionaPizzaNoCarrinho(Pizza pizza) {
			if (pizza.getQuantidadeDeIngredientes() >= 1) {
				this.precoTotal += pizza.getPreco();
				quantasPizzas += 1;
				System.out.println("Pizza adicionada no carrinho com sucesso!");
			} else {
				System.out.println("A pizza precisa de ingredientes para ser adicionada no carrinho.");
			}
	}
	
	
	public double precoTotalDoPedido() {
		return this.precoTotal;
	}
		
}
	
	
	

