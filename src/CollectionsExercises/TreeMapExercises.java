package CollectionsExercises;

import java.util.*;

public class TreeMapExercises {
    public static void main(String[] args) {
        TreeMap <Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "First");
        treeMap.put(2, "Second");
        treeMap.put(3, "Third");
        treeMap.put(4, "Fourth");

        TreeMap <Integer, String> treeMap2 = new TreeMap<>(treeMap);
        System.out.println(treeMap2);

        for (Integer num: treeMap.keySet()){
            System.out.printf("%d ", num);
        }

        System.out.println();

        treeMap2.clear();
        System.out.println(treeMap2);

        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.floorEntry(2));

        System.out.println(treeMap.floorKey(3));
        System.out.println(treeMap.headMap(3));
        System.out.println(treeMap.navigableKeySet());
    }
}
