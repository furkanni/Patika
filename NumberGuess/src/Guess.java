import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int arr[] = new int[5];

        int rand = rnd.nextInt(100);
        System.out.println(rand);

       System.out.print("Lütfen 0 ile 100 Aralığında Olmak Üzere ");



        for (int i = 0 ; i <= 4; i++) {

            System.out.print("Tahmininizi Giriniz: ");
            int gss = scn.nextInt();

            arr [i] = gss;

            if (gss != rand) {
                System.out.println("Yanlış Tahmin!");

                if (gss < rand) {
                    System.out.println("Bulmanız Gereken Değer Daha Büyük!");
                } else System.out.println("Bulmanız Gereken Değer Daha Küçük!");

                System.out.println("Kalan Hakkınız: " + (4 -i));

                System.out.println("========================");


                if (i == 4) {
                    System.out.println("\nGeçmiş Tahminleriniz: " + Arrays.toString(arr));
                    System.out.println("\nHaklarınız Bitti Kabettiniz :(");
                }

            } else {
                System.out.println("Tebrikler Doğru Tahmin! \nSayı: " + gss);
                break;
            }


        }
    }

}
