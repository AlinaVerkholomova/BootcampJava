package CollectionsExercises;

import java.util.*;

public class HashSetsExercises {
    public static void main(String[] args) {

        Set <String> hashSet = new HashSet<>();

        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        Set <String> hashSet2 = new HashSet<>();

        hashSet2.add("One");
        hashSet2.add("Two");
        hashSet2.add("Three2");
        hashSet2.add("Four");
        hashSet2.add("Five2");


        for (String line: hashSet) {
            System.out.print(line + " ");
        }
        System.out.println();
        System.out.println(hashSet.size());


        // hashSet.clear();
        // hashSet.toArray();
        Set <String> treeSet = new TreeSet<>(hashSet);
        System.out.print(treeSet);

        List <String> list = new ArrayList<>(hashSet);
        System.out.println();
        System.out.print(list);

        hashSet.retainAll(hashSet2);
        System.out.print(hashSet);

    }

}
