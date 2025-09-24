package lista_classe_abstrata_poo;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public static void main(String[] args) {
    		Gato gato = new Gato("Mingau");
    		Cachorro cachorro = new Cachorro("Rex");
    		
        List<Animal> animais = new ArrayList<>();
			animais.add(gato);
			animais.add(cachorro);
			
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}