/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatorrangkaianlistrik;

import Komponen.Oscilloscope;
import Komponen.Plot;
import Komponen.Resistor.GambarResistor;
import Komponen.Kapasitor;

/**
 *
 * @author Agung DP
 */
public class RangkaianRC extends javax.swing.JFrame {

    /**
     * Creates new form RangkaianRC
     */
    int aksi = 0;
    public RangkaianRC() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layar = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        oskiloskopkapasitor = new javax.swing.JLabel();
        sumbertegangan = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        resistor = new javax.swing.JLabel();
        kapasitor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layarLayout = new javax.swing.GroupLayout(layar);
        layar.setLayout(layarLayout);
        layarLayout.setHorizontalGroup(
            layarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        layarLayout.setVerticalGroup(
            layarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        getContentPane().add(layar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 290, 220));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Sinyal Input", "Kapasitor", "Resistor" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        oskiloskopkapasitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/oscilloscope.png"))); // NOI18N
        getContentPane().add(oskiloskopkapasitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        sumbertegangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/sumber-kotak.png"))); // NOI18N
        sumbertegangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumberteganganMouseClicked(evt);
            }
        });
        getContentPane().add(sumbertegangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Keluar.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        resistor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/resistor-rangkaian2.png"))); // NOI18N
        resistor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resistorMouseClicked(evt);
            }
        });
        getContentPane().add(resistor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        kapasitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Komponen/kapasitor3.png"))); // NOI18N
        kapasitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kapasitorMouseClicked(evt);
            }
        });
        getContentPane().add(kapasitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/kabel-mendatar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/kabel-tegak.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 30, 200));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/kabel-mendatar.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 140, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/kabel-mendatar.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 490, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/kabel-tegak.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 30, 200));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/kabel-mendatar.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, 280, 40));

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 48)); // NOI18N
        jLabel4.setText("Rangkaian Resistor-Kapasitor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_exitMouseClicked

    private void sumberteganganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumberteganganMouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oscilloscope().setVisible(true);
            }
        });
    }//GEN-LAST:event_sumberteganganMouseClicked

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        int p = jComboBox1.getSelectedIndex();
        switch (p) {
            case 1:
                Plot.KurvaDiskret();
                Plot.KurvaKapasitor();
                break;
            case 2:
                Plot.KurvaDiskret();
                Plot.KurvaResistor();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        Plot.updatepanel();
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void resistorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resistorMouseClicked

        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new GambarResistor().setVisible(true);
                    }
                });
    }//GEN-LAST:event_resistorMouseClicked

    private void kapasitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapasitorMouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Kapasitor().setVisible(true);
                    }
                });
    }//GEN-LAST:event_kapasitorMouseClicked

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
            java.util.logging.Logger.getLogger(RangkaianRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RangkaianRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RangkaianRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RangkaianRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RangkaianRC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel kapasitor;
    public static javax.swing.JPanel layar;
    private javax.swing.JLabel oskiloskopkapasitor;
    private javax.swing.JLabel resistor;
    private javax.swing.JLabel sumbertegangan;
    // End of variables declaration//GEN-END:variables
}
