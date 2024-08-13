package exercicio1;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();
        c1.nome = "Pitty";
        c1.raca = "Pinscher";
        c1.latir();
        c1.mostrarRaca();

        Cachorro c2 = new Cachorro();
        c2.nome = "Vitoria";
        c2.raca = "Vira-lata";
        c2.latir();
        c2.mostrarRaca();

        Cachorro c3 = new Cachorro();
        c3.nome = "Floki";
        c3.raca = "Maltes";
        c3.latir();
        c3.mostrarRaca();

    }
}
