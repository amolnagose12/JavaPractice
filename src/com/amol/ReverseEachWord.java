package com.amol;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "amol nagose";
        String[] split = str.split(" ");

        
        for (String s : split) {
            String reverseWord = "";
            for (int i = s.length(); i >=0; i--) {
                String s1 = reverseWord + s.charAt(i);
                System.out.print(s1);
            }
        }



    }
}
