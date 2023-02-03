package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

class Exercicio1Test {

    @Test
    void deveSomarAreaDeQuadrados() {
        Quadrado quadradoDeLado1 = new Quadrado(BigDecimal.ONE);
        BigDecimal cinco = BigDecimal.valueOf(5);
        Quadrado quadradoDeLado5 = new Quadrado(cinco);

        List<Quadrado> listaDeQuadrados = List.of(quadradoDeLado1, quadradoDeLado5);
        
        BigDecimal areaQuadradoDeLado1 = quadradoDeLado1.area();
        BigDecimal areaQuadradoDeLado5 = quadradoDeLado5.area();

        Assertions.assertThat(Exercicio1.somaDasAreas(listaDeQuadrados)).isEqualByComparingTo(areaQuadradoDeLado1.add(areaQuadradoDeLado5));
    }

    @Test
    void deveSomarAreaDeCirculos() {
        Circulo circuloDeRaio1 = new Circulo(BigDecimal.ONE);
        BigDecimal tres = BigDecimal.valueOf(3);
        Circulo circuloDeRaio3 = new Circulo(tres);
        List<Circulo> listaDeCirculos = List.of(circuloDeRaio1, circuloDeRaio3);
        BigDecimal somaDasAreasDosCirculos = Exercicio1.somaDasAreas(listaDeCirculos);

        BigDecimal areaDoCirculoDeArea1 = circuloDeRaio1.area();
        BigDecimal areaDoCirculoDeArea3 = circuloDeRaio3.area();
        Assertions.assertThat(somaDasAreasDosCirculos).isEqualByComparingTo(areaDoCirculoDeArea1.add(areaDoCirculoDeArea3));
    }

    @Test
    void deveSomarAreaDeRetangulos() {
        BigDecimal quatro = BigDecimal.valueOf(4);
        Retangulo retanguloDeLados1e4 = new Retangulo(BigDecimal.ONE, quatro);

        BigDecimal sete = BigDecimal.valueOf(7);
        BigDecimal oito = BigDecimal.valueOf(8);
        Retangulo retanguloDeLados6e8 = new Retangulo(sete, oito);
       
        List<Retangulo> listaDeRetangulos = List.of(retanguloDeLados1e4, retanguloDeLados6e8);

        BigDecimal areaDoRetanguloDeLados1e4 = retanguloDeLados1e4.area();
        BigDecimal areaDoRetanguloDeLados6e8 = retanguloDeLados6e8.area();
        
        Assertions.assertThat(Exercicio1.somaDasAreas(listaDeRetangulos)).isEqualByComparingTo(areaDoRetanguloDeLados1e4.add(areaDoRetanguloDeLados6e8));
    }

    @Test
    void deveSomarAreaDeFormasDistintas() {

        BigDecimal cinco = BigDecimal.valueOf(5);
        Quadrado quadradoDeLado5 = new Quadrado(cinco);
        
        Circulo circuloDeRaio1 = new Circulo(BigDecimal.ONE);

        BigDecimal sete = BigDecimal.valueOf(7);
        BigDecimal oito = BigDecimal.valueOf(8);
        Retangulo retanguloDeLados6e8 = new Retangulo(sete, oito);

        List<Forma2D> listaDeFormas = List.of(quadradoDeLado5, retanguloDeLados6e8, circuloDeRaio1);

        BigDecimal areaQuadradoDeLado5 = quadradoDeLado5.area();
        BigDecimal areaDoCirculoDeArea1 = circuloDeRaio1.area();
        BigDecimal areaDoRetanguloDeLados6e8 = retanguloDeLados6e8.area();

        BigDecimal somaEsperadaDasAreas = areaQuadradoDeLado5.add(areaDoRetanguloDeLados6e8).add(areaDoCirculoDeArea1);
        Assertions.assertThat(Exercicio1.somaDasAreas(listaDeFormas))
                .isEqualByComparingTo(somaEsperadaDasAreas);
    }

}