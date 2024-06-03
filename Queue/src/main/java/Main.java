import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayBlockingQueue<>(6);
        System.out.println(queue.poll());
        try{
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);
            queue.offer(5);
            System.out.println(queue.offer(6 ));
            System.out.println(queue.poll());
            queue.offer(7);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

//        queue.add(null);
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
