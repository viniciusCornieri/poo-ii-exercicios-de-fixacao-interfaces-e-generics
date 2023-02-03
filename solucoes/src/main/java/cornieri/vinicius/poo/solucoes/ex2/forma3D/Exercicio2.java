package cornieri.vinicius.poo.solucoes.ex2.forma3D;

import cornieri.vinicius.poo.solucoes.ex1.forma2D.Exercicio1;
import cornieri.vinicius.poo.solucoes.ex1.forma2D.Forma2D;

import java.math.BigDecimal;
import java.util.List;

public class Exercicio2 {

    public static void main(String[] args) {
        Cubo cuboDeLado1 = new Cubo(BigDecimal.ONE);
        Cubo cuboDeLado10 = new Cubo(BigDecimal.TEN);
        Esfera esferaDeRaio2 = new Esfera(BigDecimal.valueOf(2));
        Esfera esferaDeRaio7 = new Esfera(BigDecimal.valueOf(7));
        Cilindro cilindroDeRaio3eAltura5 = new Cilindro(BigDecimal.valueOf(3), BigDecimal.valueOf(5));
        Cilindro cilindroDeRaio4eAltura6 = new Cilindro(BigDecimal.valueOf(4), BigDecimal.valueOf(6));

        List<Forma3D> listaDeFormas = List.of(cuboDeLado1, cuboDeLado10, esferaDeRaio2, esferaDeRaio7, cilindroDeRaio3eAltura5, cilindroDeRaio4eAltura6);

        System.out.println("Soma dos volumes: " + somaDosVolumes(listaDeFormas));
        System.out.println("Soma das áreas: " + somaDasAreas(listaDeFormas));

        // Para mais exemplos consulte as classes de testes.
    }

    public static BigDecimal somaDasAreas(List<? extends Forma2D> formas2D) {
        return Exercicio1.somaDasAreas(formas2D);
    }

    public static BigDecimal somaDosVolumes(List<? extends Forma3D> formas3D) {
        // utilizando stream
        java.math.BigDecimal valorInicial = java.math.BigDecimal.ZERO;
        return formas3D.stream()
                .map(Forma3D::volume)
                .reduce(valorInicial, java.math.BigDecimal::add);


//            //sem utilizar stream
//            BigDecimal soma = valorInicial;
//            for (Forma3D forma: formas3D) {
//                soma = soma.add(forma.volume());
//            }
//            return soma;

    }
}
