import java.util.Arrays;
import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int numb = scn.nextInt();
        int i = 0;

        int arr[] = {2, 8, 6, 75, 89, -6, 1, -43};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("====================");


        while (arr[i] <= numb) {
            i++;

        }

        System.out.println("Değere en yakın küçük sayı: " + arr[i - 1]);
        System.out.println("Değere en yakın büyük sayı: " + arr[i]);


    }
}


