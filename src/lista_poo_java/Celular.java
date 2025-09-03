package lista_poo_java;

public class Celular {
	String marca;
	String modelo;
	int memoria;
	boolean ligado;
	
	public void ligar() {
		ligado = true;
		System.out.println("O celular está ligado");
	}
	
	public void desligar() {
		ligado = false;
		System.out.println("O celular está desligado");
	}
	
	public String mostrarInfo() {
        String infos = "Marca: " + marca + "\n"
                     + "Modelo: " + modelo + "\n"
                     + "Memória: " + memoria;
        System.out.println(infos);
        return infos;
    }
	
	public String enviarMensagem(int numero) {
		String mensagem = "Enviando mensagem para o número: " + numero;
		System.out.println(mensagem);
		return mensagem;
	}
		
	public String enviarMensagem(int[] numeros) {
		String mensagem = "Enviando mensagem para os números: ";
		for(int numero : numeros) {
			mensagem += numero + " ";
		}
		System.out.println(mensagem.trim());
		return mensagem.trim();
	}
	
	public static void main(String[] args) {
		Celular c = new Celular();
		
		c.marca = "Realme";
		c.modelo = "v50";
		c.memoria = 4;
		
		System.out.println(c.marca);
		System.out.println(c.modelo);
		System.out.println(c.memoria);
		
		c.marca = "Samsung";
		c.modelo = "Galaxy S21";
		c.memoria = 16;
		
		System.out.println(c.marca);
		System.out.println(c.modelo);
		System.out.println(c.memoria);
		
		c.marca = "Motorola";
		c.modelo = "G34";
		c.memoria = 2;
		
		System.out.println(c.marca);
		System.out.println(c.modelo);
		System.out.println(c.memoria);
	}
}
