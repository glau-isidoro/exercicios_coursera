import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	
	public static Map<String, String> conteudoArquivo = new HashMap<String, String>();
	
	@SuppressWarnings("resource")
	public static Map<String, String> processa(String arquivo) throws LeituraArquivoException {
		String[] linha;
		InputStream file;
		Scanner entrada;
		
		try {
			file = new FileInputStream(arquivo);
		} catch(IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo" + e.getMessage());
		}
		
		entrada = new Scanner(file);
		
		while(entrada.hasNextLine()){
			try{
				linha = entrada.nextLine().split("->");
				if(linha.length > 2 || linha.length < 2){
					throw new LeituraArquivoException("Formato de arquivo inválido");
				}
			} catch(Exception e) {
				throw new LeituraArquivoException("Formato de arquivo inválido" + e.getMessage());
			}
			conteudoArquivo.put(linha[0], linha[1]);
		}
		
		entrada.close();
		
		if(conteudoArquivo.isEmpty()){
			throw new LeituraArquivoException("Arquivo vazio");
		}
		
		return conteudoArquivo;
		
	}

}
