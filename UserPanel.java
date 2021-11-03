import java.util.Scanner;
public class UserPanel {
    public static void main(String[] args) {
        String userName, password, newPassword , answer;

        Scanner aa = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = aa.nextLine();

        System.out.print("Şifreniz: ");
        password = aa.nextLine();

        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        // eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip
        // şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

        if (password.equals("fniso")) {
            System.out.println("Giriş Yaptınız!");
        }else {System.out.println ("Hatalı Şifre!\nŞifrenizi sıfırlamak ister misiniz?\nLütfen Evet veya Hayır yazınız.");}
        answer = aa.nextLine();
            if (answer.equals("Evet")) {
                System.out.print("Yeni Şifrenizi Oluşturunuz. (Hatalı Girdiğiniz ve Unuttuğunuz Şifre ile Aynı Olmamalıdır!)" +
                        "\nYeni Şifrenizi Giriniz: ");
                newPassword = aa.nextLine();
                if (newPassword.equals("fniso")) {
                    System.out.print("Şifre Oluşturulamadı, Lütfen Başka bir Şifre Giriniz.\nYeni Şifre: ");
                    newPassword = aa.nextLine();
                    System.out.println("Şifre Oluşturuldu!");
                }else{System.out.println("Şifre Oluşturuldu!");}
            }else {answer.equals("Hayır") ;
                    System.out.println("Giriş Yapılamadı.");}




    }










}

