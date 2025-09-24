package lista_classe_abstrata_poo;

public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double calcularSalario();
	public abstract void exibirInformacoes();
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Fatima", 4000, 7000);
		Vendedor vendedor = new Vendedor("Carlos", 5000, 3000);
		
		gerente.exibirInformacoes();
		System.out.println("--------------------------");
		vendedor.exibirInformacoes();
	}
}