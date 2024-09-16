import exercicio9.Carrinho;
import exercicio9.Produto;
import exercicio9.TipoProduto;

public class App {
    public static void main(String[] args) throws Exception{
        Produto p1 = new Produto("Caneta", 3, TipoProduto.ESCRITORIO);
        Produto p2 = new Produto("Capinha", 10, TipoProduto.TECNOLOGIA);
        Produto p3 = new Produto("Bala", 0.50, TipoProduto.ALIMENTO);
        Produto p4 = new Produto("Borracha", 5, TipoProduto.ESCRITORIO);

        Carrinho k = new Carrinho();
        k.inserir(p1);
        k.inserir(p2);
        k.inserir(p3);
        k.inserir(p4);
        k.inserir(p3);
        k.desempilhar();
        k.listar();
    }
    
}
