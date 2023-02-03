package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import java.math.BigDecimal;

public class Circulo implements Forma2D {

    private static final BigDecimal PI = BigDecimal.valueOf(Math.PI);
    private final BigDecimal raio;

    public Circulo(BigDecimal raio) {
        this.raio = raio;
    }

    @Override
    public BigDecimal area() {
        BigDecimal raioAoQuadrado = raio.multiply(raio);
        return PI.multiply(raioAoQuadrado);
    }
}
