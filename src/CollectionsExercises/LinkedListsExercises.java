package CollectionsExercises;

import java.util.*;

public class LinkedListsExercises {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(90);
        linkedList.add(24);
        linkedList.add(15);
        linkedList.add(1, 67);

        for (Integer num: linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        Iterator<Integer> iter = linkedList.listIterator(1);
        while(iter.hasNext())
            System.out.println(iter.next());

        Collections.reverse(linkedList);

        for (Integer num: linkedList) {
            System.out.print(num + " ");
        }

        linkedList.remove(1);
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println();
        for (Integer num: linkedList) {
            System.out.print(num + " ");
        }

        Collections.swap(linkedList, 1, 0);
        System.out.println();
        for (Integer num: linkedList) {
            System.out.print(num + " ");
        }
        System.out.println("\nIs empty: " + linkedList.isEmpty());

        Collections.replaceAll(linkedList, 67, 89);
        for (Integer num: linkedList) {
            System.out.print(num + " ");
        }


    }
}
