package br.com.caixaeletronico.service;
import br.com.caixaeletronico.entity.ContaCorrente;

public interface ServicoRemoto {
	
	public ContaCorrente recuperarConta(String numeroConta);	
	public void persistirConta(ContaCorrente conta, int valor, boolean depositar);	
	public void adicionarConta(ContaCorrente conta);
	
}
