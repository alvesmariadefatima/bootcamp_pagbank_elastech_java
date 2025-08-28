package lista_matrizes_java;

public class Exercicio09 {

    public static void main(String[] args) {
        int[][] matrizValores = new int[2][3];

        matrizValores[0][0] = 3;
        matrizValores[0][1] = 2;
        matrizValores[0][2] = 4;
        matrizValores[1][0] = 5;
        matrizValores[1][1] = 7;
        matrizValores[1][2] = 1;

        System.out.println("Valores da matriz 2x3:");

        for (int[] linha : matrizValores) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}