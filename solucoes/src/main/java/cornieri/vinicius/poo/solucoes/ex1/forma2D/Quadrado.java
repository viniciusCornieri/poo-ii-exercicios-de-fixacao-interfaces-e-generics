package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import java.math.BigDecimal;

public class Quadrado implements Forma2D {

    private final BigDecimal lado;

    public Quadrado(BigDecimal lado) {
        this.lado = lado;
    }

    @Override
    public BigDecimal area() {
        return lado.multiply(lado);
    }
}
