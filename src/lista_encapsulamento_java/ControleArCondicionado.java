package lista_encapsulamento_java;

public class ControleArCondicionado {
    private boolean ligado;
    private int temperatura;

    public ControleArCondicionado() {
        this.ligado = false;
        this.temperatura = 24;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado!");
    }

    public int aumentarTemperatura() {
        if (ligado && temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura aumentada para " + temperatura + "°C");
        } else if (!ligado) {
            System.out.println("Não é possível aumentar a temperatura. O aparelho está desligado!");
        } else {
            System.out.println("Temperatura já está no máximo (30°C).");
        }
        return temperatura;
    }

    public int diminuirTemperatura() {
        if (ligado && temperatura > 17) {
            temperatura--;
            System.out.println("Temperatura diminuída para " + temperatura + "°C");
        } else if (!ligado) {
            System.out.println("Não é possível diminuir a temperatura. O aparelho está desligado!");
        } else {
            System.out.println("Temperatura já está no mínimo (17°C).");
        }
        return temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public static void main(String[] args) {
        ControleArCondicionado ar = new ControleArCondicionado();

        ar.aumentarTemperatura(); 
        ar.ligar();
        ar.diminuirTemperatura(); 
        ar.diminuirTemperatura(); 
        ar.aumentarTemperatura(); 

        for (int i = 0; i < 20; i++) {
            ar.aumentarTemperatura(); 
        }
        for (int i = 0; i < 20; i++) {
            ar.diminuirTemperatura(); 
        }
    }
}