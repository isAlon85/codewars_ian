package com.company;

import java.util.ArrayList;
import java.util.List;

public class CountSmiley {
    public static void main(String[] args) {
        List<String> a =  new ArrayList<String>();
        a.add(";2)"); a.add(";oD"); a.add(":2X"); a.add(":dD"); a.add("(~p"); a.add(";)"); a.add(";~)"); a.add(";DD"); a.add(":~D"); a.add("52D"); a.add("'~D"); a.add(";)"); a.add(";D"); a.add("4-)"); a.add("'d)"); a.add("px)D"); a.add("od"); a.add("(D"); a.add("8~D"); a.add(":o)"); a.add("'P"); a.add("8)"); a.add("8~)"); a.add(":8X"); a.add(":p"); a.add("(oX"); a.add("')"); a.add("'-)"); a.add("8D"); a.add("'~d)"); a.add(";D"); a.add(":P"); a.add("'X)");
        System.out.println(countSmileys(a));

    }

    public static int countSmileys(List<String> arr) {
       int counter = 0;
       for (String face : arr) {
           if (face.charAt(0) == ':') {
               if (face.charAt(1) == ')' || face.charAt(1) == 'D')
                   if (face.length() == 2) counter++;
               if (face.charAt(1) == '~' || face.charAt(1) == '-') {
                   if (face.charAt(2) == ')' || face.charAt(2) == 'D')
                       if (face.length() == 3) counter++;
               }
           }
           if (face.charAt(0) == ';') {
               if (face.charAt(1) == ')' || face.charAt(1) == 'D')
                   if (face.length() == 2) counter++;
               if (face.charAt(1) == '~' || face.charAt(1) == '-') {
                   if (face.charAt(2) == ')' || face.charAt(2) == 'D')
                       if (face.length() == 3) counter++;
               }
           }
       }
        return counter;
    }
}

