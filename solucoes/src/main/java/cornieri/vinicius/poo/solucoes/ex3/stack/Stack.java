package cornieri.vinicius.poo.solucoes.ex3.stack;

public interface Stack<E> {

    /**
     * Adiciona um elemento na pilha
     * @param elemento a ser adicionado na pilha
     */
    void push(E elemento);

    /**
     * Remove e retorna o último elemento adicionado na pilha.
     * @return o último elemento adicionado na pilha.
     */
    E pop();

    /**
     * retorna o último elemento adicionado na pilha.
     * @return o último elemento adicionado na pilha
     */
    E peek();

    /**
     * @return a quantidade de elementos na pilha
     */
    int size();

    /**
     * @return se a pilha está ou não vazia.
     */
    boolean isEmpty();
}
