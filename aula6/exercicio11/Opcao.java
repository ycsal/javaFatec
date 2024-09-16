package aula6.exercicio11;

public enum Opcao {
    ADD, SUB, MUL, DIV, EXIT;

    public static Opcao converter(int op){
        switch(op){
            case 1:
                return ADD;
            case 2:
                return SUB;
            case 3:
                return MUL;
            case 4:
                return DIV;
            default:
                return EXIT;
        }
    }
}
