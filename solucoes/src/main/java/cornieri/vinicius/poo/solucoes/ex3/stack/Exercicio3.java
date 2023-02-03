package cornieri.vinicius.poo.solucoes.ex3.stack;

public class Exercicio3 {

    public static void main(String[] args) {
        Stack<String> stack = new StackUtilizandoArrayList<>();
        System.out.println("stack.isEmpty: " + stack.isEmpty());

        stack.push("Primeiro");
        stack.push("Segundo");
        stack.push("Terceiro");

        System.out.println("stack.isEmpty: " + stack.isEmpty());
        System.out.println("stack.size: " + stack.size());
        System.out.println("stack.peek: " + stack.peek());
        System.out.println("stack.pop: " + stack.pop());
        System.out.println("stack.peek: " + stack.peek());
        System.out.println("stack.size: " + stack.size());

    }
}
