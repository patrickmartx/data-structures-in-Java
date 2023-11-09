package structures.stack;

import structures.queue.Queue;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.add("John");
        stack.add("Mary");
        stack.add("Ana");
        stack.add("Patrick");
        stack.add("Steven");
        System.out.println(stack.get());

        stack.remove();
        System.out.println(stack.get());

        stack.remove();
        System.out.println(stack.get());
    }
}
