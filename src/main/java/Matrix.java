import java.util.ArrayList;

public class Matrix {
    protected static ArrayList<int[]> rowsWithZero = new ArrayList<>();
    public static void main(String[] args) {
        // create a 2d array
        int[][] two_dimensional_matrix = {
                {8, 2, 3},
                {4, 5, 6, 9},
                {7, 4},
                {3, 8, 0},
                {23},
                {17, 6, 1},
                {0, 7, 1},
        };

        System.out.print("A páros számok mennyisége:\n");
        sumOfEvenNumbers(two_dimensional_matrix);
        System.out.print("A nullát tartalmazó sorok indexe:\n");
        rowsWithZero(two_dimensional_matrix);
    }

    public static long sumOfEvenNumbers(int[][] two_dimensional_matrix) {
        int evennumbers = two_dimensional_matrix[0][0];
        int max_column = 0;
        int row_counter = 0;
        int counter = 0;
        for (int i = 0; i < two_dimensional_matrix.length; ++i) {
            int column_counter = 0;
            row_counter++;
            if (two_dimensional_matrix[i] != null) {
                for (int j = 0; j < two_dimensional_matrix[i].length; ++j) {
                    column_counter++;
                    if (two_dimensional_matrix[i][j] % 2 == 0) {
                        counter = counter + two_dimensional_matrix[i][j];
                    }
                }
            }
        }
        return counter;
    }
    public static ArrayList<int[]> rowsWithZero(int[][] two_dimensional_matrix){
        int max_column = 0;
        int row_counter = 0;
        int a = 2;
        int counter = 0;
        for (int i = 0; i < two_dimensional_matrix.length; ++i) {
            int column_counter = 0;
            row_counter++;
            if (two_dimensional_matrix[i] != null) {
                for (int j = 0; j < two_dimensional_matrix[i].length; ++j) {
                    column_counter++;
                    if (two_dimensional_matrix[i][j] == 0) {
                        rowsWithZero.add(two_dimensional_matrix[i]);
                    }
                }
            }
        }
        return rowsWithZero;
    }
}