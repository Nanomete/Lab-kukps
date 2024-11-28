public class lab2_1 {
    public static void main(String[] args) {
        int i, j, w = 9, sum = 0;
        for (i = 0; i < w; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
                sum++;
            }
            System.out.print("\n");
        }
        // for (i = w - 2; i > 1; i--) {
        //     for (j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (j = 1; j < i; j++) {
        //         System.out.print("*");
        //         sum++;
        //     }
        //     System.out.print("\n");
        // }
        System.out.println("Count of * is " + sum);   
    }
}