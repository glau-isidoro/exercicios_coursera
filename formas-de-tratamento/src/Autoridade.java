
public class Autoridade {
	
	private String nome;
	private String sobrenome;
	FormatadorNome formatador;
	
	
	public Autoridade(String nome, String sobrenome, FormatadorNome formatador) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatador = formatador;
	}


	public String getTratamento() {
		return formatador.formatarNome(this.nome, this.sobrenome);
		
	}
	
	

}
