package com.amol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Amol";


        char[] chars = str.toCharArray();
        List<String> collect = Stream.of(str).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(collect);


//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

        for (int i= chars.length-1;i>=0;i--)
            System.out.println(chars[i]);
    }


}
