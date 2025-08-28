package lista_matrizes_java;

public class Exercicio05 {

    public static void main(String[] args) {
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTransposta = new int[3][2];

        for (int i = 0; i < matrizOriginal.length; i++) {      
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("Matriz Original (2x3):");
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transposta (3x2):");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}