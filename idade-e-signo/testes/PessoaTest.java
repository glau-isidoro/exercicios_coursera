import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {
	
	//testes no primeiro e no último dia de cada signo.
	
	@Test
	public void testPrimeiroDiaAries() {
		Pessoa ariano = new Pessoa(21, 3, 1987, true);
		assertEquals(29, ariano.getIdade());
		assertEquals("Áries", ariano.getSigno());
	}
	@Test
	public void testUltimoDiaAries() {
		Pessoa ariano = new Pessoa(20, 4, 1987, true);
		assertEquals(29, ariano.getIdade());
		assertEquals("Áries", ariano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaTouro() {
		Pessoa taurino = new Pessoa(21, 4, 1987, true);
		assertEquals(29, taurino.getIdade());
		assertEquals("Touro", taurino.getSigno());
	}
	@Test
	public void testUltimoDiaTouro() {
		Pessoa taurino = new Pessoa(20, 5, 1987, true);
		assertEquals(29, taurino.getIdade());
		assertEquals("Touro", taurino.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaGemeos() {
		Pessoa geminiano = new Pessoa(21, 5, 1987, true);
		assertEquals(29, geminiano.getIdade());
		assertEquals("Gêmeos", geminiano.getSigno());
	}
	@Test
	public void testUltimoDiaGemeos() {
		Pessoa geminiano = new Pessoa(20, 6, 1987, true);
		assertEquals(29, geminiano.getIdade());
		assertEquals("Gêmeos", geminiano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaCancer() {
		Pessoa canceriano = new Pessoa(21, 6, 1987, true);
		assertEquals(29, canceriano.getIdade());
		assertEquals("Câncer", canceriano.getSigno());
	}
	@Test
	public void testUltimoDiaCancer() {
		Pessoa canceriano = new Pessoa(21, 7, 1987, true);
		assertEquals(28, canceriano.getIdade());
		assertEquals("Câncer", canceriano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaLeao() {
		Pessoa leonino = new Pessoa(22, 7, 1987, true);
		assertEquals(28, leonino.getIdade());
		assertEquals("Leão", leonino.getSigno());
	}
	@Test
	public void testUltimoDiaLeao() {
		Pessoa leonino = new Pessoa(22, 8, 1987, true);
		assertEquals(28, leonino.getIdade());
		assertEquals("Leão", leonino.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaVirgem() {
		Pessoa virginiano = new Pessoa(23, 8, 1987, true);
		assertEquals(28, virginiano.getIdade());
		assertEquals("Virgem", virginiano.getSigno());
	}
	@Test
	public void testUltimoDiaVirgem() {
		Pessoa virginiano = new Pessoa(22, 9, 1987, true);
		assertEquals(28, virginiano.getIdade());
		assertEquals("Virgem", virginiano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaLibra() {
		Pessoa libriano = new Pessoa(23, 9, 1987, true);
		assertEquals(28, libriano.getIdade());
		assertEquals("Libra", libriano.getSigno());
	}
	@Test
	public void testUltimoDiaLibra() {
		Pessoa libriano = new Pessoa(22, 10, 1987, true);
		assertEquals(28, libriano.getIdade());
		assertEquals("Libra", libriano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaEscorpiao() {
		Pessoa escorpiano = new Pessoa(23, 10, 1987, true);
		assertEquals(28, escorpiano.getIdade());
		assertEquals("Escorpião", escorpiano.getSigno());
	}
	@Test
	public void testUltimoDiaEscorpiao() {
		Pessoa escorpiano = new Pessoa(21, 11, 1987, true);
		assertEquals(28, escorpiano.getIdade());
		assertEquals("Escorpião", escorpiano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaSagitario() {
		Pessoa sagitariano = new Pessoa(22, 11, 1987, true);
		assertEquals(28, sagitariano.getIdade());
		assertEquals("Sagitário", sagitariano.getSigno());
	}
	@Test
	public void testUltimoDiaSagitario() {
		Pessoa sagitariano = new Pessoa(21, 12, 1987, true);
		assertEquals(28, sagitariano.getIdade());
		assertEquals("Sagitário", sagitariano.getSigno());
	}

	
	@Test
	public void testPrimeiroDiaCapricornio() {
		Pessoa capricorniano = new Pessoa(22, 12, 1987, true);
		assertEquals(28, capricorniano.getIdade());
		assertEquals("Capricórnio", capricorniano.getSigno());
	}
	@Test
	public void testUltimoDiaCapricornio() {
		Pessoa capricorniano = new Pessoa(20, 1, 1987, true);
		assertEquals(29, capricorniano.getIdade());
		assertEquals("Capricórnio", capricorniano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaAquario() {
		Pessoa aquariano = new Pessoa(21, 1, 1987, true);
		assertEquals(29, aquariano.getIdade());
		assertEquals("Aquário", aquariano.getSigno());
	}
	@Test
	public void testUltimoDiaAquario() {
		Pessoa aquariano = new Pessoa(19, 2, 1987, true);
		assertEquals(29, aquariano.getIdade());
		assertEquals("Aquário", aquariano.getSigno());
	}
	
	
	@Test
	public void testPrimeiroDiaPeixes() {
		Pessoa pisciano = new Pessoa(20, 2, 1987, true);
		assertEquals(29, pisciano.getIdade());
		assertEquals("Peixes", pisciano.getSigno());
	}
	@Test
	public void testUltimoDiaPeixes() {
		Pessoa pisciano = new Pessoa(20, 3, 1987, true);
		assertEquals(29, pisciano.getIdade());
		assertEquals("Peixes", pisciano.getSigno());
	}
}
