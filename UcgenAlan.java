import java.util.Scanner;
public class UcgenAlan {
    public static void main (String[] args){

        // 2u = uu olarak yazılmıştır.


        double a, b, c, u, uu, alan ;


        Scanner scn = new Scanner(System.in);

        System.out.print("a kenarının uzunluğunu giriniz: ");

        a = scn.nextDouble();

        System.out.print("b kenarının uzunluğunu giriniz: ");

        b = scn.nextDouble();

        System.out.print("c kenarının uzunluğunu giriniz: ");

        c= scn.nextDouble();

        uu = (a+b+c) ;

        System.out.println("Üçgenin Çevresi= "+uu);

        u = ((a+b+c)/2) ;

        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        alan = (u * (u - a)* (u - b) * (u - c));

        System.out.println("Üçgenin Alanı= "+ alan);



















    }
}
