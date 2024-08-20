/*Exercicio 5: Crie a classe Cartao:
A qual a mesma possui valor de fatura e um tipo de cliente (platinum, gold ou silver).
Crie um Construtor, seus gets e um método para calcular o desconto da fatura.
Silver -> 5%
Gold -> 10%
Platinum -> 15%
*/
package exercicio6;

public class Cartao {
    private double valorFatura;
    private String tipoCliente;

    public Cartao(double valorFatura, String tipoCliente) {
        this.valorFatura = valorFatura;
        this.tipoCliente = tipoCliente;
    }

    public double getValorFatura() {
        return valorFatura;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public double calcularDesconto() {
        double desconto = 0;

        switch (tipoCliente.toLowerCase()) {
            case "silver":
                desconto = 0.05;
                break;
            case "gold":
                desconto = 0.10;
                break;
            case "platinum":
                desconto = 0.15;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                break;
        }

        return valorFatura * (1 - desconto);
    }
}
