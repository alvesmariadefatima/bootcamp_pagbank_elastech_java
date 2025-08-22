package lista_exercicios_switch_case_java;

import java.util.Scanner;

public class TipoVeiculoPedagio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String carro = "carro";
		String moto = "moto";
		String caminhao = "caminhao";
		double tarifa = 0;
		int eixo = 0;
		
		System.out.println("Qual o tipo de veículo: " 
				+ "\nCarro"
				+ "\nMoto"
				+ "\nCaminhao");
		
		String tipoVeiculo = sc.next().toLowerCase();
		
		switch(tipoVeiculo) {
			case "carro":
				tarifa = 15;
			break;
			
			case "moto":
				tarifa = 5;
			break;
			
			case "caminhao":
				tarifa = 30;
				System.out.println("Seu veículo tem eixo extra?"
						+ "\n1 - Sim"
						+ "\n2 - Nao");
				eixo = sc.nextInt();
				
				if(eixo == 1) {
					tarifa = tarifa + 5;
				}
			break;
			
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("Valor a ser pago R$" + tarifa);
		
		sc.close();
	}
}