package pizzaria;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	private int quantidadeDeIngredientes;
	private double preco;
	
	static int totalIngredientes = 0;
	static Map<String, Integer> mapaDeIngredientes = new HashMap<>();
	
	
	public void adicionaIngrediente(String novoIngrediente) {
		this.quantidadeDeIngredientes += 1;
		contabilizaIngrediente(novoIngrediente);
	}
	
	
	public static void contabilizaIngrediente(String ingrediente) {
		int quantidade;
		if(mapaDeIngredientes.containsKey(ingrediente)) {
			quantidade = mapaDeIngredientes.get(ingrediente);
			mapaDeIngredientes.replace(ingrediente, quantidade += (Integer) 1);
		} else {
			totalIngredientes += 1;
			mapaDeIngredientes.put(ingrediente, quantidade = 1);
		}
	}
	
	
	public double getPreco() {
		if(this.quantidadeDeIngredientes <= 2) {
			this.preco = 15;
		}
		if(this.quantidadeDeIngredientes >= 3 && this.quantidadeDeIngredientes <= 5) {
			this.preco = 20;
		}
		if(this.quantidadeDeIngredientes > 5) {
			this.preco = 23;
		}
		return preco;
	}


	public int getQuantidadeDeIngredientes() {
		return quantidadeDeIngredientes;
	}

}
