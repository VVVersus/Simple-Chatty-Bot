import java.util.*;

public class Main {
    static int[] correct;
    static int[][] matrix;
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int size = n * n;
        correct = new int[size];
        for (int i = 0; i < size; i++) {
            correct[i] = i + 1;
        }

        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(checkCols() && checkRows() && checkCubs() ? "YES" : "NO");
    }

    public static boolean  checkCols() {
        int[] arr = new int[n * n];

        for (int j = 0; j < n * n; j++) {
            for (int i = 0; i < n * n; i++) {
                arr[i] = matrix[i][j];
            }
            Arrays.sort(arr);
            if (!Arrays.equals(arr, correct)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRows() {
        int[] arr = new int[n * n];

        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                arr[j] = matrix[i][j];
            }
            Arrays.sort(arr);
            if (!Arrays.equals(arr, correct)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCubs() {
        int[] arr = new int[n * n];

        for (int row = 0; row < n * n; row += n) {
            for (int col = 0; col < n * n; col += n) {
                int index = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        arr[index] = matrix[row + i][col + j];
                        index++;
                    }
                }
                Arrays.sort(arr);
                if (!Arrays.equals(arr, correct)) {
                    return false;
                }
            }
        }
        return true;
    }

}