/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author Lenovo
 */
public class ViewPatient extends javax.swing.JPanel {
    PatientDirectory patientDirectory;
    private JSplitPane splitPanel;
    PersonDirectory personDirectory;

    /**
     * Creates new form ViewPatient
     */
    public ViewPatient(JSplitPane splitPanel,PatientDirectory patientDirectory, PersonDirectory personDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.splitPanel = splitPanel;
        this.personDirectory = personDirectory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewPatientDetailsTable = new javax.swing.JTable();
        viewVitalsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        EditPatientButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        addVitalsButton = new javax.swing.JButton();
        editVitalsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewVitalsTable = new javax.swing.JTable();

        viewPatientDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "House", "City", "Community", "Patient ID"
            }
        ));
        jScrollPane1.setViewportView(viewPatientDetailsTable);

        viewVitalsButton.setText("View Vitals");
        viewVitalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalsButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        EditPatientButton.setText("Edit Patient");
        EditPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPatientButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        addVitalsButton.setText("Add Vitals");
        addVitalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVitalsButtonActionPerformed(evt);
            }
        });

        editVitalsButton.setText("Edit Vitals");
        editVitalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVitalsButtonActionPerformed(evt);
            }
        });

        viewVitalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Pulse", "Blood Pressure", "Temperature", "Time Registered"
            }
        ));
        jScrollPane2.setViewportView(viewVitalsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addComponent(viewVitalsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addVitalsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditPatientButton)
                        .addGap(10, 10, 10))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editVitalsButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton)
                            .addComponent(refreshButton)
                            .addComponent(backButton)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditPatientButton)
                        .addComponent(addVitalsButton)
                        .addComponent(viewVitalsButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(editVitalsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewVitalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalsButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewPatientDetailsTable.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a patient to view Vital Signs.");
            return;
        }

        DefaultTableModel modelpat = (DefaultTableModel) viewPatientDetailsTable.getModel();
        Patient selectedPatient = (Patient) modelpat.getValueAt(selectedRowIndex, 0);
        int PatientID = selectedPatient.getPatientId();

        DefaultTableModel model = (DefaultTableModel) viewVitalsTable.getModel();
        model.setRowCount(0);

        for(Patient p: patientDirectory.getPatientDirectory())
        {
            if(p.getPatientId()==PatientID)
            {
                Object[] row = new Object[6];
                for(Encounter e: p.getEncounterHistory().getEncounterHistory())
                {
                    row[0]=p;
                    row[1]=p.getPatientId();
                    row[2]=e.getPulse();
                    row[3]=e.getBloodPressure();
                    row[4]=e.getTemperature();
                    row[5]=e.getUpdateTime();

                    model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_viewVitalsButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        PatientDetails addPatientDetails = new PatientDetails(splitPanel,patientDirectory,personDirectory,-1);
        splitPanel.setRightComponent(addPatientDetails);
    }//GEN-LAST:event_backButtonActionPerformed

    private void EditPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPatientButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewPatientDetailsTable.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to Edit it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) viewPatientDetailsTable.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);

        EditPatient editPatient = new EditPatient(splitPanel,patientDirectory,personDirectory,selectedPatient.getPatientId());
        splitPanel.setRightComponent(editPatient);
    }//GEN-LAST:event_EditPatientButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String SearchString = searchInput.getText();
        DefaultTableModel model = (DefaultTableModel) viewPatientDetailsTable.getModel();
        model.setRowCount(0);

        for(Patient p: patientDirectory.getPatientDirectory())
        {
            System.out.println(SearchString);
            System.out.println(p.getName());
            if(p.getName().equals(SearchString))
            {
                Object[] row = new Object[7];
                row[0]=p;
                row[1]=p.getAge();
                row[2]=p.getGender();
                row[3]=p.getHouse();
                row[4]=p.getCity();
                row[5]=p.getCommunity();
                row[6]=p.getHouse();

                model.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addVitalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVitalsButtonActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = viewPatientDetailsTable.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to add Vital Sign.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) viewPatientDetailsTable.getModel();
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);
        int PatientID = selectedPatient.getPatientId();

        AddVitalSigns addVitalSigns = new AddVitalSigns(splitPanel,patientDirectory,personDirectory,PatientID);
        splitPanel.setRightComponent(addVitalSigns);
    }//GEN-LAST:event_addVitalsButtonActionPerformed

    private void editVitalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVitalsButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewVitalsTable.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to Edit it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) viewPatientDetailsTable.getModel();
        int patientSelectedIndex = viewPatientDetailsTable.getSelectedRow();
        Patient selectedPatient = (Patient) model.getValueAt(patientSelectedIndex, 0);

        EditVitals editVitals = new EditVitals(splitPanel,patientDirectory,personDirectory,selectedPatient,selectedRowIndex);
        splitPanel.setRightComponent(editVitals);
    }//GEN-LAST:event_editVitalsButtonActionPerformed


     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewPatientDetailsTable.getModel();
        model.setRowCount(0);
        
        DefaultTableModel modelvital = (DefaultTableModel) viewVitalsTable.getModel();
        modelvital.setRowCount(0);
         
         for(Patient p: patientDirectory.getPatientDirectory())
         {
             Object[] row = new Object[7];
             row[0]=p;
             row[1]=p.getAge();
             row[2]=p.getGender();
             row[3]=p.getHouse();
             row[4]=p.getCity();
             row[5]=p.getCommunity();
             row[6]=p.getPatientId();
             
             model.addRow(row);
         }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditPatientButton;
    private javax.swing.JButton addVitalsButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton editVitalsButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTable viewPatientDetailsTable;
    private javax.swing.JButton viewVitalsButton;
    private javax.swing.JTable viewVitalsTable;
    // End of variables declaration//GEN-END:variables
}
