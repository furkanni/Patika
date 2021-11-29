import java.util.Scanner;

public class recUsAlma {


    static int power(int a, int b) {


        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
            //System.out.println("Sonuç: " + result);
            if (b == 0) {
                return 1;
            } else ;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("üstü alınacak sayıyı giriniz: ");
        int n1 = scn.nextInt();
        System.out.print("üst olacak sayıyı giriniz: ");
        int n2 = scn.nextInt();
        System.out.println("Sonuç: " + power(n1,n2));




    }


}