/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DefenseSystemUI;

import defensesystem.Observable;
import defensesystem.Observer;

/**
 *
 * @author Dilshan
 */
public class Submarine extends javax.swing.JFrame implements Observer{
    Mainpage mainPageText;
    /**
     * Creates new form Submarine
     */
    public Submarine() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        oxygenSlider = new javax.swing.JSlider();
        energySlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        NotClearedlabel = new javax.swing.JLabel();
        shootBtn = new javax.swing.JButton();
        sonarBtn = new javax.swing.JButton();
        tomahawkMissileBtn = new javax.swing.JButton();
        tridentMissileBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CheckBoxSoldierCount = new javax.swing.JSpinner();
        CheckBoxAmmoCount = new javax.swing.JSpinner();
        CheckBoxKillCount = new javax.swing.JSpinner();
        positionBtn = new javax.swing.JCheckBox();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageAreaText = new javax.swing.JTextArea();
        MessageSendText = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submarine");
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(null);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        oxygenSlider.setBackground(new java.awt.Color(204, 204, 204));
        oxygenSlider.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        oxygenSlider.setMajorTickSpacing(10);
        oxygenSlider.setMinorTickSpacing(1);
        oxygenSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        oxygenSlider.setPaintLabels(true);
        oxygenSlider.setPaintTicks(true);
        oxygenSlider.setValue(0);
        oxygenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                oxygenSliderStateChanged(evt);
            }
        });

        energySlider.setBackground(new java.awt.Color(204, 204, 204));
        energySlider.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        energySlider.setMajorTickSpacing(10);
        energySlider.setMinorTickSpacing(1);
        energySlider.setOrientation(javax.swing.JSlider.VERTICAL);
        energySlider.setPaintLabels(true);
        energySlider.setPaintTicks(true);
        energySlider.setValue(0);
        energySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                energySliderStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Energy");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Oxygen");

        jLayeredPane1.setLayer(oxygenSlider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(energySlider, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(energySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oxygenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(energySlider, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(oxygenSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(108, 108, 108))
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(530, 10, 150, 350);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NotClearedlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NotClearedlabel.setText("Area Not Cleared");

        shootBtn.setBackground(new java.awt.Color(0, 153, 153));
        shootBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        shootBtn.setText("Shoot");
        shootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootBtnActionPerformed(evt);
            }
        });

        sonarBtn.setBackground(new java.awt.Color(0, 153, 153));
        sonarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sonarBtn.setText("Sonar Operation");
        sonarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonarBtnActionPerformed(evt);
            }
        });

        tomahawkMissileBtn.setBackground(new java.awt.Color(0, 153, 153));
        tomahawkMissileBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tomahawkMissileBtn.setText("Tomahawk Missile");
        tomahawkMissileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomahawkMissileBtnActionPerformed(evt);
            }
        });

        tridentMissileBtn.setBackground(new java.awt.Color(0, 153, 153));
        tridentMissileBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tridentMissileBtn.setText("Trident-2 Missile");
        tridentMissileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tridentMissileBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Soldier Count :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ammo Count  :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Kill Count        :");

        positionBtn.setBackground(new java.awt.Color(204, 204, 204));
        positionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        positionBtn.setText("Position");

        jLayeredPane2.setLayer(NotClearedlabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(shootBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(sonarBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(tomahawkMissileBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(tridentMissileBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(CheckBoxSoldierCount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(CheckBoxAmmoCount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(CheckBoxKillCount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(positionBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sonarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tomahawkMissileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tridentMissileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NotClearedlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(positionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBoxAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBoxSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBoxKillCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(NotClearedlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sonarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tomahawkMissileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tridentMissileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(positionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CheckBoxSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CheckBoxAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CheckBoxKillCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPane2);
        jLayeredPane2.setBounds(10, 10, 510, 170);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Message Area");

        messageAreaText.setColumns(20);
        messageAreaText.setRows(5);
        jScrollPane1.setViewportView(messageAreaText);

        MessageSendText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageSendTextActionPerformed(evt);
            }
        });

        sendBtn.setBackground(new java.awt.Color(0, 153, 153));
        sendBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(MessageSendText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(sendBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane3Layout.createSequentialGroup()
                            .addComponent(MessageSendText, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sendBtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MessageSendText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPane3);
        jLayeredPane3.setBounds(10, 190, 510, 170);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SubmarineIMG.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 710, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tomahawkMissileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomahawkMissileBtnActionPerformed
        messageAreaText.setText(messageAreaText.getText()+"\n"+"Firing Tomahawk Misiile.");
    }//GEN-LAST:event_tomahawkMissileBtnActionPerformed

    private void tridentMissileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tridentMissileBtnActionPerformed
        messageAreaText.setText(messageAreaText.getText()+"\n"+"Firing Trident Misiile.");
    }//GEN-LAST:event_tridentMissileBtnActionPerformed

    private void MessageSendTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessageSendTextActionPerformed
        messageAreaText.setText(messageAreaText.getText()+"\n"+"Firing Tomahawk Misiile.");
    }//GEN-LAST:event_MessageSendTextActionPerformed

    private void shootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootBtnActionPerformed
        messageAreaText.setText(messageAreaText.getText()+"\n"+"Firing Machine Gun.");
    }//GEN-LAST:event_shootBtnActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        String message = MessageSendText.getText();
        Observable.getInstance().setControlerMessage("\nSubmarine : " + message);
    }//GEN-LAST:event_sendBtnActionPerformed

    private void energySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_energySliderStateChanged
        if(energySlider.getValue()<50){ 
            messageAreaText.setText(messageAreaText.getText()+"\n"+"Maintain 20 Knots ");
        }else if(energySlider.getValue()<75){ 
            messageAreaText.setText(messageAreaText.getText()+"\n"+"Maintain 30 Knots ");
        }else if(energySlider.getValue()<100){ 
            messageAreaText.setText(messageAreaText.getText()+"\n"+"Maintain 40 Knots ");
        }else{
            messageAreaText.setText(messageAreaText.getText()+"\n"+"Maintain 50 Knots ");
        }
    }//GEN-LAST:event_energySliderStateChanged

    private void oxygenSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_oxygenSliderStateChanged
        if(oxygenSlider.getValue()<50){ 
            messageAreaText.setText(messageAreaText.getText()+"\n"+"Run oxygern generator at 50% ");
        }else if(oxygenSlider.getValue()<75){ 
            messageAreaText.setText(messageAreaText.getText()+"\n"+"Run oxygern generator at 40% ");
        }else if(oxygenSlider.getValue()<100){ 
            messageAreaText.setText(messageAreaText.getText()+"\n"+"Run oxygern generator at 30% ");
        }else{
            messageAreaText.setText(messageAreaText.getText()+"\n"+"Run oxygern generator at 10% ");
        }
    }//GEN-LAST:event_oxygenSliderStateChanged

    private void sonarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonarBtnActionPerformed
        messageAreaText.setText(messageAreaText.getText()+"\n"+"Firing Sonar Misiile.");
    }//GEN-LAST:event_sonarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submarine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner CheckBoxAmmoCount;
    private javax.swing.JSpinner CheckBoxKillCount;
    private javax.swing.JSpinner CheckBoxSoldierCount;
    private javax.swing.JTextField MessageSendText;
    private javax.swing.JLabel NotClearedlabel;
    private javax.swing.JSlider energySlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageAreaText;
    private javax.swing.JSlider oxygenSlider;
    private javax.swing.JCheckBox positionBtn;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton shootBtn;
    private javax.swing.JButton sonarBtn;
    private javax.swing.JButton tomahawkMissileBtn;
    private javax.swing.JButton tridentMissileBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaStatus(boolean status){
        if(status){
            NotClearedlabel.setText("Area Cleared");
        }else{
            NotClearedlabel.setText("Area Not Cleared");
        }
    }

    @Override
    public void updatePosition(int positionLevel){
        if (positionBtn.isSelected() == true) {
            if (positionLevel > 0) {
                shootBtn.setEnabled(true);
            } else{
                shootBtn.setEnabled(false);
            }
            if (positionLevel > 20) {
                sonarBtn.setEnabled(true);
            } else {
                sonarBtn.setEnabled(false);
            }
            if (positionLevel > 60) {
                tomahawkMissileBtn.setEnabled(true);
            } else {
                tomahawkMissileBtn.setEnabled(false);
            }
            if (positionLevel > 80) {
                tridentMissileBtn.setEnabled(true);
            } else {
                tridentMissileBtn.setEnabled(false);
            }
        } else {
            shootBtn.setEnabled(false);
            sonarBtn.setEnabled(false);
            tomahawkMissileBtn.setEnabled(false);
            tridentMissileBtn.setEnabled(false);
        }
    }

    @Override
    public void updateSendMessage(String message,boolean select){
        if(message != null){   
            if (select == true ) {
                messageAreaText.setText(messageAreaText.getText()+"\n"+"Direct Message : " + message);
            } else if (select == false) {
                messageAreaText.setText(messageAreaText.getText()+message);
            }
        }
    }
    @Override
    public int getAmmoCount(int count){
        return  (int) CheckBoxSoldierCount.getValue();
    }
    
    @Override
    public int getSoldierCount(int count){
        return  (int) CheckBoxSoldierCount.getValue();
    }
    
    @Override
    public int getKillCount(int count){
        return  (int) CheckBoxSoldierCount.getValue();
    }
}
