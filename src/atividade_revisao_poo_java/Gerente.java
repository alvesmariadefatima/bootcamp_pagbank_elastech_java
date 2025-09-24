package atividade_revisao_poo_java;

public class Gerente extends Funcionario {
	public Gerente(String nome, Departamento departamento) {
		super(nome, departamento);
	}

	@Override
	public void calcularSalario() {
		System.out.println("O salário de um gerente é R$ 5000.00");
	}
}