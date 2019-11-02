package com.jt.classtest;

import com.jt.classtest.Dictionary;

public class Bookmanager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","free",90,3);
        System.out.println(dictionary.getPingyinPages());

    }
}
