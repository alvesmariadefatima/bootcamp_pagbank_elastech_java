package lista_instancia_poo;

public class Pessoa {
	String nome;
	int idade;
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Maria de Fátima";
		p1.idade = 24;
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
	}
}