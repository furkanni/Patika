import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int a, sum = 0, k = 1, b = 0;
        Scanner scn = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        a = scn.nextInt();

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
                //System.out.println(sum);
            }
        }
        if (sum == a) {
            System.out.println(a + " Sayısı Bir Mükemmel Sayıdır!");
        } else System.out.println(a + " Sayısı Bir Mükemmel Sayı Değildir :(");

    }

}

        /*for (int i = 1 ; i<=a ; i++) {
            System.out.println(i);
            if (a % i == 0);
            System.out.print("böleneri doğrumu: " + );

        }


    }
}



/* while (a > 0){
            if (a % b == 0) ;
            b++;
            sum += b;
            System.out.println("bölenleri: " + b);
            System.out.println("toplamı: " + sum);
        }*/