package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt1(a));
    }

    public static int findIt(int[] a) {
        int odd = 0;
        Arrays.sort(a);
        System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j]) counter++;
            }
            if (counter % 2 != 0) odd = a[i];
        }
        return odd;
    }

    public static int findIt1(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
