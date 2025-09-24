package atividade_revisao_poo_java;

public abstract class FormaGeometrica {
    public abstract double calcularArea();

    public static void main(String[] args) {
        Quadrado q = new Quadrado(7);
        Circulo c = new Circulo(3);

        System.out.println("Área do quadrado: " + q.calcularArea());
        System.out.println("Área do círculo: " + c.calcularArea());
    }
}