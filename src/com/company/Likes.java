package com.company;

import java.util.Arrays;

public class Likes {
//    public static void main(String[] args) {
//        System.out.println(commentLikes("Pepa", "Peter", "Peter", "Peter", "Peter"));
//    }

    public static String commentLikes(String... names) {
        if (Arrays.stream(names).count() == 0) {
            return "no one likes this";
        } else if (Arrays.stream(names).count() == 1) {
            return names[0] + " likes this";
        } else if (Arrays.stream(names).count() == 2) {
            return names[0] + " and " + names[1] + " like this";
        }else if (Arrays.stream(names).count() == 3) {
            return names[0] + ", " + names[1] + " and "+ names [2] + " like this";
        }else {
            int others = (int) (Arrays.stream(names).count() - 2);
            return names[0] + ", " + names[1] + " and "+ others + " others like this";
        }
    }
}