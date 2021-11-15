import java.util.Scanner;

/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
public class forOdev {
    public static void main(String[] args) {
        int sayi, sum = 0, k = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        sayi = inp.nextInt();


        for (int i = 0; i <= sayi; i++) {

            //System.out.println(i);

            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                k += 1;

            }


        }
        System.out.println("Ortalama: " + sum / k);
    }
}




