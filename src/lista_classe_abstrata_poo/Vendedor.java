package lista_classe_abstrata_poo;

// Subclasse Vendedor
public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + comissao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Vendedor: " + getNome());
        System.out.println("Salário base: " + getSalario());
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário total: " + calcularSalario());
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}