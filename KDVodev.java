import java.util.Scanner;

public class KDVodev {
    public static void main(String[] args) {

        double fiyat, kdv, kdvlifiyat;

        Scanner abc = new Scanner(System.in);

        System.out.print("KDV'siz Fiyatı Giriniz: ");

        fiyat = abc.nextDouble();

        boolean kiyas = (fiyat <= 1000) ;

        String str = (kiyas) ? "KDV Oranı: %18" : "KDV Oranı: %8";

        System.out.println(str);

        double deneme = (kiyas) ? fiyat * (0.18) : fiyat * (0.08);

        System.out.println("KDV Tutarı: " + deneme);


        kdvlifiyat = fiyat + deneme ;

        System.out.println("KDV'li Fiyat: " + kdvlifiyat);


    }

}
