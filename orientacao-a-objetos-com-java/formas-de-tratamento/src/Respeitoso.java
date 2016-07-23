
public class Respeitoso implements FormatadorNome {

	private String ehHomem;
	
	
	public Respeitoso(boolean homem) {
		if(homem == true){
			ehHomem = "Sr. ";
		} else {
			ehHomem = "Sra. ";
		}
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return ehHomem + sobrenome;
	}

}
