package lista_poo_java;

import java.util.Scanner;

public class Calculadora {
    int numero1;
    int numero2;

    public int somar() {
        return numero1 + numero2;
    }

    public int subtrair() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN;
        }
        return (double) numero1 / numero2;
    }

    public String mostrarMenu() {
        String menu = "+ - Adição\n"
                    + "- - Subtração\n"
                    + "* - Multiplicação\n"
                    + "/ - Divisão\n";
        System.out.println(menu);
        return menu;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite o primeiro número: ");
		calc.numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		calc.numero2 = sc.nextInt();
		
		System.out.println("\nEscolha a operação: ");
		calc.mostrarMenu();
		
		System.out.println("Digite o símbolo da operação (+, -, *, /): ");
		String operacao = sc.next();
		
		switch(operacao) {
		case "+":
			System.out.println("Resultado da soma: " + calc.somar());
		break;
		
		case "-":
			System.out.println("Resultado da subtração: " + calc.subtrair());
		break;
		
		case "*":
			System.out.println("Resultado da multiplicação: " + calc.multiplicar());
		break;
		
		case "/":
			System.out.println("Resultado da divisão: " + calc.dividir());
		break;
		
		default:
			System.out.println("Operação inválida.");
		break;
		}
	    sc.close();
	}
}