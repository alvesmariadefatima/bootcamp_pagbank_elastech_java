package lista_matrizes_java;

public class Exercicio04 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        matriz[0][0] = 6;
        matriz[0][1] = 4;
        matriz[0][2] = 2;
        matriz[1][0] = 8;
        matriz[1][1] = 5;
        matriz[1][2] = 3;
        matriz[2][0] = 9;
        matriz[2][1] = 7;
        matriz[2][2] = 1;

        int maior = matriz[0][0];

        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nMaior número presente na matriz: " + maior);
    }
}