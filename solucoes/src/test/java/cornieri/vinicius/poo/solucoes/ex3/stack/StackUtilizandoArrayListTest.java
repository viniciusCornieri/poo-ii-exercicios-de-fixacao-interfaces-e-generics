package cornieri.vinicius.poo.solucoes.ex3.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackUtilizandoArrayListTest {

    @Test
    void isEmptyDeveRetornarTrueQuandoAListaEstaVazia() {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    void isEmptyDeveRetornarFalseQuandoAListaTerElementos() {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        stack.push("elemento");
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    void peekDeveRetornarOUltimoElementoAdicionado() {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        String primeiro = "primeiro";
        stack.push(primeiro);
        Assertions.assertEquals(primeiro, stack.peek());

        String segundo = "segundo";
        stack.push(segundo);
        Assertions.assertEquals(segundo, stack.peek());

        String terceiro = "terceiro";
        stack.push(terceiro);
        Assertions.assertEquals(terceiro, stack.peek());

        stack.pop();
        String quarto = "quarto";
        stack.push(quarto);
        Assertions.assertEquals(quarto, stack.peek());
    }

    @Test
    void popDeveRetornarERemoverOUltimoElementoAdicionado() {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        String primeiro = "primeiro";
        String segundo = "segundo";
        String terceiro = "terceiro";
        String quarto = "quarto";


        stack.push(primeiro);
        stack.push(segundo);
        stack.push(terceiro);

        Assertions.assertEquals(terceiro, stack.pop());
        stack.push(quarto);
        Assertions.assertEquals(quarto, stack.pop());
        Assertions.assertEquals(segundo, stack.pop());
        Assertions.assertEquals(primeiro, stack.pop());
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    void peekDeveRetornarERemoverOUltimoElementoAdicionado() {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        String primeiro = "primeiro";
        String segundo = "segundo";
        String terceiro = "terceiro";

        stack.push(primeiro);
        stack.push(segundo);
        stack.push(terceiro);

        Assertions.assertEquals(terceiro, stack.pop());
        Assertions.assertEquals(segundo, stack.pop());
        Assertions.assertEquals(primeiro, stack.pop());
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    void peekDeveLancarStackEstaVaziaExceptionCasoSejaChamadoEmUmaPilhaVazia() {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        Assertions.assertThrows(StackEstaVaziaException.class, () -> stack.peek());
    }

    @Test
    void popDeveLancarStackEstaVaziaExceptionCasoSejaChamadoEmUmaPilhaVazia() {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        Assertions.assertThrows(StackEstaVaziaException.class, () -> stack.pop());
    }

    @Test
    void sizeDeveIncrementarACadaElementoAdicionadoEDecrementarACadaElementoRemovido() {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        Assertions.assertEquals(0, stack.size());

        stack.push("primeiro");
        Assertions.assertEquals(1, stack.size());

        stack.push("segundo");
        Assertions.assertEquals(2, stack.size());

        stack.push("terceiro");
        Assertions.assertEquals(3, stack.size());

        stack.pop();
        Assertions.assertEquals(2, stack.size());

        stack.pop();
        Assertions.assertEquals(1, stack.size());

        stack.pop();
        Assertions.assertEquals(0, stack.size());
    }


}