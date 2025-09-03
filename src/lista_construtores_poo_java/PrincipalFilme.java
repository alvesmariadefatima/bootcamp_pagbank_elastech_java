package lista_construtores_poo_java;

public class PrincipalFilme {

	public static void main(String[] args) {
		Filme filme1 = new Filme("Filme 1", "Autor 1", 1991);
		Filme filme2 = new Filme("Filme 2", "Autor 2", 2005);
		
		filme1.mostrarDetalhes();
		filme2.mostrarDetalhes();
	}
}