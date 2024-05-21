/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagement;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hp
 */
public class Admin_home extends javax.swing.JFrame {

    /**
     * Creates new form Admin_home
     */
    public Admin_home() {
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

        jLabel3 = new javax.swing.JLabel();
        addp = new javax.swing.JButton();
        drec = new javax.swing.JButton();
        prec = new javax.swing.JButton();
        addd = new javax.swing.JButton();
        prec1 = new javax.swing.JButton();
        prec2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1241, 649));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 70));

        addp.setBackground(new java.awt.Color(29, 164, 196));
        addp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addp.setForeground(new java.awt.Color(255, 255, 255));
        addp.setText("Add Pateint");
        addp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpMouseClicked(evt);
            }
        });
        getContentPane().add(addp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 60));

        drec.setBackground(new java.awt.Color(29, 164, 196));
        drec.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        drec.setForeground(new java.awt.Color(255, 255, 255));
        drec.setText("Doctor Records");
        drec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        drec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drecMouseClicked(evt);
            }
        });
        getContentPane().add(drec, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 60));

        prec.setBackground(new java.awt.Color(29, 164, 196));
        prec.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prec.setForeground(new java.awt.Color(255, 255, 255));
        prec.setText("Pateint Records");
        prec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precMouseClicked(evt);
            }
        });
        prec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precActionPerformed(evt);
            }
        });
        getContentPane().add(prec, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 170, 60));

        addd.setBackground(new java.awt.Color(29, 164, 196));
        addd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addd.setForeground(new java.awt.Color(255, 255, 255));
        addd.setText("Add Doctor");
        addd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adddMouseClicked(evt);
            }
        });
        getContentPane().add(addd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, 60));

        prec1.setBackground(new java.awt.Color(29, 164, 196));
        prec1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prec1.setForeground(new java.awt.Color(255, 255, 255));
        prec1.setText("Update Pateint ");
        prec1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prec1MouseClicked(evt);
            }
        });
        prec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prec1ActionPerformed(evt);
            }
        });
        getContentPane().add(prec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 170, 60));

        prec2.setBackground(new java.awt.Color(29, 164, 196));
        prec2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prec2.setForeground(new java.awt.Color(255, 255, 255));
        prec2.setText("Update Doctor");
        prec2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prec2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prec2MouseClicked(evt);
            }
        });
        prec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prec2ActionPerformed(evt);
            }
        });
        getContentPane().add(prec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 170, 60));

        jButton2.setBackground(new java.awt.Color(29, 164, 196));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Best-FreeOpen-Source-Hospital-Management-System-02-1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpMouseClicked
        File f = new File("doctors.csv");
        if (f.exists()) {
            this.setVisible(false);
            new add_pat().setVisible(true);
        } else {
            addd.setBorder(new LineBorder(Color.red));
        }
    }//GEN-LAST:event_addpMouseClicked

    private void drecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drecMouseClicked
        File f = new File("doctors.csv");
        if (f.exists()) {
            this.setVisible(false);
            try {
                new doc_rec().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Admin_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            addd.setBorder(new LineBorder(Color.red));
        }

    }//GEN-LAST:event_drecMouseClicked

    private void precMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precMouseClicked
        File f = new File("patients.csv");
        if (f.exists()) {
            this.setVisible(false);
            try {
                new pat_recs().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Admin_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            addp.setBorder(new LineBorder(Color.red));
        }

    }//GEN-LAST:event_precMouseClicked

    private void adddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddMouseClicked
        this.setVisible(false);
        new add_doc().setVisible(true);
    }//GEN-LAST:event_adddMouseClicked

    private void precActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precActionPerformed

    private void prec1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prec1MouseClicked
        File f = new File("patients.csv");
        if (f.exists()) {
            this.setVisible(false);
            try {
                new up_pat().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Admin_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            addp.setBorder(new LineBorder(Color.red));
        }

    }//GEN-LAST:event_prec1MouseClicked

    private void prec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prec1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prec1ActionPerformed

    private void prec2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prec2MouseClicked
        File f = new File("doctors.csv");
        if (f.exists()) {
            this.setVisible(false);
            new up_doc().setVisible(true);
        }
        else{
             addd.setBorder(new LineBorder(Color.red));
        }

    }//GEN-LAST:event_prec2MouseClicked

    private void prec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prec2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prec2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addd;
    private javax.swing.JButton addp;
    private javax.swing.JButton drec;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton prec;
    private javax.swing.JButton prec1;
    private javax.swing.JButton prec2;
    // End of variables declaration//GEN-END:variables
}