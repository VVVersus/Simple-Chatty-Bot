class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int[][] matrix = new int[n][n];
         int row = 0;
        int col = 0;
        int direction = 0;
        matrix[row][col] = 1;
        int index = 2;
        while (index <= n * n) {

            switch (direction % 4) {
                case 0:
                    if (col < n - 1 && matrix[row][col + 1] == 0) {
                        col++;
                    } else {
                        direction++;
                        continue;
                    }
                    break;
                case 1:
                    if (row < n - 1 && matrix[row + 1][col] == 0) {
                        row++;
                    } else {
                        direction++;
                        continue;
                    }
                    break;
                case 2:
                    if (col > 0 && matrix[row][col - 1] == 0) {
                        col--;
                    } else {
                        direction++;
                        continue;
                    }
                    break;
                case 3:
                    if (row > 0 && matrix[row - 1][col] == 0) {
                        row--;
                    } else {
                        direction++;
                        continue;
                    }
                    break;
                default:
                    System.out.println("Unsupported direction!");
            }
            matrix[row][col] = index;
            index++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}