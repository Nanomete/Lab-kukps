
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        int x = input.nextInt();
        int arr[][] = new int[x][];
        int nCol = x;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            // nCol = x, x-1, x-2, ..., 1
            arr[i] = new int[nCol];
            nCol--;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;
            }
        }

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
