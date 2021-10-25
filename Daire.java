import java.util.Scanner;
public class Daire {
    public static void main(String[] args){

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //
        //𝜋 sayısını = 3.14 alınız.
        //
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        double r, a, pi = 3.14, alan;

        Scanner area = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz: ");

        r = area.nextDouble();

        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");

        a = area.nextDouble();

        alan = ( pi * (r * r) * a ) / 360 ;

        System.out.print("Daire Diliminin Alanı: "+alan);




    }
}
