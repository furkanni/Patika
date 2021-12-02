import java.util.Arrays;

public class ArrayFreqeuency {
    public static void main(String[] args) {
        {
            int[] arr = {5,9,8,2,5,6,8,5,2,9,9,8,2,4,3,3,6,24,98,98,45};
            System.out.println("Dizi: " + Arrays.toString(arr));
            Arrays.sort(arr);
            int counter = 1;
            for (int i = 0; i < arr.length - 1; i++) {
                if ((arr[i] == arr[i + 1])) {
                    counter++;
                    if (i == arr.length - 2) {
                        System.out.println(arr[i] + " sayısı " + counter + " kere tekrar edildi.");
                    }
                } else {
                    System.out.println(arr[i] + " sayısı " + counter + " kere tekrar edildi.");
                    counter = 1;
                    if (i == arr.length - 2) {
                        System.out.println(arr[i + 1] + " sayısı 1 kere tekrar edildi.");
                    }
                }

            }
        }
    }
}

