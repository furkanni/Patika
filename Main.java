import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, turk, kim, muz;

        Scanner aa = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = aa.nextInt();
        if (mat > 0 && mat < 100) {
            mat = mat;
        } else {
            mat = 0;
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");
        }

        System.out.print("Fizik Notunuz: ");
        fiz = aa.nextInt();
        if (fiz > 0 && fiz < 100) {
            fiz = fiz;
        } else {
            fiz = 0;
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");
        }

        System.out.print("Türkçe Notunuz: ");
        turk = aa.nextInt();
        if (turk > 0 && turk < 100) {
            turk = turk;
        } else {
            turk = 0;
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");
        }

        System.out.print("Kimya Notunuz: ");
        kim = aa.nextInt();
        if (kim > 0 && kim < 100) {
            kim = kim;
        } else {
            kim = 0;
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");
        }

        System.out.print("Müzik Notunuz: ");
        muz = aa.nextInt();
        if (muz > 0 && muz < 100) {
            muz = muz;
        } else {
            muz = 0;
            System.out.println("Girdiğiniz değer 0 ile 100 arasında olmalı!");
        }


        double average = (mat + fiz + turk + kim + muz) / 5;
        System.out.println("Ortalamanız = " + average);

        if (average >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz!");
        } else {
            System.out.println("Sınıfta Kaldınız!");
        }

    }
}
