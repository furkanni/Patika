import java.util.Scanner;

public class china {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        year = input.nextInt();

        if (year % 12 == 0) {
            System.out.println("Çin Zodyağınız: Maymun");
        } else if (year % 12 == 1) {
            System.out.println("Çin Zodyağınız: Horoz");
        }else if (year % 12 == 2) {
            System.out.println("Çin Zodyağınız: Köpek");
        }else if (year % 12 == 3) {
            System.out.println("Çin Zodyağınız: Domuz");
        }else if (year % 12 == 4) {
            System.out.println("Çin Zodyağınız: Fare");
        }else if (year % 12 == 5) {
            System.out.println("Çin Zodyağınız: Öküz");
        }else if (year % 12 == 6) {
            System.out.println("Çin Zodyağınız: Kaplan");
        }else if (year % 12 == 7) {
            System.out.println("Çin Zodyağınız: Tavşan");
        }else if (year % 12 == 8) {
            System.out.println("Çin Zodyağınız: Ejderha");
        }else if (year % 12 == 9) {
            System.out.println("Çin Zodyağınız: Yılan");
        }else if (year % 12 == 10) {
            System.out.println("Çin Zodyağınız: At");
        }else if (year % 12 == 11) {
            System.out.println("Çin Zodyağınız: Koyun");
        }
    }
}
