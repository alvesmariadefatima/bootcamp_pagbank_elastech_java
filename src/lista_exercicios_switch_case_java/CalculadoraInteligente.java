package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class CalculadoraInteligente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA INTELIGENTE ===");
        System.out.println("Escolha uma operação:"
                + "\n + Soma"
                + "\n - Subtração"
                + "\n * Multiplicação"
                + "\n / Divisão");

        // Primeiro valor
        System.out.print("Digite o primeiro valor: ");
        while (!sc.hasNextDouble()) { // valida entrada
            System.out.println("Entrada inválida! Digite um número:");
            sc.next(); // descarta entrada errada
        }
        double a = sc.nextDouble();

        // Segundo valor
        System.out.print("Digite o segundo valor: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida! Digite um número:");
            sc.next();
        }
        double b = sc.nextDouble();

        // Operação
        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char opc = sc.next().charAt(0);

        // Switch com as operações
        switch (opc) {
            case '+':
                System.out.printf("Soma de %.2f + %.2f = %.2f%n", a, b, (a + b));
                break;

            case '-':
                System.out.printf("Subtração de %.2f - %.2f = %.2f%n", a, b, (a - b));
                break;

            case '*':
                System.out.printf("Multiplicação de %.2f * %.2f = %.2f%n", a, b, (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.printf("Divisão de %.2f / %.2f = %.2f%n", a, b, (a / b));
                } else {
                    System.out.println("❌ Não é possível dividir por zero!");
                }
                break;

            default:
                System.out.println("⚠️ Operação inválida! Digite +, -, * ou /.");
        }

        sc.close();
    }
}