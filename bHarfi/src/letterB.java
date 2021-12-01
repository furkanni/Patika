import java.util.Arrays;

public class letterB {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int k = 0; k < letter[i].length; k++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][k] = " * ";
                } else if (k == 0 || k == 3) {
                    letter[i][k] = " * ";
                } else letter[i][k] = "   ";
            }
        }
        System.out.print(letter[0][3] = " ");
        System.out.print(letter[3][3] = " ");
        System.out.println(letter[6][3] = " ");
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);

            }

            System.out.println();
        }
    }
}

