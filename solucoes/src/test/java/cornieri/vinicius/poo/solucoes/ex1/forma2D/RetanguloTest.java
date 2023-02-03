package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

class RetanguloTest {

    @Test
    void deveCalcularAAreaDeUmRetangulo() {
        BigDecimal quatro = BigDecimal.valueOf(4);
        Retangulo retanguloDeLados1e4 = new Retangulo(BigDecimal.ONE, quatro);
        Assertions.assertThat(retanguloDeLados1e4.area()).isEqualByComparingTo(quatro);

        BigDecimal sete = BigDecimal.valueOf(7);
        BigDecimal oito = BigDecimal.valueOf(8);
        Retangulo retanguloDeLados6e8 = new Retangulo(sete, oito);

        BigDecimal cinquentaESeis = BigDecimal.valueOf(56);
        Assertions.assertThat(retanguloDeLados6e8.area()).isEqualByComparingTo(cinquentaESeis);
    }


}