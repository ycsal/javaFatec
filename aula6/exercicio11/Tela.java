package aula6.exercicio11;
import java.util.Scanner;

public class Tela {
    public static Calculadora obterCalculadora(){
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner (System.in);
        double x = sc.nextDouble();
        System.out.println("Digite outro numero:");
        double y = sc.nextDouble();
        sc.close();

        return new Calculadora(x,y);
    }

    public static void menuCalculadora(Opcao opc){
        Calculadora calc = null;
        if(opc != Opcao.EXIT){
            calc = obterCalculadora();
            System.out.println("Resultado: ");
        }
        switch (opc) {
            case ADD:
                System.out.println(calc.somar());
                break;
            case SUB:
                System.out.println(calc.subtrair());
                break;
            case MUL:
                System.out.println(calc.multiplicar());
                break;
            case DIV:
                try {
                    System.out.println(calc.dividir());
                } catch (Exception e){
                    System.out.println("Não é possível dividir por 0.");
                    
                }
                break;
            default:
                System.out.println("Fim.");
        }
    }

    public static void telaInicial(){
        System.out.println("------ CALCULADORA ------");
        System.out.printf("1 - SOMAR\n2 - SUBTRAIR\n3 - MULTIPLICAR\n4 - DIVIDIR\n");
        Scanner sc = new Scanner (System.in);
        int opc = sc.nextInt();
        Opcao op = Opcao.converter(opc);
        menuCalculadora(op);
        sc.close();      
    }
}
