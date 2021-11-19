import java.util.Scanner;

public class basamakToplam {
    public static void main(String[] args) {
        int number, counter = 0, result = 0, basamak, basToplam = 0;
        System.out.print("Bir Sayı Giriniz: ");
        Scanner scn = new Scanner(System.in);
        number = scn.nextInt();
        int tempnum = number;

        
        tempnum = number ;
        System.out.print("Basamaklar: ");
        while (tempnum != 0) {
            basamak = tempnum % 10;
            tempnum /= 10;
            basToplam += basamak ;
            System.out.print(basamak +",");

        }
        System.out.println("\nsonuç: " + basToplam);

    }
}
