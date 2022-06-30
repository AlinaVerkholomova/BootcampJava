package ExtraTasksDay4;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {

    public static void main(String[] args) {

        String[] arrString = {"White", "Blue", "Red",
                "Black", "Green", "Purple", "Yellow"};

        List<String> colors = new ArrayList<>(List.of(arrString));

        colors.remove(2);
        colors.add("Violet");
        colors.add(0, "Red");

        System.out.println("List of colors:");
        for (String line: colors){
            System.out.printf("%s ", line);
        }
        List<String> colorsSublist = new ArrayList<>(colors.subList(2, 5));

        System.out.println("\nSublist of colors:");
        for (String line: colorsSublist){
            System.out.printf("%s ", line);
        }
    }
}
