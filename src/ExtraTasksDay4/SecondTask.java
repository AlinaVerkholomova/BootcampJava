package ExtraTasksDay4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SecondTask {

    public static void main(String[] args) {

        File file = new File ("src/ExtraTasks/lorem.txt");
        Set<String> text = new HashSet<>();

        try {
            Scanner sc = new Scanner(file);

            do {
                String [] str = sc.nextLine().split("[.,;:()?! ]+");
                for(String word: str){
                    text.add(word.toLowerCase());
                }
            }
            while (sc.hasNextLine());
            sc.close();

        }
        catch (FileNotFoundException e) {
            System.out.printf("File %s doesn't exist", "src/ExtraTasks/lorem.txt");
        }
        catch(NoSuchElementException e) {
            System.out.println("No such element exception");
        }

        System.out.printf("Amount of unique words in %s: %d", file.getName(), text.size());

    }
}
