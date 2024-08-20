package exercicio6;

public class Main{
    public static void main(String[] args) {
        Cartao c1 = new Cartao(1000, "Silver");
        Cartao c2 = new Cartao(2500, "Gold");
        Cartao c3 = new Cartao(7000, "Platinum");

        System.out.printf("Fatura %s com desconto: R$ %.2f", c1.getTipoCliente(), c1.calcularDesconto());
        System.out.printf("\nFatura %s com desconto: R$ %.2f", c2.getTipoCliente(), c2.calcularDesconto());
        System.out.printf("\nFatura %s com desconto: R$ %.2f", c3.getTipoCliente(), c3.calcularDesconto());
    }
}