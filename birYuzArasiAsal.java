import java.util.Scanner;
public class birYuzArasiAsal {
    public static void main(String[] args) {
        System.out.println("1 ile 100 Arasındaki Asal Sayılar");

        for (int i = 2; i <= 100; i++) {
            int counter = 0;
            //System.out.println(i);
            for (int k = 2; k <= i; k++) {
                if (i % k == 0) {
                    counter++;
                    //System.out.println(i);
                }

            }
            if (counter == 1) {
                System.out.print(i + " ");
            }
        }
    }

}