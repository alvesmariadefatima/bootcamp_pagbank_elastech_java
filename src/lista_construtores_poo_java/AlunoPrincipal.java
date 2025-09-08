package lista_construtores_poo_java;

public class AlunoPrincipal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Maria", 24);
		Aluno aluno2 = new Aluno("Carla", 35);
		
		aluno1.exibirDadosAluno();
		aluno2.exibirDadosAluno();
	}
}