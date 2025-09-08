package lista_instancia_poo;

public class Calculadora {
	int memoria;
	int a;
	int b;
	
	public int somar(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.a = 5;
		calc.b = 7;
		
		System.out.println(calc.somar(calc.a, calc.b));
	}
}
