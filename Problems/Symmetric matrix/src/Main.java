import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}