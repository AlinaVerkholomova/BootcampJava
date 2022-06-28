package Package1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TasksDay2 {


    public static void task1() {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter value a: ");
            int numFirst = sc.nextInt();
            System.out.print("Enter value b: ");
            int numSecond = sc.nextInt();

            System.out.printf("is %d equal to %d? - %b", numFirst, numSecond, numFirst == numSecond);
            System.out.println();
            System.out.printf("is %d less than %d? - %b", numFirst, numSecond, numFirst < numSecond);
            System.out.println();
            System.out.printf("is %d less or equal to %d? - %b", numFirst, numSecond, numFirst <= numSecond);
            System.out.println();
            System.out.printf("is %d greater than to %d? - %b", numFirst, numSecond, numFirst > numSecond);
            System.out.println();
            System.out.printf("is %d greater or equal to %d? - %b", numFirst, numSecond, numFirst >= numSecond);
        }
        catch (InputMismatchException e) {
            System.out.println("Incorrect input");
        }
    }


    public static void task2() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("\n");
            System.out.print("Enter b1: ");
            boolean boolFirst = sc.nextBoolean();
            System.out.print("Enter b2: ");
            boolean boolSecond = sc.nextBoolean();

            String result = (boolFirst == boolSecond) ? "true" : "false";
            System.out.println("Is b1 and b2 equal? - " + result);
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect input");
        }
    }


    public static void task3() {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Please enter a number: ");
            int number = sc.nextInt();
            System.out.printf("Is %d even number? - %b", number, number % 2 == 0);

        }
        catch (InputMismatchException e){
            System.out.println("Incorrect input");
        }
    }


    public static void task4() {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("\n");
            System.out.print("Please enter a number: ");
            int number = sc.nextInt();
            System.out.printf("Is %d odd number? - %b", number, number % 2 != 0);

        }
        catch (InputMismatchException e){
            System.out.println("Incorrect input");
        }
    }


    public static void task5() {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("\n");
            System.out.print("Enter boolean value: ");
            boolean boolVal = sc.nextBoolean();
            System.out.printf("Opposite of %b is %b", boolVal, !boolVal);

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
        }
    }


    public static void task6() {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("\n");
            System.out.print("Enter value a: ");
            int numFirst = sc.nextInt();
            System.out.print("Enter value b: ");
            int numSecond = sc.nextInt();

            System.out.println((numFirst == numSecond) ||
                    (numFirst < 0 && numSecond > 0) ||
                    (numFirst > 100 && numSecond > 100));

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input");
        }
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }
}
