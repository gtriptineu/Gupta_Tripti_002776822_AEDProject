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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDirectory;

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        doctorDirectory.add(newDoctor);
        return newDoctor;
    }
    public void deleteDoctor(Doctor newDoctor){
        doctorDirectory.remove(newDoctor);
    }
    
}