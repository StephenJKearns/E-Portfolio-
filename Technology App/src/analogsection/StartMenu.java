/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.LayoutManager;

/**
 *
 * @author Stephen 
 */
public class StartMenu extends javax.swing.JPanel {

    /**
     * Creates new form MainMenuGUI
     */
    public StartMenu() {
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

        startbtn = new javax.swing.JButton();
        Startlbl = new javax.swing.JLabel();
        welcomelbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 450));
        setMinimumSize(new java.awt.Dimension(400, 450));
        setLayout(null);

        startbtn.setOpaque(false);
        startbtn .setContentAreaFilled(false);
        startbtn .setBorderPainted(false);
        startbtn.setMaximumSize(new java.awt.Dimension(400, 450));
        startbtn.setMinimumSize(new java.awt.Dimension(400, 450));
        startbtn.setPreferredSize(new java.awt.Dimension(400, 450));
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });
        add(startbtn);
        startbtn.setBounds(0, 0, 400, 450);

        Startlbl.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        Startlbl.setForeground(new java.awt.Color(255, 255, 255));
        Startlbl.setText("Click Anywhere on the screen to begin");
        add(Startlbl);
        Startlbl.setBounds(56, 380, 345, 40);

        welcomelbl.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        welcomelbl.setForeground(new java.awt.Color(255, 255, 255));
        welcomelbl.setText("Welcome to Our Technology Application ");
        add(welcomelbl);
        welcomelbl.setBounds(59, 314, 341, 50);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/techtree.jpg"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(2, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_startbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Startlbl;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton startbtn;
    private javax.swing.JLabel welcomelbl;
    // End of variables declaration//GEN-END:variables
}
