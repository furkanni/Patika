import java.util.Scanner;

public class AsalSayi {


    static int CheckPrime(int i, int num) {
        if (num == i)
            return 0;
        else if (num % i == 0)
            return 1;
        else {
            return CheckPrime(i + 1, num);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz sayıyı girin: ");
        int check = scn.nextInt();
        if (CheckPrime(2, check) == 0) {
            System.out.println(check + " bir asal sayıdır.");
        } else {
            System.out.println(check + " bir asal sayı değildir.");
        }

    }
    
}
