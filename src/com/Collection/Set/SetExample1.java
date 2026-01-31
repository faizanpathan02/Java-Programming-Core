package com.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

    public static void main(String[] args) {

    /*      PROPERTIES OF SET
      1. Duplicates are not allowed
      2. Indexes are not maintained
      3. Random access is not possible
      4. Only one NULL value is allowed
      5. NULL is always stored first
     */

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(33);
        set.add(123);
        set.add(153);
        set.add(134);
        set.add(15644);
        set.add(null);

        System.out.println(set);

    }
}
