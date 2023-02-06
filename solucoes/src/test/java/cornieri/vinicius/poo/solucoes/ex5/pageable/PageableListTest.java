package cornieri.vinicius.poo.solucoes.ex5.pageable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class PageableListTest {

    @Test
    void deveRetornarPaginaVaziaParaUmaListaVazia() {
        int maxElementsPerPage = 3;
        Pageable<String> pageable = new PageableList<>(Collections.emptyList(), maxElementsPerPage);

        Assertions.assertEquals(maxElementsPerPage, pageable.getMaxElementsPerPage());
        Assertions.assertEquals(0, pageable.getTotalElements());
        Assertions.assertEquals(1, pageable.getTotalPages());

        Page<String> page = pageable.getPage(0);
        Assertions.assertEquals(0, page.getPageNumber());
        Assertions.assertEquals(0, page.getElements().size());
        Assertions.assertTrue(page.isLastPage());
    }

    @ParameterizedTest
    @MethodSource("listasDeEntradaParaElementosEm1Pagina")
    void deveRetornarUmaPaginaParaListaMenoresOuIgual1Pagina(List<String> lista) {
        int maxElementsPerPage = 3;
        Pageable<String> pageable = new PageableList<>(lista, maxElementsPerPage);

        Assertions.assertEquals(maxElementsPerPage, pageable.getMaxElementsPerPage());
        Assertions.assertEquals(lista.size(), pageable.getTotalElements());
        Assertions.assertEquals(1, pageable.getTotalPages());

        Page<String> page = pageable.getPage(0);
        Assertions.assertEquals(0, page.getPageNumber());
        Assertions.assertEquals(lista, page.getElements());
        Assertions.assertTrue(page.isLastPage());
    }

    public static Stream<Arguments> listasDeEntradaParaElementosEm1Pagina() {
        return Stream.of(
                Arguments.of(List.of("primeiro", "segundo")),
                Arguments.of(List.of("primeiro", "segundo", "terceiro"))
                );
    }

    @Test
    void deveRetornarPageOutOfBoundsQuandoPassarPedirPorUmaPaginaQueExcedaOsLimites() {
        int maxElementsPerPage = 3;
        List<String> lista = List.of("primeiro", "segundo", "terceiro", "quarto");
        final Pageable<String> pageable = new PageableList<>(lista, maxElementsPerPage);

        Assertions.assertEquals(maxElementsPerPage, pageable.getMaxElementsPerPage());
        Assertions.assertEquals(2, pageable.getTotalPages());

        Assertions.assertThrows(PageOutOfBounds.class, () -> pageable.getPage(2));
    }

    @Test
    void deveRetornarMultiplasPaginasParaListasQueExcedemONumeroMaximoDeElementosPorPagina() {
        int maxElementsPerPage = 3;
        List<String> listaCom7Elementos = List.of("primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "setimo");
        final Pageable<String> pageable = new PageableList<>(listaCom7Elementos, maxElementsPerPage);

        Assertions.assertEquals(maxElementsPerPage, pageable.getMaxElementsPerPage());
        Assertions.assertEquals(3, pageable.getTotalPages());
        Assertions.assertEquals(7, pageable.getTotalElements());

        int pageNumber = 0;
        Page<String> page0 = pageable.getPage(pageNumber);
        Assertions.assertEquals(pageNumber, page0.getPageNumber());
        Assertions.assertEquals(3, page0.getElements().size());
        Assertions.assertEquals(listaCom7Elementos.get(0), page0.getElements().get(0));
        Assertions.assertEquals(listaCom7Elementos.get(1), page0.getElements().get(1));
        Assertions.assertEquals(listaCom7Elementos.get(2), page0.getElements().get(2));
        Assertions.assertFalse(page0.isLastPage());

        pageNumber++;
        Page<String> page1 = pageable.getPage(pageNumber);
        Assertions.assertEquals(pageNumber, page1.getPageNumber());
        Assertions.assertEquals(3, page1.getElements().size());
        Assertions.assertEquals(listaCom7Elementos.get(3), page1.getElements().get(0));
        Assertions.assertEquals(listaCom7Elementos.get(4), page1.getElements().get(1));
        Assertions.assertEquals(listaCom7Elementos.get(5), page1.getElements().get(2));
        Assertions.assertFalse(page1.isLastPage());

        pageNumber++;
        Page<String> page2 = pageable.getPage(pageNumber);
        Assertions.assertEquals(pageNumber, page2.getPageNumber());
        Assertions.assertEquals(1, page2.getElements().size());
        Assertions.assertEquals(listaCom7Elementos.get(6), page2.getElements().get(0));
        Assertions.assertTrue(page2.isLastPage());

    }

}