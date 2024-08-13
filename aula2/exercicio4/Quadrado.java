/*Exercício 2: Implemente a classe Quadrado:
Essa deve prover funcionalidades de cálculo de perímetro e área.
*/
package exercicio4;
import java.lang.Math;

public class Quadrado {
    double lado = 5.0;
    double a, p;

    void calculoArea(){
        a = Math.pow(lado, 2);
        System.out.println("area: " + a + " centimetros quadrados");
    }
    
    void calculoPerimetro(){
        p = lado * 4;
        System.out.println("perimetro: " + p + " centimetros");
    }

}
