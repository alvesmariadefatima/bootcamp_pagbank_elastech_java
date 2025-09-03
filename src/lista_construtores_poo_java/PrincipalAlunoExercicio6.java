package lista_construtores_poo_java;

public class PrincipalAlunoExercicio6 {

	public static void main(String[] args) {
		AlunoExercicio6 aluno1 = new AlunoExercicio6("Maria");
		AlunoExercicio6 aluno2 = new AlunoExercicio6("Maria");
		
        aluno1.adicionarNota(1, 6.0);
        aluno1.adicionarNota(2, 9.0);
        aluno1.adicionarNota(3, 10.0);
        aluno1.adicionarNota(4, 7.0);

        aluno1.exibirNotas();
        aluno1.verificarStatus();
        
        aluno2.adicionarNota(1, 7.0);
        aluno2.adicionarNota(2, 10.0);
        aluno2.adicionarNota(3, 8.0);
        aluno2.adicionarNota(4, 8.5);

        aluno2.exibirNotas();
        aluno2.verificarStatus();
	}
}
