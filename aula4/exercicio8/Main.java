package exercicio8;

public class Main {
    public static void main(String[] args) {
        Chip ch = new Chip ("13999999999");
        Bateria b = new Bateria (3);
        Celular ce = new Celular("Teste", b, ch);
        ce.ligar();
        ce.mostrarBoasVindas();
        ce.desligar();
    }
}
