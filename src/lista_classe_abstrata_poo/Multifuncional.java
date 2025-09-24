package lista_classe_abstrata_poo;

public class Multifuncional implements Imprimivel, Digitalizavel {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando documento...");
    }
}