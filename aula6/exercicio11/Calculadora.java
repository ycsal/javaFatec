package aula6.exercicio11;

public class Calculadora {
    private double n1, n2;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double somar(){
        return n1 + n2;
    }

    public double subtrair(){
        return n1 - n2;
    }

    public double multiplicar(){
        return n1*n2;
    }

    //Qualquer clase/método que chamar terá que tratar o erro.
    public double dividir() throws Exception{
        if(n2== 0){
            throw new Exception("Nao ha divisao por 0");
        }
        return n1/n2;
    }

}
