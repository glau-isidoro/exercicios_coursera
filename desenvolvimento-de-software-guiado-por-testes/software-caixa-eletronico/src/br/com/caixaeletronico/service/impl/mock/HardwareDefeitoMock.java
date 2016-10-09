package br.com.caixaeletronico.service.impl.mock;

import br.com.caixaeletronico.service.Hardware;

public class HardwareDefeitoMock implements Hardware {

	@Override
	public String pegarNumeroDaContaCartao(String numeroCartao) {
		throw new RuntimeException("Falha no funcionamento do hardware.");
	}

	@Override
	public void entregarDinheiro(int valor) {
		throw new RuntimeException("Falha no funcionamento do hardware.");
	}

	@Override
	public void lerEnvelope(String codigoEnvelope) {
		throw new RuntimeException("Falha no funcionamento do hardware.");
	}

	@Override
	public void adicionarContaMap(String numeroCartao, String numeroConta) {
		throw new RuntimeException("Falha no funcionamento do hardware.");
	}

}
