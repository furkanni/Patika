
import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {
        int howMany, n1, smallest = 0, biggest = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz?: ");
        howMany = scn.nextInt();
        for (int i = 1; i <= howMany; i++) {
            System.out.print(i + ". Sayı: ");
            n1 = scn.nextInt();
            if (i == 1) {
                biggest = n1;
                smallest = n1;
            }
            if (n1 > biggest) {
                biggest = n1;
            }
            if (n1 < smallest) {
                smallest = n1;
            }


        }
        System.out.println("En Büyük Sayı: " + biggest);
        System.out.println("En Küçük Sayı: " + smallest);



    }
}