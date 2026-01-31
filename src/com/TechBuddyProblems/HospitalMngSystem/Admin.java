package com.TechBuddyProblems.HospitalMngSystem;

public class Admin {

    public static void main(String[] args) {

        Treatment t1 =  new Treatment();
        Patient p1 =  t1.getPatient();
        System.out.println("\n----------------------Patient Details--------------------");
        System.out.println("\nPatient ID is : " + p1.patientId);
        System.out.println("Patient Name is : " + p1.patientName);
        System.out.println("Patient Mobile Number is : " + p1.patientMobileNumber);
        System.out.println("Patient Address is : " + p1.patientAddress);


        Doctor d1 = t1.getDoctor();
        System.out.println("\n----------------------Doctor Details--------------------");
        System.out.println("\nDoctor ID is : " + d1.doctorId);
        System.out.println("Doctor Name is : " + d1.doctorName);
        System.out.println("Doctor Mobile Number is : " + d1.doctorMobileNumber);
        System.out.println("Doctor Specialization is : " + d1.doctorSpecialization);

        Treatment t2 =  new Treatment();
        Treatment t3 = t2.getTreatment();
        System.out.println("\n----------------------Treatment Details--------------------");
        System.out.println("\nTreatment ID is : " + t3.treatmentId);
        System.out.println("Treatment Date is : " + t3.treatmentDate);
    }
}
