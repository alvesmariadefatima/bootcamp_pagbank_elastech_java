package lista_heranca_java;

public class Cachorro extends Animal {
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Auauauau");
	}
	public static void main(String[] args) {
		Animal cachorro = new Animal();
		
		cachorro.emitirSom();
	}
}
