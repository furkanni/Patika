import java.util.Arrays;

public class Transpoz {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 3, 4},
                {5, 64, 4},


        };


        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        int b = arr[0].length;
        int trans[][] = new int[b][arr.length];

        for (
                int i = 0;
                i < arr.length; i++) {
            for (int k = 0; k < b; k++) {
                trans[k][i] = arr[i][k];

            }
        }

        System.out.println();

        for (
                int[] row : trans) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
