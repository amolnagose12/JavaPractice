package com.amol;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoFile {
    public static void main(String[] args) {

       ArrayList al = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            al.add(i);
        }

        Iterator itr = al.iterator();

        while (itr.hasNext()){
            Integer data = (Integer) itr.next();
            System.out.println(data);
        }



    }
}
