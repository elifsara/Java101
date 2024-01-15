public class yildizlarlaB {
    public static void main(String[] args) {
        String[][] b = new String[12][6];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (j == 0) {
                    b[i][j] = "*";
                } else if (i == 0 || i == 5 || i == 11) {
                    if (j >= 1 && j <= 3) {
                        b[i][j] = "*";
                    }else b[i][j] = " ";
                } else if (i == 1 || i == 4 || i == 6 || i == 10) {
                    if (j == 4) {
                        b[i][j] = "*";
                    } else {
                        b[i][j] = " ";
                    }
                } else if (j == 5) {
                    b[i][j] = "*";
                } else {
                    b[i][j] = " ";
                }
            }

            for (int k = 0; k < b[i].length; k++) {
                System.out.print(b[i][k]);
            }
            System.out.println();
        }
    }
}
