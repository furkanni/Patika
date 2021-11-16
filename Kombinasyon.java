import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r, nfak = 1, rfak = 1, neksirfak = 1 ;
        Scanner scn = new Scanner(System.in);
        System.out.print("n değerini Giriniz: ");
        n = scn.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            nfak *= i;
        }    System.out.print("n Faktöriyel = " + nfak);



        System.out.print("\nr Değerini Giriniz: ");
        r = scn.nextInt();
        for (int k=1; k<=r ; k++) {
            rfak *= k;
        } System.out.print("r Faktöriyel = "+ rfak);

        System.out.print("\nn - r = " + (n - r)) ;

        for (int l=1; l<= (n-r) ; l++) {
            neksirfak *= l;
        } System.out.print("\nn-r Faktöriyel = "+ neksirfak);

        System.out.println("\nC(n,r) = " + nfak / (rfak * neksirfak));




    }
}