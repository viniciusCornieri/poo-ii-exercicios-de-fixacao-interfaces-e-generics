package cornieri.vinicius.poo.solucoes.ex2.forma3D;

import java.math.BigDecimal;

public class Cubo implements Forma3D {

    private final BigDecimal lado;

    public Cubo(BigDecimal lado) {
        this.lado = lado;
    }

    /**
     * @return area do cubo que corresponde a fórmula 6 * lado²
     */
    @Override
    public BigDecimal area() {
        return BigDecimal.valueOf(6).multiply(ladoAoQuadrado());
    }

    /**
     * @return volume do cubo que corresponde a fórmula lado³
     */
    @Override
    public BigDecimal volume() {
        return ladoAoQuadrado().multiply(lado);
    }

    private BigDecimal ladoAoQuadrado() {
        return lado.multiply(lado);
    }
}
