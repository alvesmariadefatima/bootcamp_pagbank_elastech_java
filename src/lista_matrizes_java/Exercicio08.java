package lista_matrizes_java;

import java.util.ArrayList;

public class Exercicio08 {

	public static void main(String[] args) {
		ArrayList<String> nomesAlunos = new ArrayList<>();
		
		nomesAlunos.add("Maria");
		nomesAlunos.add("Joaquim");
		nomesAlunos.add("Carlos");
		nomesAlunos.add("Joana");
		nomesAlunos.add("Eduardo");
		
		System.out.println("Nomes dos alunos: ");
		for(String aluno : nomesAlunos) {
			System.out.println(aluno);
		}
		
		String nomeBuscado = "Maria";
		boolean encontrado = false;
		
		for(String aluno : nomesAlunos) {
			if(aluno.equals(nomeBuscado)) {
				encontrado = true;
				break;
			}
		}
		if(encontrado) {
			System.out.println("\nO aluno " + nomeBuscado + " está na lista");
		} else {
			System.out.println("\nO aluno " + nomeBuscado + " não está na lista");
		}
	}
}