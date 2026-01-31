package com.Collection.List.WorldExample;

import java.util.List;

public class WorldController {

    public static void main(String[] args) {
        World world = new World();
        List<List<List<String>>> coutries = world.addCountry();
//        System.out.println(coutries);
        System.out.println("\n");
//        for (List<List<String>> countryList : coutries){
//            System.out.println("Coutry :" + countryList);
//            System.out.println("-------------------------------");
//            for (List<String> stateList : countryList){
//                System.out.println("State : " + stateList);
//                System.out.println("-------------------------------");
//                for(String cityList : stateList ){
//                    System.out.println("City :" + cityList);
//                }
//            }
//
//        }
        for (List<List<String>> countryList : coutries) {
            System.out.println("Country:" + countryList);
            for (List<String> stateList : countryList) {
                System.out.println(" State:" + stateList);
                for (String city : stateList) {
                    System.out.println("  City: " + city);
                }
            }
        }

    }


}
