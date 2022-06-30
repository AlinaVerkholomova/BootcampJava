package InputOutputExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class IOExercises {

    public static void main(String[] args) {

        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
        eighthTask();
        ninthTask();
        eleventhTask();

    }

    public static void thirdTask() {

        File file = new File("src/Package1/Task1Day3.java");

        if (file.exists()) {
            System.out.printf("Specified file exists %s", file.getAbsolutePath());
        } else
            System.out.println("Specified file doesn't exist");
    }

    public static void fourthTask() {

        File file = new File("src");

        if (file.canRead())
            System.out.printf("\nThe %s has read permission.", file.getName());
        else
            System.out.printf("\nThe %s doesn't have read permission.", file.getName());

        if (file.canWrite())
            System.out.printf("\nThe %s has write permission.", file.getName());
        else
            System.out.printf("\nThe %s doesn't have write permission.", file.getName());
    }

    public static void fifthTask() {

        File file = new File("src/Package1");

        if (file.isFile()){
            System.out.printf("\n%s is a file", file.getPath());
        }
        else
            System.out.printf("\n%s is a directory", file.getPath());

    }

    public static void sixthTask() {

        File file1 = new File("src/InputOutputExercises/text1.txt");
        File file2 = new File("src/InputOutputExercises/text12.txt");

        int compareFiles1 = file1.compareTo(file2);
        int compareFiles2 = file2.compareTo(file1);

        System.out.println("\n" + compareFiles1);
        System.out.println(compareFiles2);
    }

    public static void seventhTask() {

        File file = new File("src/InputOutputExercises/text1.txt");
        Date date = new Date(file.lastModified());
        System.out.println(date);
    }

    public static void eighthTask() {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please enter some text: ");
            String text = in.readLine();

            System. out.println(text);
        } catch (IOException e) {
            System.out.println("Input/Output Exception");
        }
    }

    public static void ninthTask() {

        try {

            File file = new File("src/Package1/Task2Day3.java");
            Path path = Paths.get(file.getAbsolutePath());

            System.out.printf("\nFile %s size in bytes: %d", file.getName(), Files.size(path));
            System.out.printf("\nFile %s size in kilobytes: %f", file.getName(), (double)Files.size(path) / 1024);
            System.out.printf("\nFile %s size in megabytes: %f", file.getName(), (double)Files.size(path) / (1024*1024));

        } catch (FileNotFoundException e) {
            System.out.printf("File %s doesn't exist", "src/Package1/Task2Day3.java");
        } catch (IOException e ) {
            System.out.println("Input/Output Exception");
        }
    }

    public static void eleventhTask() {

        File file = new File ("src/Package1/Task1Day3.java");
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.printf("File %s doesn't exist", "src/Package1/Task1Day3.java");
        }
    }


}