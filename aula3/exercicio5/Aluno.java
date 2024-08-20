package exercicio5;

public class Aluno {
    private String nome, ra, periodo;
    private Curso curso;

    public Aluno(String nome, String ra, String periodo, Curso curso){
        this.nome = nome;
        this.ra = ra;
        this.periodo = periodo;
        this.curso = curso;
    }

    void mostrar(){
        System.out.println("Nome: "+ nome);
        System.out.println("RA: "+ ra);
        System.out.println("Curso: "+ curso);
        System.out.println("Periodo: "+ periodo);
    }

    void verEsteriotipo(){
        switch(curso){
            case ADS:
                System.out.println("BACK-END");
                break;
            case SI:
                System.out.println("FRONT-END");
                break;
            case CD:
                System.out.println("DATABASES");
                break;
            case LOG:
                System.out.println("GESTAO DE SUPRIMENTOS");
                break;
            case RH:
                System.out.println("CONTRATOS");
                break;
            default:
                System.out.println("NÃO SEI");
        }
    }

    public String getRa(){
        return ra;
    }

    public String  getNome(){
        return nome;
    }

    public String  getPeriodo(){
        return periodo;
    }

    public Curso getCurso(){
        return curso;
    }

}