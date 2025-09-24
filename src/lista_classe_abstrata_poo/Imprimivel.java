package lista_classe_abstrata_poo;

public interface Imprimivel {
    default void imprimir() {
        System.out.println("Imprimindo documento");
    }
    public static void main(String[] args) {
		Multifuncional mf = new Multifuncional();
		
		mf.imprimir();
		mf.digitalizar();
	}
}