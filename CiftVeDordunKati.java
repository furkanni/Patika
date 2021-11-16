import java.util.Scanner;

public class CiftVeDordunKati {
    public static void main(String[] args) {
        int a, b=0 ;

        do {
            System.out.print("Sayı Giriniz: ");
            Scanner scn = new Scanner(System.in);
            a=scn.nextInt();
            if (a % 2 == 0 && a % 4 == 0){
                b += a;

            }


        } while ( a % 2 == 0 );
        System.out.println("Toplam: " + b);



    }
}


