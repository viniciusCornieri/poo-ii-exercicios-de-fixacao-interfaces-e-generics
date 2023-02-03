package cornieri.vinicius.poo.solucoes.ex2.forma3D;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static cornieri.vinicius.poo.solucoes.ConstantesMatematicas.PI;

class CilindroTest {

    @Test
    void deveCalcularAAreaDeUmCilindro() {
        BigDecimal dois = BigDecimal.valueOf(2);
        Cilindro cilindroDeRaio1eAltura2 = new Cilindro(BigDecimal.ONE, dois);
        BigDecimal seis = BigDecimal.valueOf(6);
        Assertions.assertThat(cilindroDeRaio1eAltura2.area()).isEqualByComparingTo(seis.multiply(PI));

        Cilindro cilindroDeRaio2eAltura10 = new Cilindro(dois, BigDecimal.TEN);
        BigDecimal quarentaEOito = BigDecimal.valueOf(48);
        Assertions.assertThat(cilindroDeRaio2eAltura10.area()).isEqualByComparingTo(quarentaEOito.multiply(PI));
    }


    @Test
    void deveCalcularOVolumeDeUmCilindro() {
        BigDecimal dois = BigDecimal.valueOf(2);
        Cilindro cilindroDeRaio1eAltura2 = new Cilindro(BigDecimal.ONE, dois);
        Assertions.assertThat(cilindroDeRaio1eAltura2.volume()).isEqualByComparingTo(dois.multiply(PI));

        Cilindro cilindroDeRaio2eAltura10 = new Cilindro(dois, BigDecimal.TEN);
        BigDecimal quarenta = BigDecimal.valueOf(40);
        Assertions.assertThat(cilindroDeRaio2eAltura10.volume()).isEqualByComparingTo(quarenta.multiply(PI));
    }

}