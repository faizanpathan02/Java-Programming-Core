package com.Collection.List.UniversityMgtSystem;

import java.util.List;

public class UniversityAdmin {

    public static void main(String[] args) {

        University university = new University();

        List<List<List<String>>> universities = university.addUniversity();

        for (List<List<String>> universityList : universities) {
            System.out.println(universityList);
            for (List<String> universityList1 : universityList) {
                System.out.println(universityList1);
                for (List<String> universityList2 : universityList) {
                    System.out.println(universityList2);
                }
            }
        }


    }
}
