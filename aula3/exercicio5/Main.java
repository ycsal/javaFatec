package exercicio5;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno(
            "Yasmin", 
            "0050482313010", 
            "noturno", 
            Curso.ADS);

        a.mostrar();
        a.verEsteriotipo();
    }
}
