package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class TarifaTransporte {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("E - Estudante");
        System.out.println("A - Aposentado");
        System.out.println("R - Regular");

        System.out.print("Escolha uma opção: ");
        char opcao = ler.next().toUpperCase().charAt(0);

        System.out.print("É horário de pico? (S/N): ");
        char resposta = ler.next().toUpperCase().charAt(0);
        boolean horarioPico = (resposta == 'S');

        double tarifa;

        if (horarioPico) {
            tarifa = 5.50; // tarifa cheia para todos
        } else {
            switch (opcao) {
                case 'E':
                    tarifa = 5.50 / 2; // metade para estudante
                    break;
                case 'A':
                    tarifa = 0.0; // isento
                    break;
                case 'R':
                    tarifa = 4.40; // tarifa reduzida
                    break;
                default:
                    System.out.println("Categoria inválida!");
                    tarifa = -1; // marca como inválido
            }
        }

        if (tarifa >= 0) {
            System.out.printf("Tarifa a pagar: R$ %.2f%n", tarifa);
        }

        ler.close();
    }
}