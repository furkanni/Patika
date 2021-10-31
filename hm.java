import java.util.Scanner;
public class hm {
    public static void main(String[] args) {
        int a, b, operation;
        Scanner fn = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        a = fn.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        b = fn.nextInt();
        System.out.print("Yapmak İstediğiniz İşlemi Belirtiniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz: ");
        operation = fn.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Toplam Sonuç = " + (a + b));
                break;
            case 2:
                System.out.println("Fark Sonuç = " + (a - b));
                break;
            case 3:
                System.out.println("Çarpım Sonuç = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Bölüm Sonuç = " + (a / b));
                } else {
                    System.out.println("Hiçbir Sayı Sıfıra Bölünemez!");
                }
                break;
            default:
                System.out.println("Geçersiz Bir Değer Tuşladınız");


        }
    }
}
