/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author Subhash
 */
public class EditVitals extends javax.swing.JPanel {

    /**
     * Creates new form EditVitals
     */
    PatientDirectory patientDirectory;
    private JSplitPane SplitPane;
    private Patient SelectedPatient;
    private ArrayList <Encounter> EH;
    private int selectedRowIndex;
    PersonDirectory personDirectory;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    
    public EditVitals(JSplitPane SplitPane,PatientDirectory patientDirectory,PersonDirectory personDirectory,
            Patient SelectedPatient,int selectedRowIndex, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.SplitPane = SplitPane;
        this.SelectedPatient = SelectedPatient;
        this.selectedRowIndex = selectedRowIndex;
        this.personDirectory = personDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorDirectory = doctorDirectory;
        
        for(Patient p: patientDirectory.getPatientDirectory())
         {
             if(p.getPatientId()==SelectedPatient.getPatientId())
             {
             nameInput.setText(p.getName());
             patientIdInput.setText(String.valueOf(p.getPatientId()));
             int x = 0;
             EH = p.getEncounterHistory().getEncounterHistory();
             for(Encounter E : EH)
             {
                 if(x==selectedRowIndex)
                 {
             bpInput.setText(String.valueOf(E.getBloodPressure()));
             pulseInput.setText(String.valueOf(E.getPulse()));
             tempInput.setText(String.valueOf(E.getTemperature()));
             }
             x++;
             }
             }
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editVitalHeading = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        patientIdLabel = new javax.swing.JLabel();
        pulseLabel = new javax.swing.JLabel();
        bpLabel = new javax.swing.JLabel();
        tempLabel = new javax.swing.JLabel();
        patientIdInput = new javax.swing.JTextField();
        pulseInput = new javax.swing.JTextField();
        bpInput = new javax.swing.JTextField();
        tempInput = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        editVitalHeading.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editVitalHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editVitalHeading.setText("Edit Vitals");

        nameLabel.setText("Name:");

        patientIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        patientIdLabel.setText("Patient ID:");

        pulseLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pulseLabel.setText("Pulse:");

        bpLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bpLabel.setText("Blood Pressure:");

        tempLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tempLabel.setText("Temperature:");

        tempInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempInputActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editVitalHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tempLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientIdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pulseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE))
                    .addComponent(nameInput)
                    .addComponent(patientIdInput)
                    .addComponent(pulseInput)
                    .addComponent(bpInput)
                    .addComponent(tempInput))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editVitalHeading)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIdLabel)
                    .addComponent(patientIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseLabel)
                    .addComponent(pulseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpLabel)
                    .addComponent(bpInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempLabel)
                    .addComponent(tempInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(backButton))
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    // only got here if we didn't return false
    return true;
}
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        if(pulseInput.getText().equals("") || !isInteger(pulseInput.getText()))
        {
            JOptionPane.showMessageDialog(this, "Pulse Feild is invalid.");
        }
        else if(tempInput.getText().equals("") || !isInteger(tempInput.getText()))
        {
            JOptionPane.showMessageDialog(this, "Temperature Feild is invalid.");
        }
        else if(bpInput.getText().equals("") || !isInteger(bpInput.getText()))
        {
            JOptionPane.showMessageDialog(this, "Blood pressure Feild is invalid.");
        }
        else
        {
        for(Patient p: patientDirectory.getPatientDirectory())
         {
             if(p.getPatientId()==SelectedPatient.getPatientId())
             {
             p.setName(nameInput.getText());
             int x = 0;
             EH = p.getEncounterHistory().getEncounterHistory();
             for(Encounter E : EH)
             {
                 if(x==selectedRowIndex)
                 {
            E.setBloodPressure(Integer.parseInt(bpInput.getText()));
            E.setPulse(Integer.parseInt(pulseInput.getText()));
            E.setTemperature(Integer.parseInt(tempInput.getText()));
             }
             x++;
             }
             p.setPatientId(Integer.parseInt(patientIdInput.getText()));
             }
         }
        
        JOptionPane.showMessageDialog(this, "Selected Vital was Updated.");
        nameInput.setText("");
        patientIdInput.setText("");
        pulseInput.setText("");
        bpInput.setText("");
        tempInput.setText("");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        ViewPatient viewPatientDetails = new ViewPatient(SplitPane,patientDirectory,personDirectory, hospitalDirectory, doctorDirectory);
        SplitPane.setRightComponent(viewPatientDetails);
    }//GEN-LAST:event_backButtonActionPerformed

    private void tempInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bpInput;
    private javax.swing.JLabel bpLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel editVitalHeading;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField patientIdInput;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JTextField pulseInput;
    private javax.swing.JLabel pulseLabel;
    private javax.swing.JTextField tempInput;
    private javax.swing.JLabel tempLabel;
    // End of variables declaration//GEN-END:variables
}
