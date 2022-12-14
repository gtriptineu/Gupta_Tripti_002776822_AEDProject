/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.Doctor;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author Lenovo
 */
public class EditDoctor extends javax.swing.JPanel {
    
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    private JSplitPane splitPanel;
    private int doctorID;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    String initialName;
    String initialGender;
    int initialDoctorId;
    int initialAge;

    /**
     * Creates new form EditPatient
     */
    public EditDoctor(JSplitPane splitPanel,DoctorDirectory doctorDirectory,PersonDirectory personDirectory,int doctorID, PatientDirectory patientDirectory, HospitalDirectory hospitalDirectory) {
        initComponents();
        this.doctorDirectory = doctorDirectory;
        this.splitPanel = splitPanel;
        this.doctorID = doctorID;
        this.personDirectory = personDirectory;
        this.patientDirectory=patientDirectory;
        this.hospitalDirectory = hospitalDirectory;
        
        for(Doctor p: doctorDirectory.getDoctorDirectory())
         {
             if(p.getDoctorID()==doctorID)
             {
             this.initialName = p.getName();
             this.initialAge = p.getAge();
             this.initialGender = p.getGender();
             this.initialDoctorId = p.getDoctorID();
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
             hospitalInput.setText(p.getHospitalName());
             houseInput.setText(p.getHouse());
             cityInput.setText(p.getCity());
             communityInput.setText(p.getCommunity());
             doctorIdInput.setText(String.valueOf(p.getDoctorID()));
             passwordInput.setText(p.getPassword());
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

        genderRadioButtonGroup = new javax.swing.ButtonGroup();
        editButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        doctorLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        nameLabel = new javax.swing.JLabel();
        femaleRadioButton = new javax.swing.JRadioButton();
        ageLabel = new javax.swing.JLabel();
        doctorIdLabel = new javax.swing.JLabel();
        ageInput = new javax.swing.JTextField();
        doctorIdInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        houseInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        communityInput = new javax.swing.JTextField();
        hospitalLabel = new javax.swing.JLabel();
        otherRadioButton = new javax.swing.JRadioButton();
        hospitalInput = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        cityInput = new javax.swing.JTextField();
        houseLabel = new javax.swing.JLabel();
        communityLabel = new javax.swing.JLabel();

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

        doctorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doctorLabel.setText("Doctor Details");

        cityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityLabel.setText("City:");

        genderRadioButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("Name:");

        genderRadioButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageLabel.setText("Age:");

        doctorIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doctorIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        doctorIdLabel.setText("Doctor ID:");

        doctorIdInput.setEditable(false);

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordLabel.setText("Password:");

        passwordInput.setEditable(false);

        hospitalLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hospitalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hospitalLabel.setText("Hospital Name:");

        genderRadioButtonGroup.add(otherRadioButton);
        otherRadioButton.setText("Other");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderLabel.setText("Gender:");

        houseLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        houseLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        houseLabel.setText("House:");

        communityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        communityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        communityLabel.setText("Community:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(doctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(houseInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLabel)
                                        .addComponent(ageLabel)
                                        .addComponent(houseLabel)
                                        .addComponent(cityLabel))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(69, 69, 69)
                                            .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(maleRadioButton)
                                                    .addGap(53, 53, 53)
                                                    .addComponent(femaleRadioButton)
                                                    .addGap(51, 51, 51)
                                                    .addComponent(otherRadioButton))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nameInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ageInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(communityLabel)
                                    .addComponent(doctorIdLabel)
                                    .addComponent(passwordLabel)
                                    .addComponent(hospitalLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editButton)
                                        .addGap(70, 70, 70)
                                        .addComponent(backButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(doctorIdInput)
                                        .addComponent(communityInput)
                                        .addComponent(passwordInput)
                                        .addComponent(hospitalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(488, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(doctorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(hospitalLabel)
                    .addComponent(hospitalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorIdLabel)
                    .addComponent(doctorIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(backButton))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
        otherRadioButton.setActionCommand("Other");
        if(nameInput.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Name Field is empty");
        }
        else if(ageInput.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Age Field is empty");
        }
        else if(genderRadioButtonGroup.getSelection().getActionCommand().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Age Field is empty");
        }
        else if(hospitalInput.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Hospital Field is empty");
        }
        else if(passwordInput.getPassword().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Password Field is empty");
        }
        else if(houseInput.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Residence Field is empty");
        }
        else if(cityInput.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "City Field is empty");
        }
        else if(communityInput.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Community Field is empty");
        }
        else if(doctorIdInput.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Doctor ID Field is empty");
        }
        else if(!isInteger(ageInput.getText()))
        {
            JOptionPane.showMessageDialog(this, "Age Entered should be Integer");
        }
        else if(Integer.parseInt(ageInput.getText())>200)
        {
            JOptionPane.showMessageDialog(this, "Age Should not be over 200");
        }
        else if(!isInteger(doctorIdInput.getText()))
        {
            JOptionPane.showMessageDialog(this, "Doctor ID Entered should be Integer");
        }

        else if(!(initialName.equals(nameInput.getText())) ||
                !(initialGender.equals(genderRadioButtonGroup.getSelection().getActionCommand())) ||
                (doctorID!=Integer.parseInt(doctorIdInput.getText())))
        {
            JOptionPane.showMessageDialog(this, "Current values don't match the initial values");
        }
        else
        {
            for(Doctor p: doctorDirectory.getDoctorDirectory()) {
                System.out.println("before if");
                    if(p.getDoctorID()==doctorID) {
                        System.out.println("in if");
                        doctorDirectory.deleteDoctor(p);
                    }
                System.out.println("after if");
            }
            int t=0;
            for(Doctor pt: doctorDirectory.getDoctorDirectory())
            {
                if(pt.getDoctorID()==Integer.parseInt(doctorIdInput.getText()))
                t++;
                System.out.println("in 2nd for");
            }
            if(t==0)
            {
                System.out.println("in 2nd if");
                String name = nameInput.getText();
                int age = Integer.parseInt(ageInput.getText());
                String gender = genderRadioButtonGroup.getSelection().getActionCommand();
                System.out.println("gender"+ gender);
                String house = houseInput.getText();
                String city = cityInput.getText();
                String community = communityInput.getText();
                int doctorId = Integer.parseInt(doctorIdInput.getText());
                String hospName = hospitalInput.getText();
                String pass = String.valueOf(passwordInput.getPassword());

                Doctor p = doctorDirectory.addNewDoctor();
                p.setName(name);
                p.setAge(age);
                p.setGender(gender);
                p.setHouse(house);
                p.setCity(city);
                p.setCommunity(community);
                p.setDoctorID(doctorId);
                p.setHospitalName(hospName);
                p.setPassword(pass);
                
                JOptionPane.showMessageDialog(this, "Doctor Details Saved");

                nameInput.setText("");
                ageInput.setText("");
                genderRadioButtonGroup.clearSelection();
                houseInput.setText("");
                cityInput.setText("");
                communityInput.setText("");
                doctorIdInput.setText("");
                passwordInput.setText("");
                hospitalInput.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "This doctor ID is already used");
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        ViewDoctor viewPatientDetails = new ViewDoctor(splitPanel,personDirectory,doctorDirectory,patientDirectory, hospitalDirectory, null, null, -1);
        splitPanel.setRightComponent(viewPatientDetails);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

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
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityInput;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField communityInput;
    private javax.swing.JLabel communityLabel;
    private javax.swing.JTextField doctorIdInput;
    private javax.swing.JLabel doctorIdLabel;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioButtonGroup;
    private javax.swing.JTextField hospitalInput;
    private javax.swing.JLabel hospitalLabel;
    private javax.swing.JTextField houseInput;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
