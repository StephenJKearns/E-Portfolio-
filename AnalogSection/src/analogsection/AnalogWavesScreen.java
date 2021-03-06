package analogsection;

import java.awt.LayoutManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stephen
 */
public class AnalogWavesScreen extends javax.swing.JPanel {

    /**
     * Creates new form AnalogWavesScreen
     */
    public AnalogWavesScreen() {
        initComponents();
        this.setSize(400,450);
        WhiteLbl.setVisible(true);
        imageChangeLbl.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        anwserLbl = new javax.swing.JLabel();
        WhiteLbl = new javax.swing.JLabel();
        imageChangeLbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        nameLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(0, 102, 255));
        nameLbl.setText("Name:");
        add(nameLbl);
        nameLbl.setBounds(10, 280, 70, 30);

        exitBtn.setBackground(new java.awt.Color(0, 102, 255));
        exitBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(225, 399, 150, 40);

        anwserLbl.setText("Sine wave");
        add(anwserLbl);
        anwserLbl.setBounds(70, 280, 240, 30);

        WhiteLbl.setBackground(new java.awt.Color(255, 255, 255));
        WhiteLbl.setText("jLabel1");
        add(WhiteLbl);
        WhiteLbl.setBounds(60, 60, 280, 160);

        imageChangeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/SquareWave_700.gif"))); // NOI18N
        add(imageChangeLbl);
        imageChangeLbl.setBounds(60, 70, 440, 150);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/DiganosticGUI.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogInfoMainScreen");
        }
    }//GEN-LAST:event_exitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WhiteLbl;
    private javax.swing.JLabel anwserLbl;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel imageChangeLbl;
    private javax.swing.JLabel nameLbl;
    // End of variables declaration//GEN-END:variables
}
