package revisao_completa_java;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
					
		for(int i = 0; i < 20; i++) {
			if(i % 2 == 0) {
				System.out.println("Este número é par " + i);
			} else {
				System.out.println("Este número é ímpar " + i);
			}
		}
		
		scan.close();
	}
}
