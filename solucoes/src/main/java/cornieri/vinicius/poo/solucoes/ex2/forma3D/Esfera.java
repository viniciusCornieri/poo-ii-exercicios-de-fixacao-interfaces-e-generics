package cornieri.vinicius.poo.solucoes.ex2.forma3D;

import java.math.BigDecimal;
import java.math.MathContext;

public class Esfera implements Forma3D {

    private static final BigDecimal PI = BigDecimal.valueOf(Math.PI);
    private static final BigDecimal QUATRO = BigDecimal.valueOf(4);
    private static final BigDecimal TRES = BigDecimal.valueOf(3);
    private static final MathContext PRECISAO_DE_5_CASAS_DECIMAIS = new MathContext(5);

    private final BigDecimal raio;

    public Esfera(BigDecimal raio) {
        this.raio = raio;
    }

    /**
     * @return area da esfera que corresponde a fórmula 4 * PI * raio²
     */
    @Override
    public BigDecimal area() {
        BigDecimal raioAoQuadrado = raio.multiply(raio);
        return QUATRO.multiply(PI).multiply(raioAoQuadrado);
    }

    /**
     * @return volume da esfera que corresponde a fórmula 4 * PI * raio³ / 3 com uma precisão de 5 casas decimais.
     */
    @Override
    public BigDecimal volume() {
        BigDecimal raioAoCubo = raio.pow(3);
        return QUATRO.multiply(PI).multiply(raioAoCubo).divide(TRES, PRECISAO_DE_5_CASAS_DECIMAIS);
    }
}
