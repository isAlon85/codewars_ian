package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class SqrDigit {
//    public static void main(String[] args) {
//        System.out.println(squareDigits(0));
//    }

    public static int squareDigits(int n) {
        if (n != 0) {
            LinkedList<Integer> stack = new LinkedList<Integer>();
            while (n > 0) {
                stack.push(n % 10);
                n = n / 10;
            }
            for (int i = 0; i < stack.size(); i++) {
                int sq = stack.get(i);
                sq *= sq;
                stack.set(i, sq);
            }
            String cadena = stack.toString();
            cadena = cadena.replace('[', ' ');
            cadena = cadena.replace(']', ' ');
            cadena = cadena.replace(',', ' ');
            cadena = cadena.replaceAll("\\s+", "");
            int solution = Integer.parseInt(cadena);
            return solution;
        }
        return 0;
    }
}
