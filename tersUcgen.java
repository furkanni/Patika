import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        n = scn.nextInt();

        for (int a = 0; a <= n; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * n -  2 * a - 1); c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
