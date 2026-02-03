package com.Collection.Map.WorldExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class World {

    public static Map<String, Map<String, Map<String, String>>> addCountry() {

        Map<String, String> maharashtra = new LinkedHashMap<String, String>();
        maharashtra.put("PUNE", "Pune");
        maharashtra.put("MUMBAI", "Mumbai");
        maharashtra.put("NAGPUR", "Nagpur");

        Map<String, String> gujarat = new LinkedHashMap<String, String>();
        gujarat.put("SURAT", "Surat");
        gujarat.put("VAPI", "Vapi");
        gujarat.put("AHMADABAD", "Ahmadabad");

        Map<String, Map<String, String>> india = new LinkedHashMap<String, Map<String, String>>();
        india.put("MAH", maharashtra);
        india.put("GUJ", gujarat);

        Map<String, String> california = new LinkedHashMap<String, String>();
        california.put("LAS VEGAS", "Las Vegas");
        california.put("LOS ANGELES", "Los Angeles");
        california.put("DALLAS", "Dallas");

        Map<String, String> newyork = new LinkedHashMap<String, String>();
        newyork.put("WASHINGTON", "Washington");
        newyork.put("NEWJERSEY", "New Jersey");
        newyork.put("TEXAS", "Texas");

        Map<String, Map<String, String>> usa = new LinkedHashMap<String, Map<String, String>>();
        usa.put("CAL", california);
        usa.put("NY", newyork);

        Map<String, Map<String, Map<String, String>>> world = new LinkedHashMap<String, Map<String, Map<String, String>>>();
        world.put("INDIA",india);
        world.put("USA",usa);

        return world;



    }

    }

