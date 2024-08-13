package exercicio2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Yasmin";
        a1.idade = 19;
        a1.cpf = "1234567890";

        Aluno a2 = new Aluno();
        a2.nome = "Arthur";
        a2.idade = 19;
        a2.cpf = "0987654321";

        Aluno a3 = new Aluno();
        a3.nome = "Victor";
        a3.idade = 27;
        a3.cpf = "6758493021";

        a1.exibir();
        a2.exibir();
        a3.exibir();
    }
}
