import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("India");
        queue.add("Germany");
        queue.add("America");

        System.out.println("Original queue"+queue);

        queue.remove("India");

        System.out.println("After the removing the head element"+queue);

        System.out.println("Head of the queue"+queue.peek());

        System.out.println("remove head"+queue.poll());

    }
}