package cornieri.vinicius.poo.solucoes.ex5.pageable;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class PageableList<T> implements Pageable<T> {

    private final List<T> elementos;

    private final int maxElementsPerPage;

    private final int totalPagesNumber;

    public PageableList(List<T> elementos, int maxElementsPerPage) {
        this.elementos = List.copyOf(elementos);
        this.maxElementsPerPage = maxElementsPerPage;
        this.totalPagesNumber = calculaTotalDePaginas();
    }

    private int calculaTotalDePaginas() {
        if (getTotalElements() == 0) {
            return 1;
        }

        BigDecimal total = BigDecimal.valueOf(getTotalElements());
        BigDecimal maxPerPage = BigDecimal.valueOf(getMaxElementsPerPage());
        int divisaoArredondadaParaCima = total.divide(maxPerPage, RoundingMode.CEILING).intValue();
        return divisaoArredondadaParaCima;
    }

    @Override
    public Page<T> getPage(int pageNumber) {
        if (pageNumber >= getTotalPages()) {
            throw new PageOutOfBounds(pageNumber, getMaxIndex());
        }
        int indiceInferior = pageNumber * getMaxElementsPerPage();
        int indiceSuperior = indiceInferior + getMaxElementsPerPage();
        if (indiceSuperior > getTotalElements()) {
            indiceSuperior = getTotalElements();
        }
        List<T> elementosDaPagina = elementos.subList(indiceInferior, indiceSuperior);
        return new Page<>(elementosDaPagina, pageNumber, isLastPage(pageNumber));
    }

    private int getMaxIndex() {
        return getTotalPages() - 1;
    }

    private boolean isLastPage(int pageNumber) {
        return pageNumber == getMaxIndex();
    }

    @Override
    public int getTotalPages() {
        return totalPagesNumber;
    }

    @Override
    public int getTotalElements() {
        return elementos.size();
    }

    @Override
    public int getMaxElementsPerPage() {
        return maxElementsPerPage;
    }

    @Override
    public String toString() {
        return "PageableList{" +
                "elementos=" + elementos +
                ", maxElementsPerPage=" + maxElementsPerPage +
                ", totalPagesNumber=" + totalPagesNumber +
                '}';
    }
}
