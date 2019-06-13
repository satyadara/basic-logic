package com.satyadara.basiclogic;

class EzPattern {
    static String triangle(int n, int i, int j) {
        return (j == n) ? "" : (i < j) ? "*" + triangle(n, ++i, j) : (i == j) ? "*\n" + triangle(n, 0, ++j) : "";
    }

    static String pascal(int rows) {
        StringBuilder result = new StringBuilder();
        int val = 1;
        for (int i = 0; i < rows; i++) {
            for (int space = 1; space <= rows - i; space++)
                result.append("--");

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    val = 1;
                else
                    val = val * (i - j + 1) / j;

                result.append(val).append("___");
            }
            result.append("\n");
        }

        return result.toString();
    }

    static String floyds(int rows) {
        StringBuilder result = new StringBuilder();
        int num = 1;

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < i; j++) {
                result.append(num).append(" ");
                num++;
            }
            result.append("\n");
        }
        return result.toString();
    }

    static void _printParenthesis(char str[], int pos, int n, int open, int close) {
        if (close == n) {
            for (int i = 0; i < str.length; i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        } else {
            if (open < n) {
                str[pos] = '{';
                _printParenthesis(str, pos + 1, n, open + 1, close);
            }
            if (open > close) {
                str[pos] = '}';
                _printParenthesis(str, pos + 1, n, open, close + 1);
            }
        }
    }

    static void printParenthesis(char str[], int n) {
        if (n > 0)
            _printParenthesis(str, 0, n, 0, 0);
        return;
    }

    static void rotateMatrix(int N, int mat[][])
    {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++)
        {
            // Consider elements in group of 4 in
            // current square
            for (int y = x; y < N-x-1; y++)
            {
                // store current cell in temp variable
                int temp = mat[x][y];

                // move values from right to top
                mat[x][y] = mat[y][N-1-x];

                // move values from bottom to right
                mat[y][N-1-x] = mat[N-1-x][N-1-y];

                // move values from left to bottom
                mat[N-1-x][N-1-y] = mat[N-1-y][x];

                // assign temp to left
                mat[N-1-y][x] = temp;
            }
        }

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
