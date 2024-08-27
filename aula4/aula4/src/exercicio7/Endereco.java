package exercicio7;

//Endereco HAS-A Estado
public class Endereco {
    private String logradouro, cep, cidade;
    private Estado estado;

    public Endereco (String logradouro,
                    String cep,
                    String cidade,
                    Estado estado){
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;                
    }

    public void mostrar(){
        System.out.println(logradouro);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
            
}
