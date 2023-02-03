package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static cornieri.vinicius.poo.solucoes.ConstantesMatematicas.PI;

class CirculoTest {

    @Test
    void deveCalcularAAreaDeUmCirculo() {
        Circulo circuloDeRaio1 = new Circulo(BigDecimal.ONE);
        Assertions.assertThat(circuloDeRaio1.area()).isEqualByComparingTo(PI);

        BigDecimal tres = BigDecimal.valueOf(3);
        Circulo circuloDeRaio3 = new Circulo(tres);
        BigDecimal nove = BigDecimal.valueOf(9);
        Assertions.assertThat(circuloDeRaio3.area()).isEqualByComparingTo(nove.multiply(PI));
    }

}