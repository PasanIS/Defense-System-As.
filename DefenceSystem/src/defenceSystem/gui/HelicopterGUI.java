/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defenceSystem.gui;

import defenceSystem.model.SuperDefence;
import defenceSystem.model.Observable;
/**
 *
 * @author User
 */
public class HelicopterGUI extends SuperDefence implements Observable {

    public HelicopterGUI() {
        initComponents();
        setVisible(true);
        laserButton.setEnabled(false);
        missileButton.setEnabled(false);
        shootButton.setEnabled(false);
    }
    
    private String msg;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        shootButton = new javax.swing.JButton();
        laserButton = new javax.swing.JButton();
        missileButton = new javax.swing.JButton();
        soldierCountLabel = new javax.swing.JLabel();
        ammoCountLabel = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        helicopterJSlider = new javax.swing.JSlider();
        positionCheckBox = new javax.swing.JCheckBox();
        messageTextField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        viewTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTextEditorPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shootButton.setText("Shoot");
        shootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootButtonActionPerformed(evt);
            }
        });

        laserButton.setText("Laser Operation");
        laserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laserButtonActionPerformed(evt);
            }
        });

        missileButton.setText("Missile Operation");

        soldierCountLabel.setText("Soldier Count");

        ammoCountLabel.setText("Ammo Count");

        helicopterJSlider.setMajorTickSpacing(10);
        helicopterJSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        helicopterJSlider.setPaintLabels(true);
        helicopterJSlider.setPaintTicks(true);
        helicopterJSlider.setSnapToTicks(true);
        helicopterJSlider.setAutoscrolls(true);

        positionCheckBox.setText("Position");

        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        viewTextField.setEditable(false);
        viewTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viewTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTextFieldActionPerformed(evt);
            }
        });

        viewTextEditorPane.setEditable(false);
        jScrollPane2.setViewportView(viewTextEditorPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(laserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(shootButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(missileButton))
                            .addComponent(viewTextField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soldierCountLabel)
                                    .addComponent(ammoCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(positionCheckBox)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendButton)))
                .addGap(18, 18, 18)
                .addComponent(helicopterJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helicopterJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soldierCountLabel)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shootButton)
                            .addComponent(missileButton)
                            .addComponent(ammoCountLabel)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(laserButton)
                            .addComponent(positionCheckBox))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendButton))))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTextFieldActionPerformed

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void laserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laserButtonActionPerformed

    private void shootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shootButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        msg="Helicopter: "+messageTextField.getText();
        main.setMsg(msg);
        messageTextField.setText("");
    }//GEN-LAST:event_sendButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HelicopterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelicopterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelicopterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelicopterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelicopterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammoCountLabel;
    private javax.swing.JSlider helicopterJSlider;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JButton laserButton;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JButton missileButton;
    private javax.swing.JCheckBox positionCheckBox;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton shootButton;
    private javax.swing.JLabel soldierCountLabel;
    private javax.swing.JEditorPane viewTextEditorPane;
    private javax.swing.JTextField viewTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void msg(String msg) {
        viewTextEditorPane.setText(msg);
    }

    @Override
    public void position(int value) {
        if (positionCheckBox.isSelected()) {
            if (positionCheckBox.isSelected()) {
                if (value >= 20) {
                    shootButton.setEnabled(true);
                }
                if (value >= 50) {
                    missileButton.setEnabled(true);
                }
                if (value >= 80) {
                    laserButton.setEnabled(true);
                }
            }

            if (positionCheckBox.isSelected()) {
                if (value <= 20) {
                     shootButton.setEnabled(false);
                }
                if (value <= 50) {
                     missileButton.setEnabled(false);
                }
                if (value <= 80) {
                    laserButton.setEnabled(false);
                }
            }
        } else {
            laserButton.setEnabled(false);
            missileButton.setEnabled(false);
            shootButton.setEnabled(false);
        }
    }

    @Override
    public void clear(boolean res) {
        if (res) {
            viewTextField.setText("Area Cleared");
        } else {
            viewTextField.setText("Area Not Cleared");
        }
    }
    
    
    MainControllerGUI main;
    @Override
    public void setMain(MainControllerGUI main){
        this.main=main;
    }
}
