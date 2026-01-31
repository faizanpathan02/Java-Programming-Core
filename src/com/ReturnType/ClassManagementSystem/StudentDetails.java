package com.ReturnType.ClassManagementSystem;

public class StudentDetails {

    public Course addCourse(){
        Course c = new Course();
        c.cid = 123;
        c.cname = "Java";
        c.cduration = "6 months";
        return c;
    }

    public Faculty addFaculty(){
         Faculty f = new Faculty();
         f.fid = 345;
         f.fname = "Nilesh";
         f.fadd = "PCMC";
         return f;
    }

    public Batch addBatch(){
        Batch b = new Batch();
        b.bid = 234;
        b.bname = "B66";
        b.btime = "Morning";
        return b;
    }
}
