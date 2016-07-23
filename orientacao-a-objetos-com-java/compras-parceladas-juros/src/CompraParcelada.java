
public class CompraParcelada extends Compra {

	private int parcelas;
	private double juros;
	private double totalCompra;
	
	public CompraParcelada(double valorProdutos, int parcelas, double juros) {
		super(valorProdutos);
		this.parcelas = parcelas;
		this.juros = juros;
	}

	@Override
	public double total() {
		totalCompra = getValorProdutos() * (Math.pow(1 + juros, parcelas));
		totalCompra = (double)Math.round(totalCompra * 100) / 100;
		return totalCompra;
	}
}
