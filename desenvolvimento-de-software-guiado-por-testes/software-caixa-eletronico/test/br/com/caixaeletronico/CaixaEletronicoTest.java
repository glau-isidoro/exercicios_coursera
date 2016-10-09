package br.com.caixaeletronico;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.caixaeletronico.entity.ContaCorrente;
import br.com.caixaeletronico.service.Hardware;
import br.com.caixaeletronico.service.ServicoRemoto;
import br.com.caixaeletronico.service.impl.mock.HardwareDefeitoMock;
import br.com.caixaeletronico.service.impl.mock.HardwareMock;
import br.com.caixaeletronico.service.impl.mock.ServicoRemotoMock;

public class CaixaEletronicoTest {
	
	public static ContaCorrente conta1 = new ContaCorrente("sEnH4", "666-3");
	public static ContaCorrente conta2 = new ContaCorrente("SeNh4", "333-6");
	public static CaixaEletronico caixa;
	public static ServicoRemoto servico;
	public static Hardware hardware;
	public static Hardware hardwareFalhou;
	
	@Before
	public void inicializar() {
		servico = new ServicoRemotoMock();
		hardware = new HardwareMock();
		hardwareFalhou = new HardwareDefeitoMock();
		caixa = new CaixaEletronico();
		servico.adicionarConta(conta1);
		servico.adicionarConta(conta2);
		hardware.adicionarContaMap("8881.4043.2901.7730", "666-3");
		hardware.adicionarContaMap("6541.2563.2865.7245", "333-6");
	}

	@Test
	public void usuarioAutenticado() {
		assertEquals("Usuário Autenticado.",
				caixa.logar("8881.4043.2901.7730", "sEnH4", servico, hardware));
	}
	
	@Test
	public void naoPodeAutenticarUsuarioComSenhaErrada() {
		assertEquals("Não foi possível autenticar o usuário.",
				caixa.logar("8881.4043.2901.7730", "errou4senha", servico, hardware));
	}
	
	@Test
	public void naoLogaContaInexistente() {
		assertEquals("Conta inexistente.",
				caixa.logar("8991.4043.2901.7730", "sEnH4", servico, hardware));
	}
	
	@Test
	public void depositoEfetuadoComSucesso() {
		caixa.logar("8881.4043.2901.7730", "sEnH4", servico, hardware);
		assertEquals("Depósito recebido com sucesso!",
				caixa.depositar(45, "666-3", servico, hardware));
	}

	@Test
	public void naoDepositaValorInvalido() {
		caixa.logar("8881.4043.2901.7730", "sEnH4", servico, hardware);
		assertEquals("Valor inválido.",
				caixa.depositar(-500, "666-3", servico, hardware));
	}
	
	@Test
	public void naoDepositaSeHardwareNaoFuncionar() {
		assertEquals("Deposito não efetuado, erro ao ler envelope. Falha no funcionamento do hardware.",
				caixa.depositar(500, "666-3", servico, hardwareFalhou));
	}
	
	@Test
	public void saqueEfetuadoComSucesso() throws Exception {
		caixa.logar("8881.4043.2901.7730", "sEnH4", servico, hardware);
		caixa.depositar(500, "666-3", servico, hardware);
		assertEquals("Retire o dinheiro.", caixa.sacar(150, servico, hardware));
	}
	
	@Test
	public void naoSacaSeValorMaiorQueSaldo() throws Exception {
		caixa.logar("6541.2563.2865.7245", "SeNh4", servico, hardware);
		caixa.depositar(100, "333-6", servico, hardware);
		assertEquals("Saldo insuficiente.", caixa.sacar(500, servico, hardware));
	}
	
	@Test
	public void naoSacaSeDerDefeitoNoHardware() throws Exception {
		caixa.logar("8881.4043.2901.7730", "sEnH4", servico, hardware);
		caixa.depositar(500, "666-3", servico, hardware);
		assertEquals("Saque não efetuado. Falha no funcionamento do hardware.",
				caixa.sacar(150, servico, hardwareFalhou));
	}
	
	@Test
	public void mostrarSaldoNaTela() throws Exception {
		caixa.logar("8881.4043.2901.7730", "sEnH4", servico, hardware);
		caixa.depositar(378, "666-3", servico, hardware);
		assertEquals("O saldo é R$378,00.", caixa.saldo());
	}
	
	@Test(expected=Exception.class)
	public void naoMostraSaldoDeUsuarioNaoLogado() throws Exception {
		caixa.saldo();
	}
	
	@Test(expected=Exception.class)
	public void naoSacaDeUsuarioNaoLogado() throws Exception {
		caixa.sacar(500, servico, hardware);
	}
	
	@Test
	public void depositaDeUsuarioNaoLogadoEmContaExistente() {
		assertEquals("Depósito recebido com sucesso!",
				caixa.depositar(85, "666-3", servico, hardware));
	}
	
}
