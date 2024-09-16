package aula6.exercicio12;

import java.util.Scanner;

public class TelaContador {

    public static void menu(Contador cont, MenuContador opc){
        switch (opc) {
            case INC:
                cont.incrementar();
                break;
            case DEC:
                cont.decrementar();
                break;
            case ZERAR:
                cont.zerar();
                break;
            case MOSTRAR:
                cont.mostrar();
                break;
            default:
                System.exit(0);
        }
    }

    public static void telaInicial(){
        Scanner sc = new Scanner(System.in);
        Contador k = new Contador();
        while(true){
            System.out.println("---- CONTADOR ------");
            System.out.println("1 - INCREMENTAR");
            System.out.println("2 - DECREMENTAR");
            System.out.println("3 - ZERAR");
            System.out.println("4 - MOSTRAR");
            System.out.println("OUTRO - SAIR");
            System.out.println("Digite a opcao desejada:");
            int opc = sc.nextInt();
            MenuContador op = MenuContador.converter(opc);
            menu(k, op);
            sc.close();
        }
    }
    
}
