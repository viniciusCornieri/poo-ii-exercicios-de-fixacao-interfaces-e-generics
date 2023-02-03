package cornieri.vinicius.poo.solucoes.ex3.stack;

import java.util.ArrayList;

public class StackUtilizandoArrayList<E> implements Stack<E> {

    private final ArrayList<E> lista = new ArrayList<>();

    @Override
    public void push(E elemento) {
        lista.add(elemento);
    }

    @Override
    public E pop() {
        return lista.remove(lastIndex());
    }

    @Override
    public E peek() {
        return lista.get(lastIndex());
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    private int lastIndex() {
        if (isEmpty()) {
            throw new StackEstaVaziaException();
        }
        return size() - 1;
    }
}
