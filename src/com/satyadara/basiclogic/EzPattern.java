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
}
