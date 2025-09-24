package lista_classe_abstrata_poo;

public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("Meow");
	}
}