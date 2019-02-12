package com.satyadara.basiclogic;

class EzPattern {
    String triangle(int n, int i, int j) {
        return (j == n) ? "" : (i < j) ? "*" + triangle(n, ++i, j) : (i == j) ? "*\n" + triangle(n, 0, ++j) : "";
    }

    String pascal(int rows) {
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

    String floyds(int rows) {
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
}
