package exercicio8;

public class Bateria {
    private int carga;

    public Bateria(int carga){
        this.carga = carga;
    }

    public void recarregar(){
        //carga++
        carga = Math.min(100, ++carga);//tirar o + da carga nessa linha se optar por utilizar a versão de cima
    }

    public void gastar(){
        carga = Math.max(0, --carga);
    }
    public boolean isVazio(){
        return carga == 0;
    }
}
