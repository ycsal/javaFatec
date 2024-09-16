package aula6.exercicio12;

public enum MenuContador {
    INC, DEC, ZERAR, MOSTRAR, EXIT;

    public static MenuContador converter(int op){
        switch (op) {
            case 1:
                return INC;
            case 2:
                return DEC;
            case 3:
                return ZERAR;
            case 4:
                return MOSTRAR;
            default:
                return EXIT;
        }
    }
}
