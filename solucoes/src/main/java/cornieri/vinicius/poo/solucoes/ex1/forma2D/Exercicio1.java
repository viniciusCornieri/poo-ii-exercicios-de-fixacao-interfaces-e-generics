package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import java.math.BigDecimal;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
        Circulo circuloDeRaio1 = new Circulo(BigDecimal.ONE);
        Circulo circuloDeRaio3 = new Circulo(BigDecimal.valueOf(3));
        Quadrado quadradoDeLado10 = new Quadrado(BigDecimal.TEN);
        Quadrado quadradoDeLado5 = new Quadrado(BigDecimal.valueOf(5));
        Retangulo retanguloDeLados5e10 = new Retangulo(BigDecimal.valueOf(5), BigDecimal.TEN);
        Retangulo retanguloDeLados2e15 = new Retangulo(BigDecimal.valueOf(2), BigDecimal.valueOf(15));

        List<Forma2D> formas2Ds = List.of(circuloDeRaio1, circuloDeRaio3, quadradoDeLado10, quadradoDeLado5, retanguloDeLados5e10, retanguloDeLados2e15);
        System.out.println(somaDasAreas(formas2Ds));

        // Para mais exemplos consulte a classe de teste.
    }

    public static BigDecimal somaDasAreas(List<? extends Forma2D> formas2D) {
        // utilizando stream
        BigDecimal valorInicial = BigDecimal.ZERO;
        return formas2D.stream()
                .map(Forma2D::area)
                .reduce(valorInicial, BigDecimal::add);

        /*
            //sem utilizar stream
            BigDecimal soma = valorInicial;
            for (Forma2D forma: formas2D) {
                soma = soma.add(forma.calcularArea());
            }
            return soma;
         */
    }
}
