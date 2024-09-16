package exercicio9;

import java.util.ArrayList;

public class CarrinhoD {

    private ArrayList<Produto> produtos;
    
    public CarrinhoD(){
        produtos = new ArrayList<Produto>();
    }

    public void inserir(Produto p){
        produtos.add(p);
    }

    public void remover(Produto p){
        produtos.remove(p);
    }

    public void listar(){
        for(Produto p : produtos){
            if (p != null) p.mostrar();
        }
    }

    public void buscarPorNome(String nome){
        for (Produto p : produtos){
            if (p != null) {
                if(p.getNome() == nome) p.mostrar();
            }
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(Produto p : produtos){
            if (p != null) {
                total = total + p.getPreco();
            }
        }
        return total;
    }

    public double calcularTotalTipo(TipoProduto tipo){
        double total = 0;
        for(Produto p : produtos){
            if (p != null) {
                if(p.verificarTipo(tipo)) total = total + p.getPreco();
            }
        }
        return total; //CORRIGIR O RETURN
    }


}
