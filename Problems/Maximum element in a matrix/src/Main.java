import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int iMax = 0;
        int jMax = 0;
        int max = matrix[iMax][jMax];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    iMax = i;
                    jMax = j;
                    max = matrix[i][j];
                }
            }
        }

        System.out.println(iMax + " " + jMax);
    }
}