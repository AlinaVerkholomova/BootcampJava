package Package1;

public class Task1Day3 {

    public static void main(String[] args) {

        int[][] myArr = new int[10][10];

        for (int i = 1; i < myArr.length + 1; i++) {
            for (int j = 0; j < myArr.length; j++) {
                myArr[i-1][j] = i * (j + 1);
            }
        }

        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr.length; j++) {

                System.out.printf("%d * %d = %d \n", i+1, j+1, myArr[i][j]);
            }
            System.out.println();
        }
    }
}
