package com.Collection.Map.WorldExample;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WorldController {

    public static void main(String[] args) {

        World world = new World();
        Map<String, Map<String, Map<String, String>>> world1 = world.addCountry();

//        Set<String> keys = world1.keySet();
//        Iterator<String> itr = keys.iterator();
//
//        while (itr.hasNext()) {
//            System.out.println(" ");
//            String key = itr.next();
//            System.out.println("Country Name : " + key);
//
//
//            Map<String, Map<String, String>> country = world1.get(key);
//            Iterator<String> itr2 = country.keySet().iterator();
//
//            while (itr2.hasNext()) {
//                String key2 = itr2.next();
//                System.out.println("State Name : " + key2);
//
//                Map<String, String> state = country.get(key2);
//                Iterator<String> itr3 = state.keySet().iterator();
//
//                while (itr3.hasNext()) {
//                    String key3 = itr3.next();
//                    System.out.println("City Name : " + key3);
//                }
//            }
//        }


        for(String countryKey : world1.keySet()){
            System.out.println();
            System.out.println("Country Name : " + countryKey);

            Map<String , Map<String , String>> country = world1.get(countryKey);
            for(String stateKey : country.keySet()){
                System.out.println("State Name : "+country.get(stateKey));

                Map<String , String> statesKey = country.get(stateKey);
                for (String cityKey : statesKey.keySet()) {
                    System.out.println("City Name : "+statesKey.get(cityKey));
                }
            }
        }


    }
}
