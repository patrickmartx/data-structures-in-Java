package structures.queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();

        queue.add("John");
        queue.add("Mary");
        queue.add("Ana");
        queue.add("Patrick");
        queue.add("Steven");
        System.out.println(queue.get());

        queue.remove();
        System.out.println(queue.get());

        queue.remove();
        System.out.println(queue.get());
    }
}
