package cornieri.vinicius.poo.solucoes.ex4.classified;

public class Classified<E> {

    private final E objetoSigiloso;

    private final String senha;

    public Classified(E object, String senha) {
        this.objetoSigiloso = object;
        this.senha = senha;
    }

    public E get(String senhaRecebida) throws AccessoNaoAutorizadoException {
        if (this.senha.equals(senhaRecebida)) {
            return objetoSigiloso;
        }

        throw new AccessoNaoAutorizadoException();
    }

    @Override
    public String toString() {
        return "Objeto sigiloso[*****]";
    }
}
