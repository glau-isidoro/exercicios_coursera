
public class ComTitulo implements FormatadorNome {

	private String tratamento;
	
	public ComTitulo(String tratamento) {
		this.tratamento = tratamento;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return tratamento + " " + nome + " " + sobrenome;
	}

}
