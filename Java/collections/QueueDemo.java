package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void show() {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // c will be executed first
        // the order is = b -> a -> c

        queue.offer("d");
        // brings to the end
        // d -> b -> a -> c

        var front = queue.peek();
        System.out.println(front);
        // prints the front. c

        /* If using peak, when the queue is
         * empty it return null. If using
         * element it throws a exception.
         */

         /* If using poll, when the queue is
         * empty it return null. If using
         * remove it throws a exception.
         */

         var front1 = queue.remove();
         System.out.println(front1);
         // return and removes the front item. c
    }
    
}
