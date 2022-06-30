package CollectionsExercises;

import java.util.*;

public class PriorityQueueExercises {
    public static void main(String[] args) {
        PriorityQueue <String> queue = new PriorityQueue<>();
         queue.add("Table");
         queue.add("Chair");
         queue.add("Sofa");
         queue.add("Lampa");

         for (String line: queue) {
         	System.out.println(line + " ");
         }

         queue.removeAll(queue);
         System.out.println(queue.size());
         queue.toString();
         System.out.println(queue);

         PriorityQueue <Integer> queue1 = new PriorityQueue<>();

         queue1.add(80);
         queue1.add(15);
         queue1.add(2);
         queue1.add(55);
         System.out.println(queue1);
         int maxNum = Collections.max(queue1);
         System.out.println(maxNum);
    }
}
