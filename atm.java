import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner scn = new Scanner(System.in);
        int times = 3, balance = 1000, operation;
        while (times > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = scn.nextLine();
            System.out.print("Şifreniz: ");
            password = scn.nextLine();
            if (userName.equals("furkanni") && password.equals("1234")) {
                System.out.println("Giriş Başarılı, Hoşgeldiniz!");
                do {
                    System.out.println("1 - Para Yatırma\n2 - Para Çekme\n3 - Bakiye Sorgulama\n4 - Çıkış");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
                    operation = scn.nextInt();
                    switch (operation) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz: ");
                            int amount = scn.nextInt();
                            balance += amount;
                            System.out.println("İşlem Sonucunda Yeni Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutarı Girinz: ");
                            int amount2 = scn.nextInt();
                            if (amount2 <= balance) {
                                balance -= amount2;
                                System.out.println("İşlem Sonucu Bakiyeniz: " + balance);
                            } else System.out.println("Bakiyeniz Yetersiz!");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (operation != 4);
                if (operation == 4) {
                    System.out.println("Tekrar Görüşmek Üzere!");
                    break;
                }


            } else System.out.println("Yanlış Kullanıcı Adı veya Şifre Girdiniz! Lütfen Tekrar Deneyiniz.");

            times--;
            System.out.println("Kalan Deneme Hakkınız: " + times);
            if (times == 0) {
                System.out.print("Yanlış Girişlerden Dolayı Hesabınız Bloke Edilmiştir. Müşteri Hizmeyleriyle İletişime Geçiniz.");
            }


        }
    }
}
