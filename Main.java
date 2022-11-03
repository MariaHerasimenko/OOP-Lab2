package com.company;

public class Main {


    public static void main(String[] args) {
        char[][] A = new char[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        char[][] B = new char[][]{{10, 11, 12},
                {13, 14, 15},
                {16, 20, 18}};
        int q = B[0].length;
        int n = A.length;
        int m = A[0].length;
        int t = B.length;
        if (n == t && m == q) {
            int[][] C = new int[n][q];

            int s;
            int i;
            for (s = 0; s < n; ++s) {
                for (i = 0; i < q; ++i) {
                    C[s][i] = 0;

                    for (i = 0; i < m; ++i) {
                        C[s][i] += A[s][i] ^ B[i][i];
                    }
                }
            }

            for (s = 0; s < C.length; ++s) {
                for (i = 0; i < C[0].length; ++i) {
                    System.out.print((char) C[s][i] + " ");
                }

                System.out.println(" ");
            }

            for (s = 0; s < C.length; ++s) {
                for (i = 0; i < C[0].length; ++i) {
                    System.out.print(C[s][i] + " ");
                }

                System.out.println();
            }

            s = 0;


            int min;
            int max;
            for (i = 1; i < n; i += 2) {

                max = C[i][0];

                for (min = 0; min < C.length; ++min) {
                    if (C[i][min] > max) {
                        max = C[i][min];
                    }
                }

                s += max;
            }
            int g = 0;

            for (i = 0; i < n; i += 2) {

                min = C[i][0];

                for (int j = 1; j < C.length; ++j) {
                    if (C[i][j] < min) {
                        min = C[i][j];
                    }
                }

                g += min;
            }

            System.out.println("Сума s = " + (s + g));
        } else {
            System.out.println("Неможливо обчислити. Матриці повинні мати однаковий розмір");
        }

    }
}

