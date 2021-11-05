import java.util.Scanner;

public class ucakBilet {
    public static void main(String[] args) {
        double dist, age, yon, total, perKM = 0.1, distPrice;

        Scanner aa = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz: ");
        dist = aa.nextDouble();
        distPrice = dist * perKM;
        //System.out.println("mesafe ve km fiyatı toplam: " + distPrice);

        System.out.print("Yaşınızı Giriniz: ");
        age = aa.nextDouble();
        if (age < 12) {
            total = distPrice * 0.5;
            //System.out.println("12den küçükse fiyat: " + total);
        } else if (age >= 12 && age <= 24) {
            total = distPrice * 0.9;
            //System.out.println("12 ve 24 arası ise fiyat :" + total);
        } else if (age > 65) {
            total = distPrice * 0.8;
            //System.out.println("65ten büyükse fiyat: " + total);
        } else {
            total = distPrice;
        }

        System.out.print("Yolculuk Tipini Giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş) : ");
        yon = aa.nextDouble();

        if (yon == 1) {
            System.out.println("Toplam Fiyat: " + total + "TL");
        } else if (yon == 2) {
            System.out.println("Toplam Fiyat: " + (total * 0.8) + "TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz.");
        }


    }
}
