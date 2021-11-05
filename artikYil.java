import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        int yıl;
        Scanner aa = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yıl = aa.nextInt();

        if (yıl % 100 == 0) {
            if (yıl % 400 == 0) {
                System.out.println(yıl + " Bir Artık Yıldır!");
            } else {
                System.out.println(yıl + " Bir Artık Yıl Değildir!");
            }


        } else if (yıl % 4 == 0) {
            System.out.println(yıl + " Bir Artık Yıldır!");
        } else {
            System.out.println(yıl + " Bir Artık Yıl Değildir!");
        }
    }
}