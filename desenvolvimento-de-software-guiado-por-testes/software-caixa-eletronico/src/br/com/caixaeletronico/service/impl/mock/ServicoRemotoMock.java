package br.com.caixaeletronico.service.impl.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.caixaeletronico.entity.ContaCorrente;
import br.com.caixaeletronico.service.ServicoRemoto;

public class ServicoRemotoMock implements ServicoRemoto {
	
	private static List<ContaCorrente> contas = new ArrayList<>();

	@Override
	public ContaCorrente recuperarConta(String numeroConta) {
		for(ContaCorrente conta : contas) {
			if(conta.getNumeroConta() == numeroConta)
				return conta;
		}
		throw new RuntimeException("Conta inexistente.");
	}

	@Override
	public void persistirConta(ContaCorrente conta, int valor, boolean depositar) {
		int saldo = conta.getSaldo();
		if(depositar) {
			conta.setSaldo(saldo += valor);
		} else {
			conta.setSaldo(saldo -= valor);
		}
	}
	
	@Override
	public void adicionarConta(ContaCorrente conta) {
		contas.add(conta);
	}

}
