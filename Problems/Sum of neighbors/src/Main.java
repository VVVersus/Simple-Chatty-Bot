import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        int n = 0;
        int m = 0;
        String s;
        while (!"end".equalsIgnoreCase(s = scanner.nextLine())) {
            input.append(s + " ");
            m = s.split("\\s+").length;
            n++;
        }

        Scanner scan = new Scanner(input.toString());
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int[][] newMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newMatrix[i][j] = matrix[(i + n - 1) % n][j] + matrix[(i + 1) % n][j] +
                        matrix[i][(j + m - 1) % m] + matrix[i][(j + 1) % m];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}