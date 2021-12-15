package com.company;

public class IsSorted {
    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[]{4, 2, 5}));
    }

    public static String isSortedAndHow(int[] array) {
        int caso = 0;
        if (array[1] > array[0]) caso = 0;
        if (array[1] < array[0]) caso = 1;
        for (int i = 1; i < array.length; i++) {
            if (caso == 0) {
                if (array[i] < array[i - 1]) caso = 2;
            }
            if (caso == 1) {
                if (array[i] > array[i - 1]) caso = 2;
            }
        }
        switch (caso) {
            case 0:
                return "yes, ascending";
            case 1:
                return "yes, descending";
            case 2:
                return "no";
        }
        return "";
    }
}
