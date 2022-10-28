/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Lenovo
 */
public class PersonDetails extends javax.swing.JPanel {

    /**
     * Creates new form PersonDetails
     */
    PersonDirectory personDirectory;
    private JSplitPane splitPanel;
    PatientDirectory patientDirectory;
    public PersonDetails(JSplitPane SplitPanel, PersonDirectory personDirectory, PatientDirectory patientDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.splitPanel = SplitPanel;
        this.patientDirectory = patientDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderRadioGroup = new javax.swing.ButtonGroup();
        personLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        houseLabel = new javax.swing.JLabel();
        communityLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        ageInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton1 = new javax.swing.JRadioButton();
        houseInput = new javax.swing.JTextField();
        communityInput = new javax.swing.JTextField();
        cityInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        otherRadioButton = new javax.swing.JRadioButton();

        personLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personLabel.setText("Person Details");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name:");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageLabel.setText("Age:");

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

        genderRadioGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderRadioGroup.add(femaleRadioButton1);
        femaleRadioButton1.setText("Female");

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

        genderRadioGroup.add(otherRadioButton);
        otherRadioButton.setText("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(houseLabel)
                    .addComponent(communityLabel)
                    .addComponent(cityLabel)
                    .addComponent(ageLabel)
                    .addComponent(nameLabel)
                    .addComponent(genderLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(personLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maleRadioButton)
                                .addGap(58, 58, 58)
                                .addComponent(femaleRadioButton1)
                                .addGap(49, 49, 49)
                                .addComponent(otherRadioButton))
                            .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(houseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(communityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addGap(37, 37, 37)
                                .addComponent(viewButton)))))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(personLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLabel)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton1)
                    .addComponent(otherRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseLabel)
                    .addComponent(houseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(communityLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(communityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(viewButton))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(329, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton1.setActionCommand("Female");
        otherRadioButton.setActionCommand("Other");
        if(nameInput.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Name Feild is empty");
       }
       else if(ageInput.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Age Feild is empty");
       }
       else if(genderRadioGroup.getSelection().getActionCommand().equals(""))
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
       else if(!isInteger(ageInput.getText()))
       {
        JOptionPane.showMessageDialog(this, "Age Entered should be Integer");
       }
       else if(Integer.parseInt(ageInput.getText())>200)
       {
        JOptionPane.showMessageDialog(this, "Age Should not be over 200");
       }
       else
       {
        String name = nameInput.getText();
        int age = Integer.parseInt(ageInput.getText());
        String gender = genderRadioGroup.getSelection().getActionCommand();
        String house = houseInput.getText();
        String city = cityInput.getText();
        String community = communityInput.getText();
        
        Person p = personDirectory.addNewPerson();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        p.setHouse(house);
        p.setCity(city);
        p.setCommunity(community);
        
        JOptionPane.showMessageDialog(this, "Person Details Saved");
        
        nameInput.setText("");
        ageInput.setText("");
        genderRadioGroup.clearSelection();
        houseInput.setText("");
        cityInput.setText("");
        communityInput.setText("");
       }
       System.out.println("person directory"+ personDirectory );
    }//GEN-LAST:event_saveButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        ViewPerson viewPersonDetails = new ViewPerson(splitPanel, personDirectory,patientDirectory);
        splitPanel.setRightComponent(viewPersonDetails);
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
    private javax.swing.JRadioButton femaleRadioButton1;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioGroup;
    private javax.swing.JTextField houseInput;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JLabel personLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
