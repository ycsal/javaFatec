package exercicio8;

public class Celular {
    private String nome;
    private Bateria bateria;
    private Chip chip;
    private boolean ligado;

    public Celular(String nome, Bateria bateria, Chip chip){
        this.nome = nome;
        this.chip = chip;
        this.bateria = bateria;
    }

    public boolean isOk(){
        return !ligado && !bateria.isVazio() && chip.isValido();
    }

    public void ligar(){
        if(isOk()){
            System.out.println("Ligou");
            ligado = !ligado;
            bateria.gastar();
        }
    }

    public void desligar(){
        if (ligado){
            System.out.println("ADEUS");
            ligado = !ligado;
        }
    }

    public void mostrarBoasVindas(){
        if(ligado){
            System.out.println("Oi, " + nome);
            bateria.gastar();
            bateria.gastar();
        }
    }
}
