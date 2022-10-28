/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author Lenovo
 */
public class DoctorDetails extends javax.swing.JPanel {

    /**
     * Creates new form DoctorDetails
     */
    public DoctorDetails() {
        initComponents();
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
        viewButton = new javax.swing.JButton();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton1 = new javax.swing.JRadioButton();
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

        saveButton.setText("Save");

        viewButton.setText("View");

        genderRadioButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderRadioButtonGroup.add(femaleRadioButton1);
        femaleRadioButton1.setText("Female");

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
        doctorHeadingLabel.setText("Doctor Details");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(doctorHeadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(doctorIdLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(communityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(maleRadioButton)
                        .addGap(53, 53, 53)
                        .addComponent(femaleRadioButton1)
                        .addGap(51, 51, 51)
                        .addComponent(otherRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(saveButton)
                        .addGap(39, 39, 39)
                        .addComponent(viewButton)))
                .addContainerGap(401, Short.MAX_VALUE))
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
                    .addComponent(femaleRadioButton1)
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
                    .addComponent(doctorIdLabel)
                    .addComponent(doctorIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(viewButton))
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JRadioButton femaleRadioButton1;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioButtonGroup;
    private javax.swing.JTextField houseInput;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
