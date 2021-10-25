import java.util.Scanner;
public class Manav {
    public static void main(String[] args){

        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //
        //Meyveler ve KG Fiyatları
        //
        //    Armut : 2,14 TL
        //    Elma : 3,67 TL
        //    Domates : 1,11 TL
        //    Muz: 0,95 TL
        //    Patlıcan : 5,00 TL

        double arm, elm, dom, muz, pat, total ;

        Scanner abc = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız? : ");

        arm = abc.nextDouble();

        System.out.print("Kaç Kilo Elma Aldınız? : ");

        elm = abc.nextDouble();

        System.out.print("Kaç Kilo Domates Aldınız? : ");

        dom = abc.nextDouble();

        System.out.print("Kaç Kilo Muz Aldınız? : ");

        muz = abc.nextDouble();

        System.out.print("Kaç Kilo Patlıcan Aldınız? : ");

        pat = abc.nextDouble();

        total = (arm * 2.14) + (elm * 3.67) + (dom * 1.11) + (muz * 0.95) + (pat * 5);

        System.out.println("Ödemeniz Gereken Tutar TL: "+total);



    }
}
