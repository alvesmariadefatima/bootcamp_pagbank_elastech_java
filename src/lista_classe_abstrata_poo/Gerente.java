package lista_classe_abstrata_poo;

public class Gerente extends Funcionario {
	private double bonus;
	
	public Gerente(String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}
	
	@Override
	public double calcularSalario() {
		return getSalario() + bonus;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Gerente: " + getNome());
		System.out.println("Salário base: " + getSalario());
		System.out.println("Bônus: " + bonus);
		System.out.println("Salário total: " + calcularSalario());
	}
	
	public double getBonus() {
		return bonus;
	}
}