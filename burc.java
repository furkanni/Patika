import java.util.Scanner;

public class burc {
    public static void main(String[] args) {

        int month, day ;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay: ");
        month = input.nextInt();

        if (month >= 1 && month <= 12) {
            month = month;

            System.out.print("Doğduğunuz Gün: ");
            day = input.nextInt();
            if (month == 1 && (day >= 1 && day <= 21)) {
                burc = "Oğlak";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 1 && (day > 21 && day <= 31)) {
                burc = "Kova";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 1 && (day > 31)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 2 && (day >= 1 && day <= 19)) {
                burc = "Kova";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 2 && (day > 19 && day <= 28)) {
                burc = "Balık";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 2 && (day > 28)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 3 && (day >= 1 && day <= 20)) {
                burc = "Balık";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 3 && (day > 20 && day <= 31)) {
                burc = "Koç";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 3 && (day > 31)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 4 && (day >= 1 && day <= 20)) {
                burc = "Koç";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 4 && (day > 20 && day <= 30)) {
                burc = "Boğa";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 4 && (day > 30)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 5 && (day >= 1 && day <= 21)) {
                burc = "Boğa";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 5 && (day > 21 && day <= 31)) {
                burc = "İkizler";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 5 && (day > 31)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 6 && (day >= 1 && day <= 22)) {
                burc = "İkizler";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 6 && (day > 22 && day <= 30)) {
                burc = "Yengeç";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 6 && (day > 30)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 7 && (day >= 1 && day <= 22)) {
                burc = "Yengeç";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 7 && (day > 22 && day <= 31)) {
                burc = "Aslan";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 7 && (day > 31)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 8 && (day >= 1 && day <= 22)) {
                burc = "Aslan";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 8 && (day > 22 && day <= 31)) {
                burc = "Başak";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 8 && (day > 31)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 9 && (day >= 1 && day <= 22)) {
                burc = "Başak";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 9 && (day > 22 && day <= 30)) {
                burc = "Terazi";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 9 && (day > 30)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 10 && (day >= 1 && day <= 22)) {
                burc = "Terazi";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 10 && (day > 22 && day <= 31)) {
                burc = "Akrep";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 10 && (day > 31)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 11 && (day >= 1 && day <= 21)) {
                burc = "Akrep";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 11 && (day > 21 && day <= 30)) {
                burc = "Yay";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 11 && (day > 30)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }
            if (month == 12 && (day >= 1 && day <= 21)) {
                burc = "Yay";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 12 && (day > 21 && day <= 31)) {
                burc = "Oğlak";
                System.out.println("Burcunuz: " + burc);
            } else if (month == 12 && (day > 31)) {
                System.out.println("Geçersiz Bir Gün Girdiniz!");
            }

        } else {
            System.out.println("Geçersiz Bir Değer Girdiniz!");
        }


    }
}
