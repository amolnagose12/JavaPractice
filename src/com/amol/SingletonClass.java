package com.amol;

public class SingletonClass {

    static SingletonClass t = null;

    private SingletonClass() {
    }

    public static SingletonClass getObj(){
        if (t ==null)
            t= new SingletonClass();
        return t;
    }
}
