package com.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("Arman");
        set.add("Divijay");
        set.add("Nawazish");
        set.add("Aman");
        set.add("Rehan");
        System.out.println(set);

        System.out.println("--------------Iterator--------------");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            String set1 = itr.next();
            System.out.println(set1);
        }

        System.out.println("-----------------For Loop----------------");
        for (String str : set){
            System.out.println(str);
        }
    }
}
