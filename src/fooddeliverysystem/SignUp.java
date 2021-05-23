/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;

/**
 *
 * @author Syed Muattar Mehdi Zaidi
 * @author Hussain Shahzad
 */
public class SignUp extends javax.swing.JPanel {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        backButton = new javax.swing.JButton();
        headingLabel = new javax.swing.JLabel();
        UsernameInput = new javax.swing.JTextField();
        dateOfBirthInput = new javax.swing.JTextField();
        actorsComboBox = new javax.swing.JComboBox<>();
        passwordInput1 = new javax.swing.JTextField();
        contactNumberInput = new javax.swing.JTextField();
        addressInputArea = new javax.swing.JTextArea();
        signUpButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        creditCardInput = new javax.swing.JTextField();
        imageHolder = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        backButton.setBackground(new java.awt.Color(46, 146, 46));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        setBackground(java.awt.SystemColor.info);
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel.setText("SIGN UP");
        add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 50));

        UsernameInput.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UsernameInput.setText("Username");
        UsernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameInputActionPerformed(evt);
            }
        });
        add(UsernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 320, 30));

        dateOfBirthInput.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dateOfBirthInput.setText("Date Of Birth");
        add(dateOfBirthInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 320, 30));

        actorsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Seller" }));
        actorsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actorsComboBoxActionPerformed(evt);
            }
        });
        add(actorsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 320, 30));

        passwordInput1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passwordInput1.setText("Password");
        add(passwordInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 320, 30));

        contactNumberInput.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contactNumberInput.setText("Contact Number");
        add(contactNumberInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 320, 30));

        addressInputArea.setColumns(20);
        addressInputArea.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addressInputArea.setRows(5);
        addressInputArea.setText("Address");
        add(addressInputArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 320, -1));

        signUpButton.setBackground(new java.awt.Color(0, 102, 0));
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign UP");
        add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 330, -1));

        back.setBackground(new java.awt.Color(0, 102, 0));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 110, -1));

        creditCardInput.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        creditCardInput.setText("Credit Card");
        add(creditCardInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 320, 30));

        imageHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstPhotoEdit.jpg"))); // NOI18N
        add(imageHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 760, 680));

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 70, 680));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Sign up to enjoy exclusive Offers!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 480, 60));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Don't want to Sign up?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 480, 50));

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continue as Guest");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 350, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void UsernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameInputActionPerformed

    private void actorsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actorsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actorsComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        customerMenu cm=new customerMenu();
        startForm.getInstance().goTo(cm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        WelcomePage p=new WelcomePage();
        startForm.getInstance().goTo(p);
       
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UsernameInput;
    private javax.swing.JComboBox<String> actorsComboBox;
    private javax.swing.JTextArea addressInputArea;
    private javax.swing.JButton back;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField contactNumberInput;
    private javax.swing.JTextField creditCardInput;
    private javax.swing.JTextField dateOfBirthInput;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JLabel imageHolder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordInput1;
    private javax.swing.JButton signUpButton;
    // End of variables declaration//GEN-END:variables
}
