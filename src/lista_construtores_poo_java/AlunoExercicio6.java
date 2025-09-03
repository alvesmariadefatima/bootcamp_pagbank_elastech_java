package lista_construtores_poo_java;

public class AlunoExercicio6 {
	private String nome;
	private double[] notas;
		
	public AlunoExercicio6(String nome) {
		this.nome = nome;
		this.notas = new double[4];
	}
	
	public void adicionarNota(int bimestre, double nota) {
		if(bimestre < 1 || bimestre > 4) {
			System.out.println("Erro: o bimestre deve estar entre 1 e 4.");
		return;
		}
		
		if(nota < 0.0 || nota > 10.0) {
			System.out.println("Erro: a nota deve estar entre 0 e 10.");
		return;
		}
		
		notas[bimestre - 1] = nota;
		System.out.println("Nota adicionada com sucesso no bimestre " + bimestre);
	}
	
	public void exibirNotas() {
		System.out.println("Notas do aluno: " + nome + ":");
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Bimestre " + (i + 1) + ": " + notas[i]);
		}
	}
	
	public double calcularMedia() {
		double soma = 0.0;
		for(double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}
	
	public void verificarStatus() {
		double media = calcularMedia();
		System.out.printf("Média do aluno %s: %.2f\n", nome, media);
		if(media >= 7.0) {
			System.out.println("Status: Aprovado");
		} else {
			System.out.println("Status: Reprovado");
		}
	}
}