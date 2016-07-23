import static org.junit.Assert.*;

import org.junit.Test;

public class AutoridadeTest {

	@Test
	public void testaInformal() {
		Autoridade pessoa1 = new Autoridade("Letícia", "Dias", new Informal());
		assertEquals("Letícia", pessoa1.getTratamento());
	}

	@Test
	public void testaRespeitosoHomem() {
		Autoridade pessoa2 = new Autoridade("João", "Silveira", new Respeitoso(true));
		assertEquals("Sr. Silveira", pessoa2.getTratamento());
	}
	
	@Test
	public void testaRespeitosoMulher() {
		Autoridade pessoa3 = new Autoridade("Amanda", "Coelho", new Respeitoso(false));
		assertEquals("Sra. Coelho", pessoa3.getTratamento());
	}
	
	@Test
	public void testaComTitulo() {
		Autoridade pessoa4 = new Autoridade("Paulo", "Meneses", new ComTitulo("Ilustríssimo"));
		assertEquals("Ilustríssimo Paulo Meneses", pessoa4.getTratamento());
	}
	
}
