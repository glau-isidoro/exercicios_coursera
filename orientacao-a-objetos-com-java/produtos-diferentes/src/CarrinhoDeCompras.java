import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	
	Map<Produto, Integer> carrinhoDeCompras = new HashMap<>();;
	

	public void adicionaProduto(Produto produto, int quantidade) {
		if(carrinhoDeCompras.containsKey(produto)) {
			int jaTem = carrinhoDeCompras.get(produto);
			carrinhoDeCompras.replace(produto, jaTem += (Integer) quantidade);
		} else {
			carrinhoDeCompras.put(produto, quantidade);
		}
		System.out.println("Produto adicionado com sucesso!");
	}
	
	
	public void removeProduto(Produto produto, int quantidade) {
		if(carrinhoDeCompras.containsKey(produto)) {
			int quantasTem = carrinhoDeCompras.get(produto);
			if(quantasTem > quantidade) {
				carrinhoDeCompras.replace(produto, quantasTem -= (Integer) quantidade);
			} else if(quantasTem == quantidade) {
				carrinhoDeCompras.remove(produto);
			} else {
				System.out.println("Você só pode remover até " + quantasTem + " peças desse produto.");
			}
		} else {
			System.out.println("Esse produto não existe no carrinho, portanto não pode ser removido.");
		}
	}
	
	
	public double calculaValorTotalDaCompra() {
		double valorTotal = 0;
		for(Produto produto : carrinhoDeCompras.keySet()) {
			int quantidade = carrinhoDeCompras.get(produto);
			double valorPorTipoDeProduto = quantidade * produto.getPreco();
			valorTotal += valorPorTipoDeProduto;
		}
		valorTotal = (double)Math.round(valorTotal * 100) / 100;
		System.out.println("O total da compra é de R$" + valorTotal);
		return valorTotal;
	}
	
	
	public int quantidadeDeAlgumProdutoDoCarrinho(Produto produto) {
		if(carrinhoDeCompras.containsKey(produto)) {
			return carrinhoDeCompras.get(produto);
		} else {
			System.out.println("Esse produto não está no carrinho");
			return 0;
		}
	}
}
