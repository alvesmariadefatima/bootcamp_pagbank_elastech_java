package atividade_loops_java_lista_exercicios;

public class SomaNumerosPares {

	public static void main(String[] args) {
		int numerosPares = 0;
		
		for (int i = 1; i < 100; i++) {
			if(i % 2 == 0) {
				numerosPares += i;
			}
		}
		System.out.println("Soma dos números parea de 0 a 100: " + numerosPares);
	}
}