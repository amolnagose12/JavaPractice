package com.amol;

public class DemoClone implements  Cloneable{
    int a = 10;
    int b = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        DemoClone t = new DemoClone();
        DemoClone t2 = (DemoClone) t.clone();

        System.out.println(t2.a);
    }
}
