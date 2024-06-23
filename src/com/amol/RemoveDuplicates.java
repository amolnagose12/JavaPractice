package com.amol;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "amolnagose";
        char[] chars = str.toCharArray();


        //approach 1
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(value ->sb.append((char) value) );
        System.out.println(sb);

        // approach 2

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
            int idx = str.indexOf(c, i+1);
            if (idx==-1){
                sb1.append(c);
            }
        }
        System.out.println(sb1);

        //approach 3
        char[] arr = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            boolean repeat = false;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    repeat=true;
                    break;
                }
            }
            if (!repeat){
                sb2.append(arr[i]);
            }
        }
        System.out.println(sb2);


        //Aproach 4
        Set<Character> set = new LinkedHashSet();
        StringBuilder sb3 = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (Character c : set) {
            System.out.print(c);
        }
    }


}
