package lista_matrizes_java;

public class Exercicio03 {

    public static void main(String[] args) {
        int [][] matrizInteiros = {
        	{6,4,2},
        	{8,5,3},
        };

        int soma = 0;

        System.out.println("Matriz 2x3:");
        for(int i = 0; i < matrizInteiros.length; i++) {
            for(int j = 0; j < matrizInteiros[i].length; j++) {
                System.out.print(matrizInteiros[i][j] + " ");
                soma += matrizInteiros[i][j];
            }
            System.out.println();
        }

        System.out.println("\nSoma total dos elementos: " + soma);
    }
}