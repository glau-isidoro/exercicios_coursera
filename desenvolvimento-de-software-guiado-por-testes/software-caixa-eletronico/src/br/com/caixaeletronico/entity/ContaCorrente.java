package br.com.caixaeletronico.entity;

public class ContaCorrente {

	private String senha;
	private String numeroConta;
	private int saldo;
	
	public ContaCorrente(String senha, String numeroConta) {
		this.senha = senha;
		this.numeroConta = numeroConta;
	}

	public String getSenha() {
		return senha;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int novoSaldo) {
		this.saldo = novoSaldo;
	}

}
