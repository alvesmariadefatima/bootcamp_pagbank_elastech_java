package lista_encapsulamento_java;

public class Livro {
	private String titulo;
	private String autor;
	private boolean disponivel = true;
	
	public Livro() {}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = true;
	}
	
	public boolean emprestar() {
		if(disponivel) {
			disponivel = false;
			System.out.println("Livro emprestado com sucesso!");
			return true;
		} else {
			System.out.println("Livro já está emprestado!");
			return false;
		}
	}
	
	public boolean devolver() {
		if(!disponivel) {
			disponivel = true;
			System.out.println("Livro devolvido com sucesso!");
			return true;
		} else {
			System.out.println("Livro já está disponível!");
			return false;
		}
	}
	
	 public String getStatus() {
	     return disponivel ? "Disponível" : "Emprestado";
	  }
	 
	 public void mostrarStatus() {
		 String nome = (titulo != null && !titulo.isEmpty()) ? titulo : "Sem título"; 
	        System.out.println("Status do livro \"" + nome + "\": " + getStatus());
	  } 
	 
	public static void main(String[] args) {
		Livro livro1 = new Livro("1984", "George Orwell");
		Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
		
		livro1.mostrarStatus();
		livro1.emprestar();
		livro1.mostrarStatus();
		
		livro2.mostrarStatus();
		livro2.devolver();
	}
}