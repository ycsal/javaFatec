package aula6.exercicio12;

public class Contador {

    private int quantidade;

    public void zerar(){
        quantidade = 0;
    }

    public void incrementar(){
        quantidade++;
    }

    public void decrementar(){
        quantidade--;
    }

    public void mostrar(){
        System.out.println(quantidade);
    }
}
