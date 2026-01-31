package com.TechBuddyProblems.HospitalMngSystem;

public class Treatment {

    int treatmentId;
    int treatmentDate;

    public Patient getPatient() {
        Patient patient = new Patient();

        patient.patientId=12;
        patient.patientName="Patient 1";
        patient.patientMobileNumber=12345678904l;
        patient.patientAddress="PCMC";
        return patient;
    }

    public Doctor getDoctor() {
        Doctor doctor = new Doctor();

        doctor.doctorId = 22;
        doctor.doctorName = "Doctor 1";
        doctor.doctorMobileNumber = 2345678901l;
        doctor.doctorSpecialization = "Neurosurgeon";
        return doctor;
    }

    public Treatment getTreatment(){
        Treatment treatment = new Treatment();

        treatment.treatmentId = 32;
        treatment.treatmentDate = 17;
        return treatment;
    }
}
