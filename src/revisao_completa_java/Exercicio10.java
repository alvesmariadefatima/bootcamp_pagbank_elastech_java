package revisao_completa_java;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX_CONTAS = 100;
        int[] numerosConta = new int[MAX_CONTAS];
        String[] titulares = new String[MAX_CONTAS];
        double[] saldos = new double[MAX_CONTAS];
        int qtdContas = 0;

        int opcao;
        do {
            System.out.println("\n===== MENU BANCO =====");
            System.out.println("1 - Criar nova conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver saldo de uma conta");
            System.out.println("5 - Listar todas as contas");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (qtdContas < MAX_CONTAS) {
                        System.out.print("Digite o número da conta: ");
                        int numeroConta = sc.nextInt();

                        boolean existe = false;
                        for (int i = 0; i < qtdContas; i++) {
                            if (numerosConta[i] == numeroConta) {
                                existe = true;
                                break;
                            }
                        }

                        if (existe) {
                            System.out.println("⚠ Já existe uma conta com esse número!");
                        } else {
                            System.out.print("Digite o nome do titular: ");
                            sc.nextLine();
                            String titular = sc.nextLine();

                            numerosConta[qtdContas] = numeroConta;
                            titulares[qtdContas] = titular;
                            saldos[qtdContas] = 0.0;
                            qtdContas++;

                            System.out.println("✅ Conta criada com sucesso!");
                        }
                    } else {
                        System.out.println("⚠ Limite máximo de contas atingido!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o número da conta: ");
                    int contaDep = sc.nextInt();
                    boolean encontradaDep = false;
                    for (int i = 0; i < qtdContas; i++) {
                        if (numerosConta[i] == contaDep) {
                            System.out.print("Digite o valor para depósito: ");
                            double valor = sc.nextDouble();
                            if (valor > 0) {
                                saldos[i] += valor;
                                System.out.println("✅ Depósito realizado com sucesso!");
                            } else {
                                System.out.println("⚠ Valor inválido!");
                            }
                            encontradaDep = true;
                            break;
                        }
                    }
                    if (!encontradaDep) {
                        System.out.println("⚠ Conta não encontrada!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da conta: ");
                    int contaSaq = sc.nextInt();
                    boolean encontradaSaq = false;
                    for (int i = 0; i < qtdContas; i++) {
                        if (numerosConta[i] == contaSaq) {
                            System.out.print("Digite o valor para saque: ");
                            double valor = sc.nextDouble();
                            if (valor > 0 && saldos[i] >= valor) {
                                saldos[i] -= valor;
                                System.out.println("✅ Saque realizado com sucesso!");
                            } else {
                                System.out.println("⚠ Saldo insuficiente ou valor inválido!");
                            }
                            encontradaSaq = true;
                            break;
                        }
                    }
                    if (!encontradaSaq) {
                        System.out.println("⚠ Conta não encontrada!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da conta: ");
                    int contaSaldo = sc.nextInt();
                    boolean encontradaSaldo = false;
                    for (int i = 0; i < qtdContas; i++) {
                        if (numerosConta[i] == contaSaldo) {
                            System.out.println("👤 Titular: " + titulares[i]);
                            System.out.println("💰 Saldo: R$ " + saldos[i]);
                            encontradaSaldo = true;
                            break;
                        }
                    }
                    if (!encontradaSaldo) {
                        System.out.println("⚠ Conta não encontrada!");
                    }
                    break;

                case 5:
                    if (qtdContas == 0) {
                        System.out.println("⚠ Nenhuma conta cadastrada!");
                    } else {
                        System.out.println("===== LISTA DE CONTAS =====");
                        for (int i = 0; i < qtdContas; i++) {
                            System.out.println("Conta: " + numerosConta[i] +
                                    " | Titular: " + titulares[i] +
                                    " | Saldo: R$ " + saldos[i]);
                        }
                    }
                    break;
                  
                case 6:
                    System.out.println("Encerrando o programa...");
                break;

                default:
                    System.out.println("⚠ Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}