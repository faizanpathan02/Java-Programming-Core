package com.ReturnType.ClassManagementSystem;

public class StudentAdminClass {

    public static void main(String[] args) {

        StudentDetails sd1 = new StudentDetails();

        Course course = sd1.addCourse();
        System.out.println(course.cid);
        System.out.println(course.cname);
        System.out.println(course.cduration);
        System.out.println(" ");

        Faculty faculty = sd1.addFaculty();
        System.out.println(faculty.fid);
        System.out.println(faculty.fname);
        System.out.println(faculty.fadd);
        System.out.println(" ");

        Batch batch = sd1.addBatch();
        System.out.println(batch.bid);
        System.out.println(batch.bname);
        System.out.println(batch.btime);





    }
}
