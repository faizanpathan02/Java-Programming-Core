package com.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "faizan");
        map.put(2, "arman");
        map.put(3, "digvijay");
        map.put(4, "nawazish");
        map.put(7, "sahil");

        System.out.println(map);

        Set<Integer> keys = map.keySet();
        Iterator<Integer> itr = keys.iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("--------------for each-------------");
        for (Integer key : keys){
            System.out.println(key + ":" + map.get(key));
        }

    }
}
