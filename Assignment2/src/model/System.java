/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class System extends Community{
    private DoctorDirectory allDoctor;
    private PatientDirectory allPatient;
    private PersonDirectory allPerson;

    public DoctorDirectory getAllDoctor() {
        return allDoctor;
    }

    public void setAllDoctor(DoctorDirectory allDoctor) {
        this.allDoctor = allDoctor;
    }

    public PatientDirectory getAllPatient() {
        return allPatient;
    }

    public void setAllPatient(PatientDirectory allPatient) {
        this.allPatient = allPatient;
    }

    public PersonDirectory getAllPerson() {
        return allPerson;
    }

    public void setAllPerson(PersonDirectory allPerson) {
        this.allPerson = allPerson;
    }
    
    
}
