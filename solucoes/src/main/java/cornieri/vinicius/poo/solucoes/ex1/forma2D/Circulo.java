package cornieri.vinicius.poo.solucoes.ex1.forma2D;

import cornieri.vinicius.poo.solucoes.ConstantesMatematicas;

import java.math.BigDecimal;

public class Circulo implements Forma2D {

    private final BigDecimal raio;

    public Circulo(BigDecimal raio) {
        this.raio = raio;
    }

    @Override
    public BigDecimal area() {
        BigDecimal raioAoQuadrado = raio.multiply(raio);
        return ConstantesMatematicas.PI.multiply(raioAoQuadrado);
    }
}
