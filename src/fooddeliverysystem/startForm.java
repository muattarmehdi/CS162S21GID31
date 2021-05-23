/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Syed Muattar Mehdi Zaidi
 * @author Hussain Shahzad
 */
public class startForm extends javax.swing.JFrame {

    /**
     * Creates new form startForm
     */
    private static startForm instance;
    
    public static startForm getInstance(){
    
        if(instance == null)
        {
            instance= new startForm();
        }
        return instance;
    } 
            
    public void goTo(JPanel p){
        this.setContentPane(p);
        this.repaint();
        this.revalidate();
    }
    
    
    public startForm() {
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

        imageHolder = new javax.swing.JLabel();
        headingPanel = new javax.swing.JPanel();
        headingText = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        SignInButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        Image = new javax.swing.JLabel();

        imageHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstPhotoEdit.jpg"))); // NOI18N
        imageHolder.setMaximumSize(new java.awt.Dimension(1300, 700));
        imageHolder.setMinimumSize(new java.awt.Dimension(1300, 700));
        imageHolder.setPreferredSize(new java.awt.Dimension(1300, 720));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Start Menu");
        setBounds(new java.awt.Rectangle(0, 0, 531, 530));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingPanel.setBackground(new java.awt.Color(153, 255, 153));

        headingText.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        headingText.setText("Want some FOOD the GET IN!!");

        javax.swing.GroupLayout headingPanelLayout = new javax.swing.GroupLayout(headingPanel);
        headingPanel.setLayout(headingPanelLayout);
        headingPanelLayout.setHorizontalGroup(
            headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headingPanelLayout.setVerticalGroup(
            headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(headingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 550, 60));

        welcomePanel.setBackground(new java.awt.Color(153, 255, 153));

        welcomeText.setBackground(new java.awt.Color(0, 0, 0));
        welcomeText.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText.setText("WELCOME");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeText)
                .addGap(41, 41, 41))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(welcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 110, 40));

        SignInButton.setBackground(new java.awt.Color(51, 204, 0));
        SignInButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        SignInButton.setText("I have been here");
        SignInButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignInButtonMouseExited(evt);
            }
        });
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, 350, 40));

        signUpButton.setBackground(new java.awt.Color(102, 255, 102));
        signUpButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        signUpButton.setText("I am NEW here");
        signUpButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButtonMouseExited(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 350, 40));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FirstPhotoEdit.jpg"))); // NOI18N
        getContentPane().add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        // TODO add your handling code here:
            SignIn s=new SignIn();
            this.goTo(s);
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void SignInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseEntered
        // TODO add your handling code here:
        SignInButton.setBackground(Color.BLUE);
    }//GEN-LAST:event_SignInButtonMouseEntered

    private void SignInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseExited
        // TODO add your handling code here:
        SignInButton.setBackground(Color.GREEN);
    }//GEN-LAST:event_SignInButtonMouseExited

    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseEntered
        // TODO add your handling code here:
        signUpButton.setBackground(Color.BLUE);
        
    }//GEN-LAST:event_signUpButtonMouseEntered

    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseExited
        // TODO add your handling code here:
        signUpButton.setBackground(Color.GREEN);
    }//GEN-LAST:event_signUpButtonMouseExited

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        SignUp s=new SignUp();
        this.goTo(s);
    }//GEN-LAST:event_signUpButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(startForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton SignInButton;
    private javax.swing.JPanel headingPanel;
    private javax.swing.JLabel headingText;
    private javax.swing.JLabel imageHolder;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPanel welcomePanel;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
