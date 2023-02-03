package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class QuadradoTest {

    @Test
    void deveCalcularAAreaDeUmQuadrado() {
        Quadrado quadradoDeLado1 = new Quadrado(BigDecimal.ONE);
        Assertions.assertThat(quadradoDeLado1.area()).isEqualByComparingTo(BigDecimal.ONE);

        BigDecimal cinco = BigDecimal.valueOf(5);
        Quadrado quadradoDeLado5 = new Quadrado(cinco);

        BigDecimal vinteECinco = BigDecimal.valueOf(25);
        Assertions.assertThat(quadradoDeLado5.area()).isEqualByComparingTo(vinteECinco);
    }

}