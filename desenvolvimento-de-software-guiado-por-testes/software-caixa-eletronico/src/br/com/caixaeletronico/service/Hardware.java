package br.com.caixaeletronico.service;

public interface Hardware {
	
	public String pegarNumeroDaContaCartao(String numeroCartao);	
	public void entregarDinheiro(int valor);
	public void lerEnvelope(String codigoEnvelope);	
	public void adicionarContaMap(String numeroCartao, String numeroConta);
	
}
