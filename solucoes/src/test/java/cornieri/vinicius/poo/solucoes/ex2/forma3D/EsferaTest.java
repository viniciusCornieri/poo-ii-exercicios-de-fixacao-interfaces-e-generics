package cornieri.vinicius.poo.solucoes.ex2.forma3D;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static cornieri.vinicius.poo.solucoes.ConstantesMatematicas.PI;

class EsferaTest {

    private static final BigDecimal QUATRO = BigDecimal.valueOf(4);

    @Test
    void deveCalcularAAreaDeUmaEsfera() {
        Esfera esferaDeRaio1 = new Esfera(BigDecimal.ONE);
        Assertions.assertThat(esferaDeRaio1.area()).isEqualByComparingTo(QUATRO.multiply(PI));

        Esfera esferaDeRaio4 = new Esfera(QUATRO);
        BigDecimal quatroAoCubo = QUATRO.pow(3);
        Assertions.assertThat(esferaDeRaio4.area()).isEqualByComparingTo(quatroAoCubo.multiply(PI));
    }


    @Test
    void deveCalcularOVolumeDeUmaEsfera() {
        Esfera esferaDeRaio1 = new Esfera(BigDecimal.ONE);
        BigDecimal tres = BigDecimal.valueOf(3);
        MathContext precisaoDe5CasasDecimais = new MathContext(5);
        Assertions.assertThat(esferaDeRaio1.volume()).isEqualByComparingTo(QUATRO.multiply(PI).divide(tres, precisaoDe5CasasDecimais));

        Esfera esferaDeRaio4 = new Esfera(QUATRO);
        BigDecimal quatroAQuartaPotencia = QUATRO.pow(4);
        Assertions.assertThat(esferaDeRaio4.volume()).isEqualByComparingTo(quatroAQuartaPotencia.multiply(PI).divide(tres, precisaoDe5CasasDecimais));
    }
}