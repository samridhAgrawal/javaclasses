package hw;
public class hw {
    public static void main(String[] args) {
        reverse();
        even();
        evenprnt();
    }
    private static void reverse(){

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int r = matrix.length;
        int c = (r == 0) ? 0: matrix[0].length;


        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");

                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    private static void even(){
        System.out.println("Even number count");
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int r = matrix.length;
        int c = (r == 0) ? 0: matrix[0].length;

        int Count = 0;
        for (int i = 0; i < r; i++) {
            // row check
            for (int j = 0; j < c; j++) {
                // column check
                int element = matrix[i][j];
                if (element % 2 == 0) {
                    Count++;
                }
            }
        }
        System.out.println(Count);

    }

    private static void evenprnt(){

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int r = matrix.length;
        int c = (r == 0) ? 0: matrix[0].length;

        System.out.println("Even numbers in the matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int smth = matrix[i][j];
                if (smth % 2 == 0) {
                    System.out.println(matrix[i][j] + " ");
                }
            }
        }
            }
        }


// finish