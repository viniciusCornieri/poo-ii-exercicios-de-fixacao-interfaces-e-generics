package cornieri.vinicius.poo.solucoes.ex3.stack;

/**
 * Exceção lançada quando é feita operações que necessitam de valores em uma pilha vazia.
 */
public class StackEstaVaziaException extends RuntimeException {

    public StackEstaVaziaException() {
        super("Essa operação não pode ser realizada, pois a pilha está vazia");
    }
}
