import java.util.Calendar;

public class Pessoa {
	
	private Calendar dataDeNascimento = Calendar.getInstance();
	private Calendar hoje = Calendar.getInstance();
	

	public Pessoa(int dia, int mes, int ano) {
		dataDeNascimento.set(ano, mes - 1, dia);;
	}
	
	//construtor que fixa uma data pra usar nos testes de idade
	public Pessoa(int dia, int mes, int ano, boolean isTest) {
		dataDeNascimento.set(ano, mes - 1, dia);
		if(isTest == true) {
			hoje.set(2016, 6, 11);
		} 
	}

	

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public Calendar getHoje() {
		return hoje;
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
		if(diaDoAno >= 21 && diaDoAno <= 50) {
			signo = "Aquário";
		} else if(diaDoAno >= 51 && diaDoAno <= 79) {
			signo = "Peixes";
		} else if(diaDoAno >= 80 && diaDoAno <= 110) {
			signo = "Áries";
		} else if(diaDoAno >= 111 && diaDoAno <= 140) {
			signo = "Touro";
		} else if(diaDoAno >= 141 && diaDoAno <= 171) {
			signo = "Gêmeos";
		} else if(diaDoAno >= 172 && diaDoAno <= 202) {
			signo = "Câncer";
		} else if(diaDoAno >= 203 && diaDoAno <= 234) {
			signo = "Leão";
		} else if(diaDoAno >= 235 && diaDoAno <= 265) {
			signo = "Virgem";
		} else if(diaDoAno >= 266 && diaDoAno <= 295) {
			signo = "Libra";
		} else if(diaDoAno >= 296 && diaDoAno <= 325) {
			signo = "Escorpião";
		} else if(diaDoAno >= 326 && diaDoAno <= 355) {
			signo = "Sagitário";
		} else {
			signo = "Capricórnio";
		} 
		return signo;
	}
	
}
