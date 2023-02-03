package cornieri.vinicius.poo.solucoes.ex4.classified;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassifiedTest {

    @Test
    void toStringNaoDeveRevelarConteudoDeObjetoSigiloso() {
        Classified<String> stringClassified = new Classified<>("mensagem importante", "senha_segura");
        Assertions.assertEquals("Objeto sigiloso[*****]", stringClassified.toString());

        Classified<Integer> integerClassified = new Classified<>(42, "senha_segura");
        Assertions.assertEquals("Objeto sigiloso[*****]", integerClassified.toString());
    }

    @Test
    void classifiedGetDeveLancarAccesoNaoAutorizadoExceptionQuandoPassadaSenhaInvalida() {
        Classified<String> stringClassified = new Classified<>("mensagem importante", "senha_segura");
        Assertions.assertThrows(AccessoNaoAutorizadoException.class, () -> stringClassified.get("senha_inválida"));

        Classified<Integer> integerClassified = new Classified<>(42, "senha_segura");
        Assertions.assertThrows(AccessoNaoAutorizadoException.class, () -> integerClassified.get("senha_inválida"));
    }

    @Test
    void classifiedGetDeveRetornarOValorQuandoASenhaEhValida() throws AccessoNaoAutorizadoException {
        String mensagemImportante = "mensagem importante";
        String senha = "senha_segura";
        Classified<String> stringClassified = new Classified<>(mensagemImportante, senha);
        Assertions.assertEquals(mensagemImportante, stringClassified.get(senha));

        int inteiroImportante = 42;
        Classified<Integer> integerClassified = new Classified<>(inteiroImportante, senha);
        Assertions.assertEquals(inteiroImportante, integerClassified.get(senha));
    }

}