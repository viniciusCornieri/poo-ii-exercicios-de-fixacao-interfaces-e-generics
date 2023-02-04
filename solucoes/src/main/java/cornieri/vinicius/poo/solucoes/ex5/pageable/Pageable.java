package cornieri.vinicius.poo.solucoes.ex5.pageable;

public interface Pageable<T> {

    /**
     * Retorna um conjunto de elementos definidos por uma página, {@link Page}, referente ao índice informado.
     * Os índices das páginas começam em zero 0 e vão até o índice {@link Pageable#getTotalPages()}-1.
     * Cada página representa um subgrupo contendo no máximo {@link Pageable#getMaxElementsPerPage()}
     * de elementos.
     * @param pageNumber índice da página requisitada.
     * @return Page com os elementos referentes ao índice da página requisitada.
     */
    Page<T> getPage(int pageNumber);

    /**
     * Informa o número total de páginas obtidas ao dividir
     * os elementos em páginas de {@link Pageable#getMaxElementsPerPage()} elementos.
     * @return o número total de páginas
     */
    int getTotalPages();

    /**
     * @return o número total de elementos
     */
    int getTotalElements();

    /**
     * @return o número máximo de elementos por página
     */
    int getMaxElementsPerPage();
}
