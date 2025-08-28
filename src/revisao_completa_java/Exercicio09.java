package revisao_completa_java;

public class Exercicio09 {

	public static void main(String[] args) {
		int[] numerosFixos = {1, 4, 5, 6, 7, 9, 12, 40, 70, 90};
		
			for(int valor: numerosFixos) {
				if(valor > 50) {
					System.out.println("Valor: " + valor);
				}
			}
		}
	}