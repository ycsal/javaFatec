package exercicio9;

public class Produto {

    private String nome;
    private double preco;
    private TipoProduto tipoProduto;

    public Produto(String nome, double preco, TipoProduto tipoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }
    
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public void mostrar(){
        System.out.println("Nome:" + nome);
        System.out.println("Preco:" + preco);
        System.out.println("Tipo do Produto:" + tipoProduto);
        System.out.println("Codigo:" + tipoProduto.getCodigo() + "\n");
    }

    public boolean verificarTipo(TipoProduto tipo){
        return tipoProduto == tipo;
    } 
}
