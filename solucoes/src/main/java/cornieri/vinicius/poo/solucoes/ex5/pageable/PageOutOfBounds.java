package cornieri.vinicius.poo.solucoes.ex5.pageable;

public class PageOutOfBounds extends RuntimeException {

    private static final String MESSAGE_TEMPLATE = "Página com índice %s está fora dos limites. Os limites aceitos são de 0 a %s";

    public PageOutOfBounds(int pageNumber, int maxIndex) {
        super(MESSAGE_TEMPLATE.formatted(pageNumber, maxIndex));
    }
}
