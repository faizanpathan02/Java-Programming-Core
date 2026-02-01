package com.Collection.List.UniversityMgtSystem;

import java.util.ArrayList;
import java.util.List;

public class University {

    public static List<List<List<String>>> addUniversity(){

        List<String> indiraCollegeList = new ArrayList<String>();
        indiraCollegeList.add("Engineering");
        indiraCollegeList.add("MCA");
        indiraCollegeList.add("MBA");

        List<String> jspmCollegeList = new ArrayList<String>();
        jspmCollegeList.add("BSc");
        jspmCollegeList.add("Bcom");
        jspmCollegeList.add("BA");

        List<List<String>> sppu = new ArrayList<List<String>>();
        sppu.add(indiraCollegeList);
        sppu.add(jspmCollegeList);

        List<String> rizviCollegeList = new ArrayList<String>();
        rizviCollegeList.add("UI/UX Design");
        rizviCollegeList.add("Pharmacy");
        rizviCollegeList.add("MBBS");

        List<String> wadiaCollegeList = new ArrayList<String>();
        wadiaCollegeList.add("BUMS");
        wadiaCollegeList.add("BHMS");
        wadiaCollegeList.add("BAMS");

        List<List<String>> mumbaiUniversity = new ArrayList<List<String>>();
        mumbaiUniversity.add(rizviCollegeList);
        mumbaiUniversity.add(jspmCollegeList);

        List<List<List<String>>> maharashtraUniversitiesList = new ArrayList<List<List<String>>>();
        maharashtraUniversitiesList.add(sppu);
        maharashtraUniversitiesList.add(mumbaiUniversity);

        return maharashtraUniversitiesList;
    }
}
