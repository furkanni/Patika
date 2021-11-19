import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args) {
        int a;
        double result = 0;
        System.out.print("N Sayısını Giriniz: ");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        for (double i = 1; i <= a; i++) {
            result += (1 / i);
            
        }
        System.out.println("Sonuç: " + result);
    }
}


