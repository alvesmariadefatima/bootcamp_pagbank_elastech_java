package lista_matrizes_java;

import java.util.Arrays;

public class Exercicio01 {

    public static void main(String[] args) {
        int[][] matrizNumeros = {
        	{1,2},
        	{3,4}
        };

        for(int[] valor: matrizNumeros) {
            System.out.println(Arrays.toString(valor));
            }
        }
    }