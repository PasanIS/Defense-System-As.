/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defenceSystem.gui;

import defenceSystem.model.Observable;
/**
 *
 * @author User
 */
public class SubmarineGUI extends javax.swing.JFrame implements Observable {

    /**
     * Creates new form Submarine
     */
    public SubmarineGUI() {
        initComponents();
        setVisible(true);
        tomahawkButton.setEnabled(false);
        sonarButton.setEnabled(false);
        shootButton.setEnabled(false);
        tridentButton.setEnabled(false);
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

        jPanel2 = new javax.swing.JPanel();
        shootButton = new javax.swing.JButton();
        tomahawkButton = new javax.swing.JButton();
        sonarButton = new javax.swing.JButton();
        ammoCountLabel = new javax.swing.JLabel();
        soldierCountLabel = new javax.swing.JLabel();
        positionCheckBox = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        energyLabel = new javax.swing.JLabel();
        energySlider = new javax.swing.JSlider();
        oxygenLabel = new javax.swing.JLabel();
        oxygenSlider = new javax.swing.JSlider();
        viewTextField = new javax.swing.JTextField();
        messageTextField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        tridentButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTextEditorPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shootButton.setText("Shoot");

        tomahawkButton.setText("Tomahawk Missile");

        sonarButton.setText("Sonar Operation");
        sonarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonarButtonActionPerformed(evt);
            }
        });

        ammoCountLabel.setText("Ammo Count");

        soldierCountLabel.setText("Soldier Count");

        positionCheckBox.setText("Psition");
        positionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionCheckBoxActionPerformed(evt);
            }
        });

        energyLabel.setText("Energy");

        energySlider.setMajorTickSpacing(10);
        energySlider.setOrientation(javax.swing.JSlider.VERTICAL);
        energySlider.setPaintLabels(true);
        energySlider.setPaintTicks(true);
        energySlider.setSnapToTicks(true);
        energySlider.setOpaque(true);

        oxygenLabel.setText("Oxygen");

        oxygenSlider.setMajorTickSpacing(10);
        oxygenSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        oxygenSlider.setPaintLabels(true);
        oxygenSlider.setPaintTicks(true);
        oxygenSlider.setSnapToTicks(true);
        oxygenSlider.setOpaque(true);

        viewTextField.setEditable(false);

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

        tridentButton.setText("Trident-2 Missile");
        tridentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tridentButtonActionPerformed(evt);
            }
        });

        viewTextEditorPane.setEditable(false);
        jScrollPane2.setViewportView(viewTextEditorPane);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(shootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(sonarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(soldierCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(ammoCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tomahawkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tridentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(positionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                            .addComponent(sendButton))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(energyLabel)
                    .addComponent(energySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oxygenLabel)
                    .addComponent(oxygenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(energyLabel)
                            .addComponent(oxygenLabel)
                            .addComponent(viewTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(energySlider, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(oxygenSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soldierCountLabel)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ammoCountLabel)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shootButton)
                            .addComponent(sonarButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tomahawkButton)
                            .addComponent(tridentButton)
                            .addComponent(positionCheckBox))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendButton))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
        //msg="Helicopter: "+textMsg.getText();
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void sonarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonarButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        msg="Submarine: "+messageTextField.getText();
        String newLine = System.getProperty("line.separator"); 
        main.setMsg(msg+newLine);
        messageTextField.setText("");
    }//GEN-LAST:event_sendButtonActionPerformed

    private void tridentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tridentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tridentButtonActionPerformed

    private void positionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SubmarineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmarineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmarineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmarineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmarineGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammoCountLabel;
    private javax.swing.JLabel energyLabel;
    private javax.swing.JSlider energySlider;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JLabel oxygenLabel;
    private javax.swing.JSlider oxygenSlider;
    private javax.swing.JCheckBox positionCheckBox;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton shootButton;
    private javax.swing.JLabel soldierCountLabel;
    private javax.swing.JButton sonarButton;
    private javax.swing.JButton tomahawkButton;
    private javax.swing.JButton tridentButton;
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
                    shootButton.setEnabled(true);
                }
                if (value >= 50) {
                    tomahawkButton.setEnabled(true);
                }
                if (value >= 80) {
                    tridentButton.setEnabled(true);
                }
            }

            if (positionCheckBox.isSelected()) {
                if (value <= 20) {
                    shootButton.setEnabled(false);
                    sonarButton.setEnabled(false);
                }
                if (value <= 50) {
                    tomahawkButton.setEnabled(false);
                }
                if (value <= 80) {
                    tridentButton.setEnabled(false);
                }
            }
        } else {
            tomahawkButton.setEnabled(false);
            sonarButton.setEnabled(false);
            shootButton.setEnabled(false);
            tridentButton.setEnabled(false);
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
    //@Override
    public void setMain(MainControllerGUI main){
        this.main=main;
    }
}
