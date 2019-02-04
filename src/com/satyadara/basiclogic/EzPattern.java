package com.satyadara.basiclogic;

class EzPattern {
    String triangle(int n, int i, int j) {
        return j == n ? "" : i < j ? "*" + triangle(n, ++i, j) : i == j ? "*\n" + triangle(n, 0, ++j) : "";
    }
}
