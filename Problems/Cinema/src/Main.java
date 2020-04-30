import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] cinema = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m - k; j++) {
                int sum = 0;
                for (int a = 0; a < k; a++) {
                    sum += cinema[i][j + a];
                }
                if (sum == 0) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}