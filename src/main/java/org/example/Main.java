package org.example;

public class Main {

    public static void main(String[] args) {
        final int N = 4;

     int[][] matrix = {
            { 23, 7, 41, 15 },
            { 38, 12, 29, 4 },
            { 19, 46, 8, 33 },
            { 27, 35, 50, 11},

     };
      System.out.println("Матриця 4х4:");
      for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
              System.out.printf("%5d", matrix[i][j]);
          }
          System.out.println();
      }

      long sumEvenRows = 1, sumOddRows = 1;
      for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
              if (i %2 == 0) sumEvenRows += matrix[i][j];
              else           sumOddRows += matrix[i][j];
          }
      }
      long prodEvenCols = 1, prodOddCols = 1;
      for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
              if(j %2 == 0) prodEvenCols *= matrix[i][j];
              else          prodOddCols *= matrix[i][j];
          }
      }
        System.out.println();
        System.out.println("Сума елементів у парних рядках (0, 2):        " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (1, 3):      " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (0, 2):   " + prodEvenCols);
        System.out.println("Добуток елементів у непарних стовпцях (1, 3): " + prodOddCols);

        System.out.println();
        System.out.println(isMagicSquare(matrix)
                ? "Матриця є магічним квадратом."
                : "Матриця не є магічним квадратом.");

        int[][][][] fourDimArray = {
                {{ {5, 8},   {9, 14} }, { {16, 18}, {20, 24} }
                },
                {{ {28, 29}, {31, 36} }, { {40, 47}, {49, 50} }
                }
        };

       }
       static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;

        int target = 0;
        for (int j = 0; j < n; j++) {
            target += matrix[0][j];
        }
        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[i][j];
            }
            if (rowSum != target || colSum != target) return false;

        }
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][n - 1 - i];
        }
        return diag1 == target && diag2 == target;
       }
    }