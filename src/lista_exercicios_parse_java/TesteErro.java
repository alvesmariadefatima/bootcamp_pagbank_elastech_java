package lista_exercicios_parse_java;

public class TesteErro {

	public static void main(String[] args) {
		String textoErro = "123z";
		int textoFormat = Integer.parseInt(textoFormat);
		
		System.out.println(textoFormat);
	}
}

/* Erro obtido: 
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method parseInt(String) in the type Integer is not applicable for the arguments (int)
	at lista_exercicios_parse_java.TesteErro.main(TesteErro.java:7)
*/