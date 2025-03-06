import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Input Number : ");
            int Number = Integer.parseInt(input.nextLine());
            int arr[] = new int[Number];
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("Arr[%d] = ", i);
                arr[i] = Integer.parseInt(input.nextLine());
            }
            input.close();
            System.out.println("Output :");
            TriangleArray(arr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void TriangleArray(int arr[]) {
        if (arr.length > 1) {
            int tmp[] = new int[arr.length - 1];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = arr[i] + arr[i+1];
            }
            TriangleArray(tmp);
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            System.out.println(arr[0]);
        }
    }
}
