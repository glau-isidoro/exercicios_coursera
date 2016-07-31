import java.util.ArrayList;
import java.util.List;

public class ConversorDeString {
	
	final private static String separador = "(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])|(?<=[0-9])(?=[A-Z][a-z])|(?<=[a-zA-Z])(?=[0-9])";
	
	public static List<String> converterCamelCase(String string) throws Exception {	
		if(naoEhValido(string)){
			throw new Exception("não pode começar com número");
		} else {
			return separarPalavras(string);
		}
	}
	
	private static Boolean naoEhValido(String palavras) {
        if (palavras.matches("^[0-9].*") || palavras.matches(".*[^a-zA-Z0-9].*")) {
            return true;
        }
        return false;
    }
	
	private static List<String> separarPalavras(String string) {
		String[] palavras = string.split(separador);
		return fazerListaDeStrings(palavras);
	}
	
	private static List<String> fazerListaDeStrings(String[] palavras) {
		List<String> convertido = new ArrayList<>();
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i].equals(palavras[i].toUpperCase())) {
				convertido.add(palavras[i]);
			} else {
				convertido.add(palavras[i].toLowerCase());
			}
		}
		return convertido;
	}
}
