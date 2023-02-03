package cornieri.vinicius.poo.solucoes.ex2.forma3D;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CuboTest {

    @Test
    void deveCalcularAAreaDeUmCubo() {
        Cubo cuboDeLado1 = new Cubo(BigDecimal.ONE);
        BigDecimal seis = BigDecimal.valueOf(6);
        Assertions.assertThat(cuboDeLado1.area()).isEqualByComparingTo(seis);

        BigDecimal cinco = BigDecimal.valueOf(5);
        Cubo cuboDeLado5 = new Cubo(cinco);
        BigDecimal centoECinquenta = BigDecimal.valueOf(150);
        Assertions.assertThat(cuboDeLado5.area()).isEqualByComparingTo(centoECinquenta);
    }


    @Test
    void deveCalcularOVolumeDeUmCubo() {
        Cubo cuboDeLado1 = new Cubo(BigDecimal.ONE);
        Assertions.assertThat(cuboDeLado1.volume()).isEqualByComparingTo(BigDecimal.ONE);

        BigDecimal cinco = BigDecimal.valueOf(5);
        Cubo cuboDeLado5 = new Cubo(cinco);
        BigDecimal centoEVinteECinco = BigDecimal.valueOf(125);
        Assertions.assertThat(cuboDeLado5.volume()).isEqualByComparingTo(centoEVinteECinco);
    }

}