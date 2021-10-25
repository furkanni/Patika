import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){
        //    Taksimetre KM başına 2.20 TL tutmaktadır.
        //    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //    Taksimetre açılış ücreti 10 TL'dir.

        double mesafe, min, total ;
        int acilis = 10;

        Scanner dbl = new Scanner(System.in);

        System.out.print("Yolculuk Mesafesini Giriniz KM: ");

        mesafe = dbl.nextDouble();

        total = (mesafe * 2.20) + acilis ;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Ücret TL: "+total);












    }
}
