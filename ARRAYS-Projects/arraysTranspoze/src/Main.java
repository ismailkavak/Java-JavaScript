public class Main {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 7, 4},
                {0, 2, 3}
        };

        int[][] transpose = transpose(matrix);

        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoze:");
        printMatrix(transpose);
    }
}



