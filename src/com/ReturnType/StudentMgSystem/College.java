package com.ReturnType.StudentMgSystem;

public class College {

    public Student addStudent(){

        Student faizan = new Student();
        faizan.rollNo = 123;
        faizan.name = "FAIZAN";
        faizan.address = "PCMC";
        return faizan;
    }

    public Allstudent addAllStudent(){

        Allstudent all = new Allstudent();

        all.Nawazish.rollNo = 55;
        all.Nawazish.name = "NAWAZISH";
        all.Nawazish.address = "Akola";

        all.Digvijay.rollNo = 56;
        all.Digvijay.name = "DIGIJAY";
        all.Digvijay.address = "Dhule";

        all.Arman.rollNo = 57;
        all.Arman.name = "ARMAN";
        all.Arman.address = "Sangli";

        return all;




    }
}
