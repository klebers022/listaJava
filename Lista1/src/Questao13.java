public class Questao13 {
    public static void main(String[] args) {
        lampada lampada = new lampada();
        lampada.ligar();
        System.out.println(lampada.estaLigada());
        lampada.desligar();
        System.out.println(lampada.estaLigada());

    }

}

class lampada{
    private boolean ligada;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public boolean estaLigada() {
        return ligada;
    }
}
