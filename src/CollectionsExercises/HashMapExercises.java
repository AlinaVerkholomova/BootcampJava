package CollectionsExercises;

import java.util.*;

public class HashMapExercises {
    public static void main(String[] args) {
        Map <Integer, String> hashMap = new HashMap<>();


        hashMap.put(1, "One");
         hashMap.put(2, "Two");
         hashMap.put(3, "Three");
         hashMap.put(4, "Four");

         System.out.println(hashMap.size());

        Map<Integer, String> hashMap2 = new HashMap<>(hashMap);
         System.out.println(hashMap2);

         System.out.println(hashMap.containsKey(1));
         System.out.println(hashMap.containsValue("First"));

         Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
         System.out.println(set);

         System.out.println(hashMap.values());
    }
}
