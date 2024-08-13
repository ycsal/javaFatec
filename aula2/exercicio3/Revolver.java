/*Exercício 1: Implemente a classe revolver (p/ um jogo).
Todo revolver possui uma quantidade atual de munição e uma quantidade máxima. Suas funcionalidades são:
- Atirar: Só atira se houver munição;
- Recaregar: Só recarrega até o máximo possível;
- Mostrar: Mostra a quantidade atual de munição. */

package exercicio3;

public class Revolver {
    int muni = 0;

    void recarregar() {
        if (muni < 8) {
            for (muni = muni; muni < 8; muni++) {
                System.out.println("Recarregando...");
            }
        } else {
            System.out.println("A recarga ja esta completa!");
        }

    }

    void atirar() {
        if (muni > 0) {
            System.out.println("pow");
            muni--;
        } else {
            System.out.println("Cartucho vazio.");
            recarregar(); //recarga automática
        }
    }

    void mostrar() {
        System.out.println("Balas restantes: " + muni);
    }
}
