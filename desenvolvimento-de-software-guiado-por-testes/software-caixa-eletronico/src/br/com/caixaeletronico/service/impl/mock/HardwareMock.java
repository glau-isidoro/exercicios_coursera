package br.com.caixaeletronico.service.impl.mock;

import java.util.HashMap;
import java.util.Map;

import br.com.caixaeletronico.service.Hardware;
import br.com.caixaeletronico.service.ServicoRemoto;

public class HardwareMock implements Hardware {
	
	private Map<String, String> contasMap = new HashMap<>();

	@Override
	public String pegarNumeroDaContaCartao(String numeroCartao) {
		if(contasMap.containsKey(numeroCartao)) 
			return contasMap.get(numeroCartao);	
		throw new RuntimeException("Conta inexistente.");
	}

	@Override
	public void entregarDinheiro(int valor) {}

	@Override
	public void lerEnvelope(String numeroConta) throws RuntimeException {
		ServicoRemoto servico = new ServicoRemotoMock();
		servico.adicionarConta(servico.recuperarConta(numeroConta));
	}
	
	@Override
	public void adicionarContaMap(String numeroCartao, String numeroConta) {
		contasMap.put(numeroCartao, numeroConta);
	}

}
