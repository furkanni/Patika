import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int times, n1 = 0, n2 = 1, n3 ;
        System.out.print("Eleman Sayısını Giriniz: ");
        times = scn.nextInt();

        System.out.print("0,");
        for (int i = 2; i <= times; i++) {
           // System.out.println("i ler :" + i);
            n3 = n1 + n2;
            System.out.print(" " + n3 +",");
            n1 = n2;
            n2 = n3;



        }


    }
}
