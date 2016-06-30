import static org.junit.Assert.*;

import org.junit.Test;

public class PacienteTest {

	@Test
	public void baixoPesoMuitoGrave() {
		Paciente paciente1 = new Paciente(48, 1.75);
		assertEquals(15.67, paciente1.calcularIMC(), 0.00001);
		assertFalse(paciente1.calcularIMC() == 15.68);
		assertFalse(paciente1.calcularIMC() == 15.66);
		assertEquals(paciente1.diagnostico(), "baixo peso muito grave.");
	}
	
	@Test
	public void baixoPesoGrave() {
		Paciente paciente2 = new Paciente(52, 1.75);
		assertEquals(16.98, paciente2.calcularIMC(), 0.00001);
		assertFalse(paciente2.calcularIMC() == 16.99);
		assertFalse(paciente2.calcularIMC() == 16.97);
		assertEquals(paciente2.diagnostico(), "baixo peso grave.");
		
	}
	
	@Test
	public void baixoPeso() {
		Paciente paciente3 = new Paciente(55, 1.75);
		assertEquals(17.96, paciente3.calcularIMC(), 0.00001);
		assertFalse(paciente3.calcularIMC() == 17.97);
		assertFalse(paciente3.calcularIMC() == 17.98);
		assertEquals(paciente3.diagnostico(), "baixo peso.");
	}
	
	@Test
	public void pesoNormal() {
		Paciente paciente4 = new Paciente(65, 1.75);
		assertEquals(21.22, paciente4.calcularIMC(), 0.00001);
		assertFalse(paciente4.calcularIMC() == 21.23);
		assertFalse(paciente4.calcularIMC() == 21.21);
		assertEquals(paciente4.diagnostico(), "peso normal.");
	}
	
	@Test
	public void sobrepeso() {
		Paciente paciente5 = new Paciente(83, 1.75);
		assertEquals(27.1, paciente5.calcularIMC(), 0.00001);
		assertFalse(paciente5.calcularIMC() == 27.11);
		assertFalse(paciente5.calcularIMC() == 27.09);
		assertEquals(paciente5.diagnostico(), "sobrepeso.");
	}
	
	@Test
	public void obesidadeGrauI() {
		Paciente paciente6 = new Paciente(92, 1.75);
		assertEquals(30.04, paciente6.calcularIMC(), 0.00001);
		assertFalse(paciente6.calcularIMC() == 34.05);
		assertFalse(paciente6.calcularIMC() == 34.03);
		assertEquals(paciente6.diagnostico(), "obesidade grau I.");
	}
	
	@Test
	public void obesidadeGrauII() {
		Paciente paciente7 = new Paciente(110, 1.75);
		assertEquals(35.92, paciente7.calcularIMC(), 0.00001);
		assertFalse(paciente7.calcularIMC() == 35.93);
		assertFalse(paciente7.calcularIMC() == 35.91);
		assertEquals(paciente7.diagnostico(), "obesidade grau II.");
	}
	
	@Test
	public void obesidadeGrauIII() {
		Paciente paciente8 = new Paciente(130, 1.75);
		assertEquals(42.45, paciente8.calcularIMC(), 0.00001);
		assertFalse(paciente8.calcularIMC() == 42.46);
		assertFalse(paciente8.calcularIMC() == 42.44);
		assertEquals(paciente8.diagnostico(), "obesidade grau III (obesidade mórbida).");
	}


}
