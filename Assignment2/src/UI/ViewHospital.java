/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
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
public class ViewHospital extends javax.swing.JPanel {
    HospitalDirectory hospitalDirectory;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    Patient patient;
    JSplitPane splitPanel;

    /**
     * Creates new form ViewHospital
     */
    public ViewHospital(JSplitPane splitPanel, HospitalDirectory hospitalDirectory, Patient patient, PersonDirectory personDirectory,
            DoctorDirectory doctorDirectory,PatientDirectory patientDirectory) {
        initComponents();
        this.splitPanel = splitPanel;
        this.hospitalDirectory = hospitalDirectory;
        this.patient = patient;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
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

        viewHospHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewHospTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        docDetailsButton = new javax.swing.JButton();

        viewHospHeading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewHospHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewHospHeading.setText("View Hospital Details");

        viewHospTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "City", "Community", "Speciality"
            }
        ));
        jScrollPane1.setViewportView(viewHospTable);

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

        docDetailsButton.setText("View Doctor Details");
        docDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docDetailsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)
                                .addGap(482, 482, 482)
                                .addComponent(refreshButton))
                            .addComponent(docDetailsButton))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(viewHospHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(viewHospHeading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(refreshButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(docDetailsButton)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String SearchString = searchInput.getText();
        DefaultTableModel model = (DefaultTableModel) viewHospTable.getModel();
        model.setRowCount(0);

        for(Hospital p: hospitalDirectory.getHospitalDirectory())
        {
            System.out.println(SearchString);
            System.out.println(p.getHospitalName());
            if(p.getHospitalName().equals(SearchString))
            {
                Object[] row = new Object[5];
                row[0]=p;
                row[1]=p.getHospitalId();
                row[2]=p.getCity();
                row[3]=p.getCommunity();
                row[4]=p.getSpeciality();

                model.addRow(row);
                break;
            }
            searchInput.setText("");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void docDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docDetailsButtonActionPerformed
        // TODO add your handling code here:
        if( patient != null){
            int selectedRowIndex = viewHospTable.getSelectedRow();

            if(selectedRowIndex<0)
            {
                JOptionPane.showMessageDialog(this, "Select a row to view Doctor details.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) viewHospTable.getModel();
            int hospitalSelectedIndex = viewHospTable.getSelectedRow();
            Hospital selectedHospital = (Hospital) model.getValueAt(hospitalSelectedIndex, 0);
            ViewDoctor viewDoctor = new ViewDoctor(splitPanel,personDirectory, doctorDirectory,patientDirectory,
                hospitalDirectory,selectedHospital, patient, -1);
            splitPanel.setRightComponent(viewDoctor);
        } else {
            JOptionPane.showMessageDialog(this, "Please go back to View Patient to select patient.");
        }
    }//GEN-LAST:event_docDetailsButtonActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewHospTable.getModel();
        model.setRowCount(0);
         
         for(Hospital p: hospitalDirectory.getHospitalDirectory())
         {
             Object[] row = new Object[5];
             row[0]=p;
             row[1]=p.getHospitalId();
             row[2]=p.getCity();
             row[3]=p.getCommunity();
             row[4]=p.getSpeciality();
             
             model.addRow(row);
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton docDetailsButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel viewHospHeading;
    private javax.swing.JTable viewHospTable;
    // End of variables declaration//GEN-END:variables
}
