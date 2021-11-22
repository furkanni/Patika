import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        int a, b, n1, n2, i = 1, k = 1, ebob = 1 , ekok = 1;
        Scanner scn = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        a = scn.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        b = scn.nextInt();

        if (a <= b) {
            n1 = a;
            n2 = b;
        } else {
            n1 = b;
            n2 = a;
        }
        // System.out.println("birinci sayı: " + n1);
        // System.out.println("ikinci sayı: "+ n2);

        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i ;

            }
            i++;
        }
        System.out.println("Ebob = " + ebob);
        System.out.println("Ekok = " + (n1 * n2) / ebob );
    }
}