import java.util.Arrays;

public class harmonicMean {
    public static void main(String[] args) {
        double harmonicSerie = 0;

        int[] arr = {5, 9, 9, 8, 7, 5, 3, 2, 1, 6};
        //System.out.println(Arrays.toString(arr));
        //System.out.println(arr.length);
        for (double i = 1; i <= arr.length; i++) {
            harmonicSerie += (1 / i);

            //System.out.println(harmonicSerie);

        }

        double harmonicMean = arr.length / harmonicSerie;

        System.out.println("Harmonik Ortalama: " + harmonicMean);


    }
}




  /*  Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

        Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        Harmonik Seri Formülü */