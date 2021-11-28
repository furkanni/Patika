import java.util.Scanner;

public class palindromSayi {
    static boolean furkan(int number) {
        int tempnum = number, lastdigit, reversenum = 0;
        while (tempnum != 0) {
            lastdigit = tempnum % 10;
            //System.out.println("son basamak " + lastdigit);
            reversenum = reversenum * 10 + lastdigit;
            //System.out.println("ters sayı: " + reversenum);
            tempnum = tempnum / 10;
            //System.out.println("tempnum son değeri : " + tempnum);


        }
        if (number == reversenum)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int a = scn.nextInt();
        System.out.println(furkan(a));

    }
}
