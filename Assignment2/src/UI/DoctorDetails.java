/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.Doctor;
import model.DoctorDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Lenovo
 */
public class DoctorDetails extends javax.swing.JPanel {
    
    private JSplitPane splitPanel;
    private PersonDirectory personDirectory;
    private DoctorDirectory doctorDirectory;
    private int selectedRowIndex;
    String initialName;
    int initialAge;
    String initialGender;
    
    /**
     * Creates new form DoctorDetails
     */
    public DoctorDetails( JSplitPane splitPanel, PersonDirectory personDirectoy, DoctorDirectory doctorDirectory, int selectedRowIndex) {
        initComponents();
        this.splitPanel = splitPanel;
        this.personDirectory = personDirectoy;
        this.doctorDirectory = doctorDirectory;
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
        saveButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        doctorIdLabel = new javax.swing.JLabel();
        houseLabel = new javax.swing.JLabel();
        ageInput = new javax.swing.JTextField();
        doctorIdInput = new javax.swing.JTextField();
        communityLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        doctorHeadingLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        houseInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        communityInput = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        otherRadioButton = new javax.swing.JRadioButton();
        cityInput = new javax.swing.JTextField();
        doctorIdLabel1 = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        genderRadioButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderRadioButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderLabel.setText("Gender:");

        doctorIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doctorIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        doctorIdLabel.setText("Doctor ID:");

        houseLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        houseLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        houseLabel.setText("House:");

        communityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        communityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        communityLabel.setText("Community:");

        doctorHeadingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doctorHeadingLabel.setText("Doctor Registration Details");

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

        doctorIdLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doctorIdLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        doctorIdLabel1.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(maleRadioButton)
                        .addGap(53, 53, 53)
                        .addComponent(femaleRadioButton)
                        .addGap(51, 51, 51)
                        .addComponent(otherRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(doctorHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(doctorIdLabel)
                                    .addComponent(doctorIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(communityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(saveButton)
                        .addGap(52, 52, 52)
                        .addComponent(loginButton)))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(doctorHeadingLabel)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityLabel)
                    .addComponent(communityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorIdLabel)
                    .addComponent(doctorIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(doctorIdLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(loginButton))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
        otherRadioButton.setActionCommand("Other");
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
       else if(doctorIdInput.getText().equals(""))
       {
        JOptionPane.showMessageDialog(this, "Doctor ID Feild is empty");
       }
       else if(new String(passwordInput.getPassword()).equals(""))
       {
        JOptionPane.showMessageDialog(this, "Password Feild is empty");
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
       else
        {
        int t=0;
            for(Doctor dt: doctorDirectory.getDoctorDirectory()) {
            if(dt.getDoctorID()==Integer.parseInt(doctorIdInput.getText()))
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
            String password = String.valueOf(passwordInput.getPassword());
            int doctorId = Integer.parseInt(doctorIdInput.getText());
        
            Doctor d = doctorDirectory.addNewDoctor();
            d.setName(name);
            d.setAge(age);
            d.setGender(gender);
            d.setHouse(house);
            d.setCity(city);
            d.setCommunity(community);
            d.setDoctorID(doctorId);
            d.setPassword(password);

            JOptionPane.showMessageDialog(this, "Doctor Details Saved");

            nameInput.setText("");
            ageInput.setText("");
            genderRadioButtonGroup.clearSelection();
            houseInput.setText("");
            cityInput.setText("");
            communityInput.setText("");
            doctorIdInput.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "This Doctor ID is already used");
        }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        DoctorLogin loginDoctor = new DoctorLogin(splitPanel, personDirectory, doctorDirectory);
        splitPanel.setRightComponent(loginDoctor);
    }//GEN-LAST:event_loginButtonActionPerformed


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
    private javax.swing.JLabel doctorHeadingLabel;
    private javax.swing.JTextField doctorIdInput;
    private javax.swing.JLabel doctorIdLabel;
    private javax.swing.JLabel doctorIdLabel1;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioButtonGroup;
    private javax.swing.JTextField houseInput;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
