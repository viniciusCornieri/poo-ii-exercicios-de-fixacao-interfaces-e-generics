package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import java.math.BigDecimal;

public class Retangulo implements Forma2D {

    private final BigDecimal base;
    private final BigDecimal altura;

    public Retangulo(BigDecimal base, BigDecimal altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public BigDecimal area() {
        return base.multiply(altura);
    }
}
