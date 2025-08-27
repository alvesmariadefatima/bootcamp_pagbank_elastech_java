package revisao_completa_java;

import java.util.ArrayList;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "º nome: ");
			String nome = sc.nextLine();
			nomes.add(nome);
		}
		
		System.out.println("\nLista de nomes digitados: ");
		System.out.println(nomes);
		
		System.out.println("\nDigite um nome para verificar se está na lista: ");
		String busca = sc.nextLine();
		
		if(nomes.contains(busca)) {
			System.out.println("O nome " + busca + " está incluído(a) na lista!!!");
		} else {
			System.out.println("O nome " + busca + " não está incluído(a) na lista!!!");
		}
		sc.close();
	}
}