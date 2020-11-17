package H.ZeroMatrix;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
public class ZeroMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };
        int[][] nullifiedMatrix = nullifyMatrix(matrix);
        for(int i = 0;i<nullifiedMatrix.length;i++){
            System.out.println();
            for(int j = 0;j<nullifiedMatrix[0].length;j++){
                System.out.print(nullifiedMatrix[i][j]);
            }
        }
    }

    private static int[][] nullifyMatrix(int[][] matrix) {

        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        //store the row and column index with value 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        //nullify rows
        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                nullifyRow(matrix, i);
            }

        }

        //nullify columns
        for (int j = 0; j < column.length; j++) {
            if (column[j]) {
                nullifyColumn(matrix, j);
            }

        }
        return matrix;
    }

    private static void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {

        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }
}
