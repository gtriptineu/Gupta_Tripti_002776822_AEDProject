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
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public EncounterHistory() {
        this.encounterHistory = new ArrayList <>();
    }
    
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        encounterHistory.add(newEncounter);
        return newEncounter;
    }
    public void deleteEncounter(Encounter E)
    {
        encounterHistory.remove(E);
    }
}
