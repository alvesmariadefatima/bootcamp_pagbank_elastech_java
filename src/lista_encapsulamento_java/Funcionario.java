package lista_encapsulamento_java;

public class Funcionario {
    private String nome;
    private double salario;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double valor) {
        if(valor < 1320) {
            System.out.println("Não é permitido salários abaixo de R$ 1320.00");
        } else {
            this.salario = valor;
            System.out.println("Transação aprovada!!!");
        }
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        
        funcionario1.setNome("Maria de Fátima");
        System.out.println("Nome: " + funcionario1.getNome());

        funcionario1.setSalario(1800.60);
        funcionario1.setSalario(1300.00);
    }
}