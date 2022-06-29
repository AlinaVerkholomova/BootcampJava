package Package1;

import java.util.Random;


public class Task2Day3 {

    public static void main(String[] args) {
        int randArr [] = new int [4];
        int copyArr [] = new int [4];
        Random rand = new Random();

        for(int i = 0; i < randArr.length; i++) {
            randArr[i] = rand.nextInt();
        }
        System.out.println("Original array:");
        for(int num: randArr) {
            System.out.print(num + " ");
        }

        for(int i = 0; i < copyArr.length; i++){
            copyArr[i] = randArr[i];
        }

        System.out.println("\n\nCopy of the original array:");
        for(int num: copyArr) {
            System.out.print(num + " ");
        }
    }
}
