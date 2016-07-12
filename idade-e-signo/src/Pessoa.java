import java.util.Calendar;

public class Pessoa {
	
	private Calendar dataDeNascimento = Calendar.getInstance();
	private Calendar hoje = Calendar.getInstance();
	

	public Pessoa(int dia, int mes, int ano) {
		dataDeNascimento.set(ano, mes, dia);
	}
	
	//construtor que fixa uma data pra usar nos testes
	public Pessoa(int dia, int mes, int ano, boolean isTest) {
		dataDeNascimento.set(ano, mes, dia);
		if(isTest == true) {
			hoje.set(2016, 7, 11);
		} 
	}


	public int getIdade() {
		if (dataDeNascimento.after(hoje)) { 
			throw new IllegalArgumentException("Data de nascimento inválida.");
		}
		int idade = hoje.get(Calendar.YEAR) - dataDeNascimento.get(Calendar.YEAR);

		if (hoje.get(Calendar.DAY_OF_YEAR) < dataDeNascimento.get(Calendar.DAY_OF_YEAR)) {
			idade--;
		}
		return idade;
	}
		
	public String getSigno() {
		int diaDoAno = dataDeNascimento.get(Calendar.DAY_OF_YEAR);
		String signo = "";
		if(diaDoAno >= 22 && diaDoAno <= 51) {
			signo = "Capricórnio";
		} else if(diaDoAno >= 52 && diaDoAno <= 78) {
			signo = "Aquário";
		} else if(diaDoAno >= 79 && diaDoAno <= 110) {
			signo = "Peixes";
		} else if(diaDoAno >= 111 && diaDoAno <= 140) {
			signo = "Áries";
		} else if(diaDoAno >= 141 && diaDoAno <= 171) {
			signo = "Touro";
		} else if(diaDoAno >= 172 && diaDoAno <= 201) {
			signo = "Gêmeos";
		} else if(diaDoAno >= 202 && diaDoAno <= 233) {
			signo = "Câncer";
		} else if(diaDoAno >= 234 && diaDoAno <= 265) {
			signo = "Leão";
		} else if(diaDoAno >= 266 && diaDoAno <= 295) {
			signo = "Virgem";
		} else if(diaDoAno >= 296 && diaDoAno <= 326) {
			signo = "Libra";
		} else if(diaDoAno >= 327 && diaDoAno <= 355) {
			signo = "Escorpião";
		} else {
			signo = "Sagitário";
		} 
		return signo;
	}
	
}
