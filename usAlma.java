import java.util.Scanner;

public class usAlma {
    public static void main(String[] args) {
        int a, b, result = 1;

        Scanner scn = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        a = scn.nextInt();
        System.out.print("Üs Olacak Sayısı Giriniz: ");
        b = scn.nextInt();


        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.print("Sonuç: " + result);


    }
}
