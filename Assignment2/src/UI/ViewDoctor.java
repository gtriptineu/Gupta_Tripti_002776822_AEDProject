/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author Lenovo
 */
public class ViewDoctor extends javax.swing.JPanel {
    private JSplitPane splitPanel;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    HospitalDirectory hospitalDirectory;
    Hospital hospital;
    Patient patient;

    /**
     * Creates new form ViewDoctor
     */
    public ViewDoctor(JSplitPane splitPanel, PersonDirectory personDirectory, DoctorDirectory doctorDirectory,
            PatientDirectory patientDirctory, HospitalDirectory hospitalDirectory, Hospital hospital, Patient patient ) {
        initComponents();
        this.personDirectory = personDirectory;
        this.splitPanel = splitPanel;
        this.doctorDirectory = doctorDirectory;
        this.patientDirectory = patientDirctory;
        this.hospitalDirectory = hospitalDirectory;
        this.patient = patient;
        this.hospital = hospital;
        if(hospital != null && patient != null){
            String hospName = hospital.getHospitalName();
            DefaultTableModel model = (DefaultTableModel) viewDoctorTable.getModel();
            model.setRowCount(0);

            for(Doctor p: doctorDirectory.getDoctorDirectory())
            {
                if(p.getHospitalName().equals(hospName))
                {
                    Object[] row = new Object[6];
                    row[0]=p;
                    row[1]=p.getAge();
                    row[2]=p.getGender();
                    row[3]=p.getHospitalName();
                    row[4]=p.getCommunity();
                    row[5]=p.getCity();

                    model.addRow(row);
                    break;
                }
            }
        } else {
            populateTable();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        viewDoctorTable = new javax.swing.JTable();
        doctorHeading = new javax.swing.JLabel();
        viewPatientDetailsButton = new javax.swing.JButton();
        editDoctorDetails = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();

        viewDoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Hospital Name", "Community", "City"
            }
        ));
        jScrollPane1.setViewportView(viewDoctorTable);

        doctorHeading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doctorHeading.setText("Doctor Details");

        viewPatientDetailsButton.setText("View Patient Details");
        viewPatientDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientDetailsButtonActionPerformed(evt);
            }
        });

        editDoctorDetails.setText("Edit Doctor Details");
        editDoctorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDoctorDetailsActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm Appointment");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(doctorHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(confirmButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(viewPatientDetailsButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(editDoctorDetails)
                                    .addGap(3, 3, 3))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(doctorHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton))
                    .addComponent(refreshButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPatientDetailsButton)
                    .addComponent(editDoctorDetails)
                    .addComponent(confirmButton))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewPatientDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientDetailsButtonActionPerformed
        // TODO add your handling code here:
        ViewPatient viewPatientDetails = new ViewPatient(splitPanel,patientDirectory,personDirectory, hospitalDirectory,doctorDirectory);
        splitPanel.setRightComponent(viewPatientDetails);
    }//GEN-LAST:event_viewPatientDetailsButtonActionPerformed

    private void editDoctorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDoctorDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex =viewDoctorTable.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to Edit it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) viewDoctorTable.getModel();
        Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);

        EditDoctor editDoctor = new EditDoctor(splitPanel,doctorDirectory,personDirectory,selectedDoctor.getDoctorID(),
                patientDirectory, hospitalDirectory);
        splitPanel.setRightComponent(editDoctor);
    }//GEN-LAST:event_editDoctorDetailsActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String SearchString = searchInput.getText();
        DefaultTableModel model = (DefaultTableModel) viewDoctorTable.getModel();
        model.setRowCount(0);

        for(Doctor p: doctorDirectory.getDoctorDirectory())
        {
            System.out.println(SearchString);
            System.out.println(p.getName());
            if(p.getName().equals(SearchString))
            {
                Object[] row = new Object[6];
                row[0]=p;
                row[1]=p.getAge();
                row[2]=p.getGender();
                row[3]=p.getHospitalName();
                row[4]=p.getCommunity();
                row[5]=p.getCity();

                model.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewDoctorTable.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to confirm an appointment.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) viewDoctorTable.getModel();
        int doctorSelectedIndex = viewDoctorTable.getSelectedRow();
        Doctor selectedPatient = (Doctor) model.getValueAt(doctorSelectedIndex, 0);
        patient.setAppBooked(true);
        JOptionPane.showConfirmDialog(this, "Booking Confirmed!");

        ViewPatient viewPatient = new ViewPatient(splitPanel,patientDirectory,personDirectory,hospitalDirectory,doctorDirectory);
        splitPanel.setRightComponent(viewPatient);
    }//GEN-LAST:event_confirmButtonActionPerformed


    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewDoctorTable.getModel();
         model.setRowCount(0);
         
         for(Doctor p: doctorDirectory.getDoctorDirectory())
         {
             Object[] row = new Object[6];
             row[0]=p;
             row[1]=p.getAge();
             row[2]=p.getGender();
             row[3]=p.getHospitalName();
             row[4]=p.getCommunity();
             row[5]=p.getCity();
             
             model.addRow(row);
         }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel doctorHeading;
    private javax.swing.JButton editDoctorDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTable viewDoctorTable;
    private javax.swing.JButton viewPatientDetailsButton;
    // End of variables declaration//GEN-END:variables
}
