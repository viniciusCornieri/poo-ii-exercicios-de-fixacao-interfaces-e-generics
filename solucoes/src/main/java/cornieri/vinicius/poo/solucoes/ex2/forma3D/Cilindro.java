package cornieri.vinicius.poo.solucoes.ex2.forma3D;

import java.math.BigDecimal;

import static cornieri.vinicius.poo.solucoes.ConstantesMatematicas.PI;

public class Cilindro implements Forma3D {

    private static final BigDecimal DOIS = BigDecimal.valueOf(2);

    private final BigDecimal raio;

    private final BigDecimal altura;

    public Cilindro(BigDecimal raio, BigDecimal altura) {
        this.raio = raio;
        this.altura = altura;
    }

    /**
     * @return area do cilindro que corresponde a fórmula (2 * PI * raio * altura) + (2 * PI * raio²);
     */
    @Override
    public BigDecimal area() {
        BigDecimal areaDosCirculos = DOIS.multiply(PI).multiply(raioAoQuadrado());
        BigDecimal areaDoRetangulo = DOIS.multiply(PI).multiply(raio).multiply(altura);
        return areaDoRetangulo.add(areaDosCirculos);
    }

    /**
     * @return volume do cilindro que corresponde a fórmula PI * raio² * altura.
     */
    @Override
    public BigDecimal volume() {
        return PI.multiply(raioAoQuadrado()).multiply(altura);
    }

    private BigDecimal raioAoQuadrado() {
        return raio.multiply(raio);
    }
}
