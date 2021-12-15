package com.company;

import java.util.Arrays;

public class StrEnd {
//    public static void main(String[] args) {
//        String cadena1 = "paralelepipedo";
//        String cadena2 = "iped";
//        System.out.println(solution(cadena1, cadena2));
//    }

    public static boolean solution(String str, String ending) {
        int delta = str.length() - ending.length();
        String newStr = str.substring(delta);
        if (newStr.equals(ending)) return true;
            else return false;
    }
}
