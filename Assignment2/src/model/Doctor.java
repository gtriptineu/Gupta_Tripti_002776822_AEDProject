/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Doctor extends Person{
    private int doctorID;
    private String password;
    private ArrayList<PatientDirectory> allPatients = new ArrayList();

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public ArrayList<PatientDirectory> getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(ArrayList<PatientDirectory> allPatients) {
        this.allPatients = allPatients;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
