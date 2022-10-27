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
    private boolean abnormal;
    private boolean abnormalBloodPressure;
    private boolean abnormalTemperature;
    private boolean abnormalPulse;
//    EncounterHistory encounterHistory = new EncounterHistory();

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public boolean isAbnormal() {
        return abnormal;
    }

    public void setAbnormal(boolean abnormal) {
        this.abnormal = abnormal;
    }

    public boolean isAbnormalBloodPressure() {
        return abnormalBloodPressure;
    }

    public void setAbnormalBloodPressure(boolean abnormalBloodPressure) {
        this.abnormalBloodPressure = abnormalBloodPressure;
    }

    public boolean isAbnormalTemperature() {
        return abnormalTemperature;
    }

    public void setAbnormalTemperature(boolean abnormalTemperature) {
        this.abnormalTemperature = abnormalTemperature;
    }

    public boolean isAbnormalPulse() {
        return abnormalPulse;
    }

    public void setAbnormalPulse(boolean abnormalPulse) {
        this.abnormalPulse = abnormalPulse;
    }
    
}
