package CollectionsExercises;

import java.util.*;

public class ArrayListsExercises {
    public static void main(String[] args) {
        ArrayList <Integer> arrList = new ArrayList <>();
         	arrList.add(4);
         	arrList.add(5);
         	arrList.add(10);
         	arrList.add(0, 11);
         	arrList.add(arrList.size() - 1, 12);

         	for (Integer num: arrList){
         		System.out.println(num);
         	}
         	System.out.println();

         	Collections.swap(arrList, 3, 1);
         	for (Integer num: arrList){
         		System.out.println(num);
         	}

         List<Integer> arrList2 = (ArrayList<Integer>)arrList.clone();

         	arrList2.removeAll(arrList2);
         	System.out.println();
         	if (arrList2.isEmpty())
         		System.out.println(arrList2);
         	else
         		System.out.println("arrList2 is not empty");

         	// arrList.trimToSize();
         	arrList.ensureCapacity(9);
         System.out.println(arrList.size());

         arrList2.add(3);
         arrList2.add(8);
         arrList2.add(19);
         arrList2.add(0, 16);
         arrList2.add(arrList2.size() - 1, 2);

         arrList2 = (List<Integer>)arrList.clone();

    }
}
