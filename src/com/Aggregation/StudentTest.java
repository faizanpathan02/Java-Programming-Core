package com.Aggregation;

public class StudentTest {

    public static void main(String[] args) {


        Course course = new Course();
        course.setCid(101);
        course.setCname("Java");

        Faculty faculty = new Faculty();
        faculty.setFid(201);
        faculty.setFname("Nilesh sir");
        faculty.setCourse(course);

        Batch batch = new Batch();
        batch.setBid(301);
        batch.setBname("Morning");
        batch.setFaculty(faculty);

        Student faizan = new Student();
        faizan.setSid(401);
        faizan.setSname("Faizan");
        faizan.setBatch(batch);




        System.out.println("\n-------------------------- STUDENT 1 DETAILS --------------------------");

        System.out.println("\nStudent ID: " + faizan.getSid());
        System.out.println("Student Name: " + faizan.getSname());
        System.out.println("Batch ID : " +  faizan.getBatch().getBid());
        System.out.println("Batch Name : " + faizan.getBatch().getBname());
        System.out.println("Faculty ID : " + faizan.getBatch().getFaculty().getFid());
        System.out.println("Faculty Name : " + faizan.getBatch().getFaculty().getFname());
        System.out.println("Course ID : " + faizan.getBatch().getFaculty().getCourse().getCid());
        System.out.println("Course Name : " + faizan.getBatch().getFaculty().getCourse().getCname());

        System.out.println("\n-------------------------- STUDENT 2 DETAILS --------------------------");

        Student arman =  new Student();
        arman.setSid(402);
        arman.setSname("Arman");
        arman.setBatch(batch);

        System.out.println("\nStudent ID: " + arman.getSid());
        System.out.println("Student Name : "  + arman.getSname());
        System.out.println("Batch ID : " + arman.getBatch().getBid());
        System.out.println("Batch Name : " + arman.getBatch().getBname());
        System.out.println("Faculty ID : " + arman.getBatch().getFaculty().getFid());
        System.out.println("Faculty Name : " + arman.getBatch().getFaculty().getFname());
        System.out.println("Course ID : " + arman.getBatch().getFaculty().getCourse().getCid());
        System.out.println("Course Name : " + arman.getBatch().getFaculty().getCourse().getCname());

    }
}
