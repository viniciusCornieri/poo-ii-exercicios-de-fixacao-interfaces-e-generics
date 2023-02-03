package cornieri.vinicius.poo.solucoes;

import java.math.BigDecimal;

public class ConstantesMatematicas {

    public static final BigDecimal PI = BigDecimal.valueOf(Math.PI);

    private ConstantesMatematicas() {
        throw new IllegalArgumentException("Essa é uma classe de constantes, não deve ser instanciada");
    }

}
