import java.util.Scanner;

public class desen {
    static void fn(int a) {

        for (int i = a; -4 <= i; i -= 5) {
            System.out.print(i + " ");
            if (i <= 0) {
                for (int k = i + 5; k <= a; k += 5) {
                    System.out.print(k + " ");
                }

            }
        }

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int numb = scn.nextInt();
        fn(numb);






    }
}
