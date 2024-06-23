package com.amol;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put(10,"sachin");
        hm.put(7, "dhoni");
        hm.put(18,"Kohlli");
        hm.put(45,"ronith");

        System.out.println(hm);


        Set s = hm.entrySet();
        System.out.println(s);

        Collection v = hm.values();
        System.out.println(v);

        Set mapData = hm.entrySet();
        Iterator itr = mapData.iterator();

        while (itr.hasNext()){
            Map.Entry data = (Map.Entry) itr.next();
            System.out.println(data.getKey() + "+++++++"  +data.getValue());
//            System.out.println("Map.Entry");
//            System.out.println(itr.next());

        }

    }
}