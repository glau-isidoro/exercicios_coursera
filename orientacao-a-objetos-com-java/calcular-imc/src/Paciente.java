public class Paciente {

	double peso;
	double altura;


	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	

	public double calcularIMC() {
		double imc = peso / (altura * altura);
		imc = (double)Math.round(imc * 100) / 100;
		return imc;
	}
	
	public String diagnostico() {
		double imc = this.calcularIMC();
		String resultado = "";
		
		if(imc < 16) {
			resultado = "baixo peso muito grave.";
		} 
		if(imc >= 16 && imc < 17) {
			resultado = "baixo peso grave.";
		}
		if(imc >= 17 && imc < 18.50) {
			resultado = "baixo peso.";
		}
		if(imc >= 18.50 && imc < 25) {
			resultado = "peso normal.";
		}
		if(imc >= 25 && imc < 30) {
			resultado = "sobrepeso.";
		}
		if(imc >= 30 && imc < 35) {
			resultado = "obesidade grau I.";
		}
		if(imc >= 35 && imc < 40) {
			resultado = "obesidade grau II.";
		}
		if(imc >= 40) {
			resultado = "obesidade grau III (obesidade mórbida).";
		}
		
		return resultado;
	}
	
	public void imprimirResultado() {
		System.out.println("O paciente está com " + this.calcularIMC() + " de imc. Diagnóstico: " + this.diagnostico());
	}
	
}
