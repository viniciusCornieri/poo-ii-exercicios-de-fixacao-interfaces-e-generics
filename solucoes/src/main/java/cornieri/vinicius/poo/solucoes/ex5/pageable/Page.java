package cornieri.vinicius.poo.solucoes.ex5.pageable;

import java.util.Collection;
import java.util.List;

public class Page<T> {

    private final List<T> elements;

    private final int pageNumber;

    private final boolean lastPage;

    public Page(List<T> elements, int pageNumber, boolean lastPage) {
        this.elements = List.copyOf(elements);
        this.pageNumber = pageNumber;
        this.lastPage = lastPage;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    /**
     * @see List#copyOf(Collection)
     * @return uma lista imutável dos elementos da página
     */
    public List<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "Page{" +
                "elements=" + elements +
                ", pageNumber=" + pageNumber +
                ", lastPage=" + lastPage +
                '}';
    }
}
