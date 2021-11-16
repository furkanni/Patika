import java.util.Scanner;

public class dortVeBesinKuvvetleri {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz

        int a;
        System.out.print("Sayı Giriniz: ");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();

        System.out.print("4'ün Kuvvetleri: ");
       for (int i = 1 ; i<=a ; i *= 4) {

           System.out.print(i + ",");

       }
        System.out.print("\n5'in Kuvvetleri: " );
        for (int b = 1 ; b<= a ; b*=5){

            System.out.print(b + ",");

        }
    }
}