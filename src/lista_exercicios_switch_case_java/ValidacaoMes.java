package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class ValidacaoMes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mesCalendario;
		
		System.out.println("Digite um número de 1 a 12: ");
		int mes = sc.nextInt();
		
		switch (mes) {
			case 1:
				mesCalendario = "Janeiro";
			break;
			
			case 2:
				mesCalendario = "Fevereiro";
			break;
			
			case 3:
				mesCalendario = "Março";
			break;
			
			case 4:
				mesCalendario = "Abril";
			break;
			
			case 5:
				mesCalendario = "Maio";
			break;
			
			case 6:
				mesCalendario = "Junho";
			break;
			
			case 7:
				mesCalendario = "Julho";
			break;
			
			case 8:
				mesCalendario = "Agosto";
			break;
			
			case 9:
				mesCalendario = "Setembro";
			break;
			
			case 10:
				mesCalendario = "Outubro";
			break;
			
			case 11:
				mesCalendario = "Novembro";
			break;
			
			case 12:
				mesCalendario = "Dezembro";
			break;
			
			default:
				mesCalendario = "Mês inválido";
			break;
		}
		System.out.println("O mês escolhido é: " + mesCalendario);
		sc.close();
	}
}
