package lista_matrizes_java;

import java.util.ArrayList;

public class Exercicio07 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayInteiros = new ArrayList<>();
		
		arrayInteiros.add(20);
		arrayInteiros.add(40);
		arrayInteiros.add(70);
		arrayInteiros.add(90);
		arrayInteiros.add(200);
		
		for(Integer numero: arrayInteiros) {
			System.out.println(numero);
		}

	}
}
