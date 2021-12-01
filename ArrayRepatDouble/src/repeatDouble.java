import java.util.Arrays;

public class repeatDouble {
    static boolean isInclude(int [] list, int value){
        for (int i : list) {
            if (i == value){
                return true;
            }
        }

        return  false;
    }
    public static void main(String[] args) {

        int arr[] = {8, 5, 6, 4, 9, 2, 4, 8, 1, 2, 9};
        int [] repeat = new int[arr.length];
        int startIndex = 0;
        for (int i = 0; i<arr.length; i++){

            for (int k = 0; k<arr.length; k++){

                if ((i != k) && (arr[i] == arr[k]) && (arr[i] % 2 == 0)){
                    if (!isInclude(repeat,arr[i])){
                        repeat[startIndex++] = arr[i];
                    }

                    break;

                }
            }
        }

        for (int value : repeat){
            if (value != 0){
                System.out.print(value + " ");
            }
        }

    }
}
