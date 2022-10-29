/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.DoctorDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Lenovo
 */
public class ViewPerson extends javax.swing.JPanel {
    private JSplitPane splitPanel;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;

    /**
     * Creates new form ViewPerson
     */
    public ViewPerson(JSplitPane splitPanel,PersonDirectory personDirectory,PatientDirectory patientDirectory, DoctorDirectory doctorDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.splitPanel = splitPanel;
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

        genderRadioButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonTable = new javax.swing.JTable();
        nameInput = new javax.swing.JTextField();
        ageInput = new javax.swing.JTextField();
        houseInput = new javax.swing.JTextField();
        cityInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        communityInput = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        houseLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        communityLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        viewPersonButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        addPatientButton = new javax.swing.JButton();
        addDoctorButton = new javax.swing.JButton();

        viewPersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "House", "City", "Community"
            }
        ));
        jScrollPane1.setViewportView(viewPersonTable);

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name:");

        ageLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageLabel.setText("Age:");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderLabel.setText("Gender:");

        houseLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        houseLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        houseLabel.setText("Residence:");

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityLabel.setText("City:");

        communityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        communityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        communityLabel.setText("Community:");

        genderRadioButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderRadioButtonGroup.add(otherRadioButton);
        otherRadioButton.setText("Other");

        genderRadioButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        viewPersonButton.setText("View");
        viewPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonButtonActionPerformed(evt);
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

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addPatientButton.setText("Add as Patient");
        addPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientButtonActionPerformed(evt);
            }
        });

        addDoctorButton.setText("Add as Doctor");
        addDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(communityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(houseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityInput)
                            .addComponent(ageInput)
                            .addComponent(houseInput)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(maleRadioButton)
                                        .addGap(28, 28, 28)
                                        .addComponent(femaleRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(otherRadioButton)))
                                .addGap(0, 72, Short.MAX_VALUE))
                            .addComponent(nameInput)
                            .addComponent(communityInput))
                        .addGap(237, 237, 237))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addPatientButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addDoctorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewPersonButton)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton)
                            .addComponent(addPatientButton)
                            .addComponent(addDoctorButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewPersonButton)
                            .addComponent(refreshButton)
                            .addComponent(backButton))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton)
                    .addComponent(otherRadioButton)
                    .addComponent(femaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseLabel)
                    .addComponent(houseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityLabel)
                    .addComponent(communityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
        otherRadioButton.setActionCommand("Other");
        String Name = nameInput.getText();
        String Gender = genderRadioButtonGroup.getSelection().getActionCommand();
        String Residence = houseInput.getText();
        String City = cityInput.getText();
        int Age = Integer.parseInt(ageInput.getText());
        String Community = communityInput.getText();
        
        int selectedRowIndex = viewPersonTable.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to view or update it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
        
        model.setValueAt(Name, selectedRowIndex, 0);
        model.setValueAt(Age, selectedRowIndex, 1);
        model.setValueAt(Gender, selectedRowIndex, 2);
        model.setValueAt(Residence, selectedRowIndex, 3);
        model.setValueAt(City, selectedRowIndex, 4);
        model.setValueAt(Community, selectedRowIndex, 5);
        
        int v=0;
        
        for(Person p: personDirectory.getPersonDirectory())
        {
            if(v == selectedRowIndex)
            {
                p.setName(Name);
                p.setAge(Age);
                p.setGender(Gender);
                p.setHouse(Residence);
                p.setCommunity(Community);
                p.setCity(City);
            }
            v++;
        }    
    
    JOptionPane.showMessageDialog(this,"Selected Person Details Updated.");
    
    nameInput.setText("");
    ageInput.setText("");
    genderRadioButtonGroup.clearSelection();
    houseInput.setText("");
    communityInput.setText("");
    cityInput.setText("");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void viewPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewPersonTable.getSelectedRow();

        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a row to view or update it.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);

        nameInput.setText(selectedPerson.getName());
        ageInput.setText(String.valueOf(selectedPerson.getAge()));
        switch (selectedPerson.getGender()) {
            case "Male" -> {
                maleRadioButton.setSelected(true);
            }
            case "Female" -> {
                femaleRadioButton.setSelected(true);
            }
            default -> {
                otherRadioButton.setSelected(true);
            }
        }
        cityInput.setText(selectedPerson.getCity());
        houseInput.setText(selectedPerson.getHouse());
        communityInput.setText(selectedPerson.getCommunity());
    }//GEN-LAST:event_viewPersonButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String SearchString = searchInput.getText();
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
        model.setRowCount(0);

        for(Person p: personDirectory.getPersonDirectory())
        {
            System.out.println(SearchString);
            System.out.println(p.getName());
            if(p.getName().equals(SearchString))
            {
                Object[] row = new Object[6];
                row[0]=p;
                row[1]=p.getAge();
                row[2]=p.getGender();
                row[3]=p.getHouse();
                row[4]=p.getCity();
                row[5]=p.getCommunity();

                model.addRow(row);
                break;
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        PersonDetails personDetails = new PersonDetails(splitPanel,personDirectory,patientDirectory, doctorDirectory);
        splitPanel.setRightComponent(personDetails);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewPersonTable.getSelectedRow();
        PatientDetails addPatientDetails = new PatientDetails(splitPanel,patientDirectory,personDirectory,selectedRowIndex);
        splitPanel.setRightComponent(addPatientDetails);
    }//GEN-LAST:event_addPatientButtonActionPerformed

    private void addDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = viewPersonTable.getSelectedRow();
        DoctorDetails addDoctorDetails = new DoctorDetails(splitPanel,doctorDirectory,personDirectory, selectedRowIndex, patientDirectory);
        splitPanel.setRightComponent(addDoctorDetails);
    }//GEN-LAST:event_addDoctorButtonActionPerformed


     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewPersonTable.getModel();
         model.setRowCount(0);
         
         for(Person p: personDirectory.getPersonDirectory())
         {
             Object[] row = new Object[6];
             row[0]=p;
             row[1]=p.getAge();
             row[2]=p.getGender();
             row[3]=p.getHouse();
             row[4]=p.getCity();
             row[5]=p.getCommunity();
             
             model.addRow(row);
         }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctorButton;
    private javax.swing.JButton addPatientButton;
    private javax.swing.JTextField ageInput;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityInput;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField communityInput;
    private javax.swing.JLabel communityLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioButtonGroup;
    private javax.swing.JTextField houseInput;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewPersonButton;
    private javax.swing.JTable viewPersonTable;
    // End of variables declaration//GEN-END:variables
}
