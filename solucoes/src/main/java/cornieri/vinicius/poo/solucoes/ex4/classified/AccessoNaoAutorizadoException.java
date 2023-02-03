package cornieri.vinicius.poo.solucoes.ex4.classified;

public class AccessoNaoAutorizadoException extends Exception {

    public AccessoNaoAutorizadoException() {
        super("A senha para acesso a esse recurso é inválida, as autoridades serão notificadas desse ocorrido");
    }
}
