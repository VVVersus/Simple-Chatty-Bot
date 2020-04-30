import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        String[][] matrix = new String[size][size];
        for (int i = 0; i < size; i++) {
                matrix[i] = scanner.nextLine().split("");
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (matrix[i][j].equalsIgnoreCase(matrix[i][j + 1])
                        && matrix[i][j].equalsIgnoreCase(matrix[i + 1][j])
                        && matrix[i][j].equalsIgnoreCase(matrix[i + 1][j + 1])) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}