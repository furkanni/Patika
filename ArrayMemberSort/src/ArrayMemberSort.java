import java.util.Arrays;
import java.util.Scanner;
public class ArrayMemberSort {
    public static void main(String[] args) {
        int arrayLenght;

        Scanner scn = new Scanner(System.in);
        System.out.print("Dizinin Boyutu n : ");
        arrayLenght = scn.nextInt();

        int arr [] = new int[arrayLenght];

        for (int i = 0 ; i<arr.length; i ++){
            System.out.print(i+1 + ". Elemanı Giriniz: ");
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sıralama: ");
        System.out.println(Arrays.toString(arr));



    }
}
