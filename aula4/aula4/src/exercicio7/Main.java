package exercicio7;

public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco ("Av. Senador Feijo", "11122-333", "Santos", Estado.SP);
        Aluno a = new Aluno ("Yasmin", "yasmin.salgado@fatec.sp.gov.br", end);

        Endereco rua = new Endereco ("Av. Conselheiro Nebias", "22221-333", "Santos", Estado.SP);
        Aluno b = new Aluno ("Izabelle", "taaaaaar@fatec.sp.gov.br", rua);

        a.mostrar();
        b.mostrar();
    }
}
