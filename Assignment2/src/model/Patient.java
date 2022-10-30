/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Patient extends Person {
    private int patientId;
    private boolean appBooked = false;
    EncounterHistory encounterHistory = new EncounterHistory();

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public boolean isAppBooked() {
        return appBooked;
    }

    public void setAppBooked(boolean appBooked) {
        this.appBooked = appBooked;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}
