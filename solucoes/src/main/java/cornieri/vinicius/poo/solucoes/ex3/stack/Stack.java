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
    E peek();

    int size();

    boolean isEmpty();
}
