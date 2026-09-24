import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Add elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(40);

        System.out.println("Queue: " + q);

        // Peek front element
        System.out.println("Front: " + q.peek());

        // Size
        System.out.println("Size: " + q.size());

        // Contains
        System.out.println("Contains 20: " + q.contains(20));

        // Remove
        System.out.println("Removed: " + q.remove());

        // Poll
        System.out.println("Polled: " + q.poll());

        System.out.println("Queue after removal: " + q);

        // Check empty
        System.out.println("Is empty: " + q.isEmpty());

        // Clear
        q.clear();

        System.out.println("After clear: " + q);
    }
}
