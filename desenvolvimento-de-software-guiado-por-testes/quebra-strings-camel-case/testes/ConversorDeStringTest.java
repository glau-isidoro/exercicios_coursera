import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ConversorDeStringTest {
	
	@Test	
	public void converteUmNomeMinusculo() throws Exception {
		  List<String> listaDeString = ConversorDeString.converterCamelCase("nome");
	      assertEquals(1, listaDeString.size());
	      assertEquals("nome", listaDeString.get(0));
	}
	
	@Test
    public void converterUmNomeMaiusculo() throws Exception {
        List<String> listaDeString = ConversorDeString.converterCamelCase("Nome");
        assertEquals(1, listaDeString.size());
        assertEquals("nome", listaDeString.get(0));
    }
	
	@Test
    public void converterNomeComposto() throws Exception {
        List<String> listaDeString = ConversorDeString.converterCamelCase("nomeComposto");
        assertEquals(2, listaDeString.size());
        assertEquals("nome", listaDeString.get(0));
        assertEquals("composto", listaDeString.get(1));
    }
	
	@Test
	public void converterUmaPalavraTudoMaiusculo() throws Exception {
		 List<String> listaDeString = ConversorDeString.converterCamelCase("CPF");
		 assertEquals(1, listaDeString.size());
		 assertEquals("CPF", listaDeString.get(0));
	}

	@Test
    public void converterNomeCompostoUltimaPalavraInteiraEmMaiusculo() throws Exception {
        List<String> listaDeString = ConversorDeString.converterCamelCase("numeroCPF");
        assertEquals(2, listaDeString.size());
        assertEquals("numero", listaDeString.get(0));
        assertEquals("CPF", listaDeString.get(1));
    }

	@Test
    public void converterNomeCompostoComInteiroEmMaiuculoNoMeio() throws Exception {
        List<String> listaDeString = ConversorDeString.converterCamelCase("numeroCPFContribuinte");
        assertEquals(3, listaDeString.size());
        assertEquals("numero", listaDeString.get(0));
        assertEquals("CPF", listaDeString.get(1));
        assertEquals("contribuinte", listaDeString.get(2));
    }
	
	@Test
    public void converterComNumeroNoMeio() throws Exception {
        List<String> listaDeString = ConversorDeString.converterCamelCase("recupera10Primeiros");
        assertEquals(3, listaDeString.size());
        assertEquals("recupera", listaDeString.get(0));
        assertEquals("10", listaDeString.get(1));
        assertEquals("primeiros", listaDeString.get(2));
    }
	
	@Test
	public void naoConverterQuandoComecaComNumero() {
        try {
            ConversorDeString.converterCamelCase("10Primeiros");
            fail();
        } catch (Exception e) {}
    }
	
	@Test
	public void naoConverterQuandoPossuirCaracteresEspeciais() {
        try {
            ConversorDeString.converterCamelCase("nome#Composto");
            fail();
        } catch (Exception e) {}

    }
	
}

