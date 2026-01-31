package com.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample3 {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();
        set1.add("Arman");
        set1.add("Digvijay");
        set1.add("Nawazish");
        set1.add("Aman");
        set1.add("Rehan");
        System.out.println(set1);

        System.out.println("--------------------------LINKED HASHSET----------------------------");
        /*
        1. No Duplicates allowed
        2. Insertion Order is followed
         */

        Set<Integer> set2 = new LinkedHashSet<Integer>();
        set2.add(1);
        set2.add(34);
        set2.add(43);
        set2.add(54);
        set2.add(23);
        set2.add(null);
        System.out.println(set2);

        System.out.println("--------------------------TREESET----------------------------");
        /*
        1. No Duplicates allowed
        2. Elements are sorted in ascending order
         */
        Set<Integer> set3 = new TreeSet<Integer>();
        set3.add(1);
        set3.add(34);
        set3.add(43);
        set3.add(54);
        set3.add(23);
//        set3.add(null);
        System.out.println(set3);




    }
}
