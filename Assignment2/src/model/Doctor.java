/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Doctor extends Person{
    private int doctorID;
    private PatientDirectory allPatients;

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public PatientDirectory getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(PatientDirectory allPatients) {
        this.allPatients = allPatients;
    }
    
}
