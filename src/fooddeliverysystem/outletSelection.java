/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;

/**
 *
 * @author inn
 */
public class outletSelection extends javax.swing.JPanel {

    /**
     * Creates new form outletSelection
     */
    public outletSelection() {
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

        headingLabel = new javax.swing.JLabel();
        subHeadingPanel = new javax.swing.JPanel();
        subheadingLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        restaurentCheck = new javax.swing.JCheckBox();
        groceryCheck = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1300, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        headingLabel.setText("DEAR USER,");
        add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 400, 120));

        subheadingLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        subheadingLabel.setText("Here are the outlets through which you can order!");

        javax.swing.GroupLayout subHeadingPanelLayout = new javax.swing.GroupLayout(subHeadingPanel);
        subHeadingPanel.setLayout(subHeadingPanelLayout);
        subHeadingPanelLayout.setHorizontalGroup(
            subHeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subHeadingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subheadingLabel)
                .addContainerGap())
        );
        subHeadingPanelLayout.setVerticalGroup(
            subHeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subHeadingPanelLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(subheadingLabel))
        );

        add(subHeadingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 550, 50));

        searchField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        searchField.setText("Search");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 572, 50));

        searchButton.setText("Find");
        add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 89, 50));

        restaurentCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        restaurentCheck.setSelected(true);
        restaurentCheck.setText("Restaurants");
        restaurentCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurentCheckActionPerformed(evt);
            }
        });
        add(restaurentCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 140, 70));

        groceryCheck.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        groceryCheck.setText("Grocery Stores");
        add(groceryCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 180, 60));

        jButton1.setText("Restaurant/Grocery");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 160, 70));

        jButton2.setText("Restaurant/Grocery");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 160, 70));

        jButton3.setText("Rate and Review");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        jButton4.setText("Rate and Review");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void restaurentCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurentCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restaurentCheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox groceryCheck;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox restaurentCheck;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel subHeadingPanel;
    private javax.swing.JLabel subheadingLabel;
    // End of variables declaration//GEN-END:variables
}