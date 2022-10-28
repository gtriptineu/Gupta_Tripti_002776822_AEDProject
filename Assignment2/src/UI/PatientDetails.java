/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Lenovo
 */
public class PatientDetails extends javax.swing.JPanel {
    PatientDirectory patientDirectory;
    private JSplitPane splitPanel;
    PersonDirectory personDirectory;
    private int selectedRowIndex;
    String initialName;
    int initialAge;
    String initialGender;

    /**
     * Creates new form PatientDetails
     * @param splitPanel
     * @param patientDirectory
     * @param personDirectory
     * @param selectedRowIndex
     */
    public PatientDetails(JSplitPane splitPanel, PatientDirectory patientDirectory, PersonDirectory personDirectory,int selectedRowIndex) {
        initComponents();
        this.splitPanel = splitPanel;
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
        this.selectedRowIndex = selectedRowIndex;
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
        otherRadioButton.setActionCommand("Other");
        int x = 0;
        for(Person p: personDirectory.getPersonDirectory())
        {
            if(x==selectedRowIndex)
            {
            this.initialGender=p.getGender();
            this.initialName=p.getName();
            this.initialAge=p.getAge();
            nameInput.setText(p.getName());
            ageInput.setText(String.valueOf(p.getAge()));
            switch (p.getGender()) {
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
            communityInput.setText(p.getCommunity());
            houseInput.setText(p.getHouse());
            cityInput.setText(p.getCity());
            }
            x++;
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

        genderRadioButtonGroup = new javax.swing.ButtonGroup();
        patientLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        houseLabel = new javax.swing.JLabel();
        communityLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        ageInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        houseInput = new javax.swing.JTextField();
        communityInput = new javax.swing.JTextField();
        otherRadioButton = new javax.swing.JRadioButton();
        cityInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        patientIdLabel = new javax.swing.JLabel();
        patientIdInput = new javax.swing.JTextField();

        patientLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        patientLabel.setText("Patient Details");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderLabel.setText("Gender:");

        houseLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        houseLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        houseLabel.setText("House:");

        communityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        communityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        communityLabel.setText("Community:");

        cityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityLabel.setText("City:");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name:");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageLabel.setText("Age:");

        genderRadioButtonGroup.add(otherRadioButton);
        otherRadioButton.setText("Other");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        genderRadioButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderRadioButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        patientIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        patientIdLabel.setText("Patient ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(patientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(ageLabel)
                                    .addComponent(houseLabel)
                                    .addComponent(cityLabel))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(houseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(communityLabel)
                                    .addComponent(patientIdLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(communityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(maleRadioButton)
                        .addGap(53, 53, 53)
                        .addComponent(femaleRadioButton)
                        .addGap(51, 51, 51)
                        .addComponent(otherRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(saveButton)
                        .addGap(39, 39, 39)
                        .addComponent(viewButton)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(patientLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton)
                    .addComponent(otherRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(houseLabel)
                    .addComponent(houseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cityInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityLabel)
                    .addComponent(communityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIdLabel)
                    .addComponent(patientIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(viewButton))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
       if(nameInput.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Name Feild is empty");
       }
       else if(ageInput.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Age Feild is empty");
       }
       else if(genderRadioButtonGroup.getSelection().getActionCommand().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Gender Feild is empty");
       }
       else if(houseInput.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Residence Feild is empty");
       }
       else if(cityInput.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "City Feild is empty");
       }
       else if(communityInput.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Community Feild is empty");
       }
       else if(patientIdInput.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Patient ID Feild is empty");
       }
       else if(!isInteger(ageInput.getText()))
       {
        JOptionPane.showMessageDialog(this, "Age Entered should be Integer");
       }
       else if(Integer.parseInt(ageInput.getText())>200)
       {
        JOptionPane.showMessageDialog(this, "Age Should not be over 200");
       }
       else if(!isInteger(patientIdInput.getText()))
       {
        JOptionPane.showMessageDialog(this, "Patient ID Entered should be Integer");
       }
       
       else if(!(initialName.equals(nameInput.getText())) || !(initialGender.equals(genderRadioButtonGroup.getSelection().getActionCommand())) || (initialAge!=Integer.parseInt(ageInput.getText())))
       {
           JOptionPane.showMessageDialog(this, "Current values don't match the initial values");
       }
       else
        {
        int t=0;
        for(Patient pt: patientDirectory.getPatientDirectory())
        {
            if(pt.getPatientId()==Integer.parseInt(patientIdInput.getText()))
                t++;
        }
        if(t==0)
        {
        String name = nameInput.getText();
        int age = Integer.parseInt(ageInput.getText());
        String gender = genderRadioButtonGroup.getSelection().getActionCommand();
        String house = houseInput.getText();
        String city = cityInput.getText();
        String community = communityInput.getText();
        int patientId = Integer.parseInt(patientIdInput.getText());
        
        Patient p = patientDirectory.addNewPatient();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        p.setHouse(house);
        p.setCity(city);
        p.setCommunity(community);
        p.setPatientId(patientId);
        
        JOptionPane.showMessageDialog(this, "Patient Details Saved");
        
        nameInput.setText("");
        ageInput.setText("");
        genderRadioButtonGroup.clearSelection();
        houseInput.setText("");
        cityInput.setText("");
        communityInput.setText("");
        patientIdInput.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "This patient ID is already used");
        }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        ViewPatient viewPatientDetails = new ViewPatient(splitPanel,patientDirectory,personDirectory);
        splitPanel.setRightComponent(viewPatientDetails);
    }//GEN-LAST:event_viewButtonActionPerformed


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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageInput;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField cityInput;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField communityInput;
    private javax.swing.JLabel communityLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioButtonGroup;
    private javax.swing.JTextField houseInput;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JTextField patientIdInput;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
