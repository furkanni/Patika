import java.util.Scanner;
public class VucutKitle {
    public static void main(String[] args){

        double boy, kilo, Indeks ;

        Scanner scn = new Scanner(System.in);

        System.out.print("Boyunuzu (Metre Cinsinden) Giriniz: ");

        boy = scn.nextDouble();

        System.out.print("Kilonuzu Giriniz KG: ");

        kilo = scn.nextDouble();

        Indeks = (kilo/(boy*boy));

        System.out.println("Vücut Kitle İndeksiniz: "+Indeks);



    }
}
