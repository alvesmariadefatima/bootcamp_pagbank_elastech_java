package lista_matrizes_java;

import java.util.Scanner;

import java.util.Arrays;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizGerada = new int[3][3];

        System.out.println("Digite 9 números para gerar uma matriz 3x3: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor para [" + i + "][" + j + "]: ");
                matrizGerada[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz gerada:");
        for (int [] valor : matrizGerada) {
            System.out.println(Arrays.toString(valor));
            }
        	sc.close();
        }
    }