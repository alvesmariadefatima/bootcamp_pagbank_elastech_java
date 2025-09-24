package lista_classe_abstrata_poo;

public class Controlavel {
    protected boolean ligado = false;
    protected int volume = 10;

    public void ligar() {
        ligado = true;
        System.out.println("Dispositivo ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Dispositivo desligado.");
    }

    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }
}