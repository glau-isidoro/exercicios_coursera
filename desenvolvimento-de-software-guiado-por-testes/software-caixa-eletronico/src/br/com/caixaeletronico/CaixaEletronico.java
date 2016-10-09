package br.com.caixaeletronico;

import br.com.caixaeletronico.entity.ContaCorrente;
import br.com.caixaeletronico.service.Hardware;
import br.com.caixaeletronico.service.ServicoRemoto;

public class CaixaEletronico {
	
	private ContaCorrente conta;

	public String logar(String numeroCartao, String senha, ServicoRemoto servico, Hardware hardware) {
		String numeroConta;
		try {
			numeroConta = hardware.pegarNumeroDaContaCartao(numeroCartao);
		} catch (RuntimeException e) {
			return e.getMessage();
		}
		if (servico.recuperarConta(numeroConta).getSenha() == senha) {
			this.conta = servico.recuperarConta(numeroConta);
			return "Usuário Autenticado.";
		} else {
			return "Não foi possível autenticar o usuário.";
		}
	}
	
	public String sacar(int valor, ServicoRemoto servico, Hardware hardware) throws Exception {
		if (this.conta.getSaldo() >= valor) {
			try{
				hardware.entregarDinheiro(valor);
			} catch (RuntimeException e) {
				return "Saque não efetuado. " + e.getMessage();
			}
			servico.persistirConta(this.conta, valor, false);
			return "Retire o dinheiro.";
		} else {
			return "Saldo insuficiente.";
		}
	}

	public String depositar(int deposito, String numeroConta, ServicoRemoto servico, Hardware hardware) {
		if(deposito <= 0)
			return "Valor inválido.";
		try {
			hardware.lerEnvelope(numeroConta);
		} catch (Exception e) {
			return "Deposito não efetuado, erro ao ler envelope. " + e.getMessage();
		}
		servico.persistirConta(servico.recuperarConta(numeroConta), deposito, true);
		return "Depósito recebido com sucesso!";
	}
	
	public String saldo() throws Exception {
		return "O saldo é R$" + this.conta.getSaldo() + ",00.";
	}

}
