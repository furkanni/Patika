import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double fiyat, kdv, kdvlifiyat;

        Scanner abc = new Scanner(System.in);

        System.out.print("KDV'siz Fiyatı Giriniz: ");

        fiyat = abc.nextDouble();

        System.out.println("KDV Oranı: %18 ");

        kdv = fiyat * (0.18);

        System.out.println("KDV Tutarı: " + kdv);


        kdvlifiyat = fiyat * (1.18000);

        System.out.println("KDV'li Fiyat: " + kdvlifiyat);







    }
}
