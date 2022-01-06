package tasks.t14;

public class PascalsTriangle {

    private static int[][] triangle;
    private static int numberOfRows;

    public static void setNumberOfRows(int rowsNumber) {
        if (rowsNumber < 1) {
            throw new IllegalArgumentException("must be at least 1 row");
        }
        numberOfRows = rowsNumber;
    }

    public static int[][] fillPascalsTriangle(int numberOfRows) {
        triangle = new int[numberOfRows][];
        for (int i = 0; i < numberOfRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }

    public static void printPascalsTriangle() {
        for (int line = 1; line <= numberOfRows; line++) {
            for (int j = 0; j <= numberOfRows - line; j++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(number + " ");
                number = number * (line - i) / i;
            }
            System.out.println();
        }
    }

    public static StringBuilder getRows(int lineNumber) {
        StringBuilder searchLine = new StringBuilder();
        for (int i = 0; i < numberOfRows; i++) {
            if (i == lineNumber - 1) {
                for (int j = 0; j < i + 1; j++) {
                    searchLine.append(triangle[i][j]).append(" ");
                }
            }
        }
        return searchLine;
    }


    public static void main(String[] args) {
        setNumberOfRows(7);
        fillPascalsTriangle(numberOfRows);
        System.out.println("Pascals Triangle with " + numberOfRows + " rows:");
        printPascalsTriangle();
        int searchRow = 4;
        System.out.println("================================");
        System.out.println(searchRow + " row of Pasclas Triangle:");
        StringBuilder row = getRows(searchRow);
        System.out.println(row);
    }
}
