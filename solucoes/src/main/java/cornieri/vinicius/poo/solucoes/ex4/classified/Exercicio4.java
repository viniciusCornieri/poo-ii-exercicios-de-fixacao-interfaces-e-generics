package cornieri.vinicius.poo.solucoes.ex4.classified;

public class Exercicio4 {

    public static void main(String[] args) {
        String mensagemImportante = "mensagem importante";
        String senha = "senha_segura";
        Classified<String> stringClassified = new Classified<>(mensagemImportante, senha);
        System.out.println(stringClassified);
        try {
            System.out.println(stringClassified.get(senha));
        } catch (AccessoNaoAutorizadoException e) {
            System.out.println("Acesso não autorizado detectado no primeiro uso");
            e.printStackTrace();
        }

        try {
            System.out.println(stringClassified.get("senha inválida"));
        } catch (AccessoNaoAutorizadoException e) {
            System.out.println("Acesso não autorizado detectado no segundo uso");
            e.printStackTrace();
        }
    }
}
