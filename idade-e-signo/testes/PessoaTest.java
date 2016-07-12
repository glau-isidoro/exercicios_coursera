import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {
	
	//testes de idade
	@Test
	public void testIdadeCrianca() {
		Pessoa crianca = new Pessoa(20, 6, 2009, true);
		assertEquals(7, crianca.getIdade());
	}
	
	@Test
	public void testIdadeJovem() {
		Pessoa jovem = new Pessoa(15, 8, 1996, true);
		assertEquals(19, jovem.getIdade());
	}
	
	@Test
	public void testIdadeAdulto() {
		Pessoa adulto = new Pessoa(07, 3, 1975, true);
		assertEquals(41, adulto.getIdade());
	}
	
	@Test
	public void testIdadeIdoso() {
		Pessoa idoso = new Pessoa(27, 10, 1936, true);
		assertEquals(79, idoso.getIdade());
	}
	
	
	
	//testes no primeiro e no último dia de cada signo.
	@Test
	public void testPrimeiroDiaAries() {
		Pessoa ariano = new Pessoa(21, 3, 1987);
		assertEquals("Áries", ariano.getSigno());
	}
	@Test
	public void testUltimoDiaAries() {
		Pessoa ariano = new Pessoa(20, 4, 1987);
		assertEquals("Áries", ariano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaTouro() {
		Pessoa taurino = new Pessoa(21, 4, 1987);
		assertEquals("Touro", taurino.getSigno());
	}
	@Test
	public void testUltimoDiaTouro() {
		Pessoa taurino = new Pessoa(20, 5, 1987);
		assertEquals("Touro", taurino.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaGemeos() {
		Pessoa geminiano = new Pessoa(21, 5, 1987);
		assertEquals("Gêmeos", geminiano.getSigno());
	}
	@Test
	public void testUltimoDiaGemeos() {
		Pessoa geminiano = new Pessoa(20, 6, 1987);
		assertEquals("Gêmeos", geminiano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaCancer() {
		Pessoa canceriano = new Pessoa(21, 6, 1987);
		assertEquals("Câncer", canceriano.getSigno());
	}
	@Test
	public void testUltimoDiaCancer() {
		Pessoa canceriano = new Pessoa(21, 7, 1997);
		assertEquals("Câncer", canceriano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaLeao() {
		Pessoa leonino = new Pessoa(22, 7, 1987);
		assertEquals("Leão", leonino.getSigno());
	}
	@Test
	public void testUltimoDiaLeao() {
		Pessoa leonino = new Pessoa(22, 8, 1987);
		assertEquals("Leão", leonino.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaVirgem() {
		Pessoa virginiano = new Pessoa(23, 8, 1987);
		assertEquals("Virgem", virginiano.getSigno());
	}
	@Test
	public void testUltimoDiaVirgem() {
		Pessoa virginiano = new Pessoa(22, 9, 1987);
		assertEquals("Virgem", virginiano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaLibra() {
		Pessoa libriano = new Pessoa(23, 9, 1987);
		assertEquals("Libra", libriano.getSigno());
	}
	@Test
	public void testUltimoDiaLibra() {
		Pessoa libriano = new Pessoa(22, 10, 1987);
		assertEquals("Libra", libriano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaEscorpiao() {
		Pessoa escorpiano = new Pessoa(23, 10, 1987);
		assertEquals("Escorpião", escorpiano.getSigno());
	}
	@Test
	public void testUltimoDiaEscorpiao() {
		Pessoa escorpiano = new Pessoa(21, 11, 1987);
		assertEquals("Escorpião", escorpiano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaSagitario() {
		Pessoa sagitariano = new Pessoa(22, 11, 1987);
		assertEquals("Sagitário", sagitariano.getSigno());
	}
	@Test
	public void testUltimoDiaSagitario() {
		Pessoa sagitariano = new Pessoa(21, 12, 1987);
		assertEquals("Sagitário", sagitariano.getSigno());
	}

	
	@Test
	public void testPrimeiroDiaCapricornio() {
		Pessoa capricorniano = new Pessoa(22, 12, 1987);
		assertEquals("Capricórnio", capricorniano.getSigno());
	}
	@Test
	public void testUltimoDiaCapricornio() {
		Pessoa capricorniano = new Pessoa(20, 1, 1987);
		assertEquals("Capricórnio", capricorniano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaAquario() {
		Pessoa aquariano = new Pessoa(21, 1, 1987);
		assertEquals("Aquário", aquariano.getSigno());
	}
	@Test
	public void testUltimoDiaAquario() {
		Pessoa aquariano = new Pessoa(19, 2, 1987);
		assertEquals("Aquário", aquariano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaPeixes() {
		Pessoa pisciano = new Pessoa(20, 2, 1987);
		assertEquals("Peixes", pisciano.getSigno());
	}
	@Test
	public void testUltimoDiaPeixes() {
		Pessoa pisciano = new Pessoa(20, 3, 1987);
		assertEquals("Peixes", pisciano.getSigno());
	}
}
