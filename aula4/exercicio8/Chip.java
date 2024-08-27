package exercicio8;

public class Chip {
    private String numero;

    public Chip(String numero){
        this.numero = numero;
    }

    public boolean isValido (){
        return numero != ""; // ou return numero.length() >= 1 && numerocharAt(0) != ' ';
    }
}
