import java.util.Scanner;

public class NO_1 {
    // ข้อ 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        int x = input.nextInt();
        int arr[][] = new int[x][]; // สร้าง array 2 มิติ โดยมีจำนวน row = x
        int nCol = x;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            // nCol = x, x-1, x-2, ..., 1
            arr[i] = new int[nCol]; // สร้าง array 1 มิติ โดยมีจำนวน column = nCol
            nCol--;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count; // กำหนดค่าให้กับ array 1 มิติ
                count++; // นับจำนวนค่าที่กำหนด
            }
        }

        for (int[] row : arr) { // แสดงค่าใน array 2 มิติ โดยใช้ for-each คือ วนลูปทุก row ใน arr
            for (int value : row) { // วนลูปทุก column ใน row
                System.out.print(value + " "); // แสดงค่าใน column
            }
            System.out.println();
        }
    }
}
