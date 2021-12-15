package com.company;

public class PerfSqr {
    public static void main(String[] args) {
        System.out.println(findNextSquare(145));
    }

    public static long findNextSquare(long sq) {
        if (sq > 1) {
            long root = (long) Math.sqrt(sq);
            if (root * root == sq) return (root + 1) * (root + 1);
        }
        return -1;
    }
}