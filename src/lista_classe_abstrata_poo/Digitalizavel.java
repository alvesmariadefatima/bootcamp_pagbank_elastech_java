package lista_classe_abstrata_poo;

public interface Digitalizavel {
    default void digitalizar() {
        System.out.println("Digitalizando documento");
    }
}