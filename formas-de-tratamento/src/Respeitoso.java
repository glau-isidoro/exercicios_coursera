
public class Respeitoso implements FormatadorNome {

	private String genero;
	
	
	public Respeitoso(boolean homem) {
		if(homem == true){
			genero = "Sr.";
		} else {
			genero = "Sra.";
		}
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return genero + " " + sobrenome;
	}

}
