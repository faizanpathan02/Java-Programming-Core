package com.Collection.List.WorldExample;

import java.util.ArrayList;
import java.util.List;

public class World {

    public static List<List<List<String>>> addCountry(){



        List<String> maharashtra = new ArrayList<String>();
        maharashtra.add("Pune");
        maharashtra.add("Jalgaon");
        maharashtra.add("Akola");

        List<String> madhyapradesh = new ArrayList<String>();
        madhyapradesh.add("Bhopal");
        madhyapradesh.add("Indore");
        madhyapradesh.add("Gwalior");

        List<List<String>> India = new ArrayList<List<String>>();
        India.add(maharashtra);
        India.add(madhyapradesh);


        List<String> california = new ArrayList<String>();
        california.add("Texas");
        california.add("Los Angeles");
        california.add("New York");

        List<String> dallas = new ArrayList<String>();
        dallas.add("Washington");
        dallas.add("Chicago");
        dallas.add("New York");

        List<List<String>> USA = new ArrayList<List<String>>();
        USA.add(california);
        USA.add(dallas);

        List<List<List<String>>> world = new ArrayList<List<List<String>>>();
        world.add(India);
        world.add(USA);

        return world;





    }
}
