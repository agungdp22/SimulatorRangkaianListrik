/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatorrangkaianlistrik;

import View.LaunchProgressBar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Agung DP
 */
public class SimulatorRangkaianListrik {

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
    LaunchProgressBar pb = new LaunchProgressBar();
        pb.setVisible(true);
        for(int i=0;i<=100;i++){
            try {
                pb.getProgressBar().setValue(i);
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(LaunchProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        pb.dispose();
        new Rangkaian().setVisible(true);
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Rangkaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Rangkaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Rangkaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Rangkaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Rangkaian().setVisible(true);
//            }
//        });
    }
    
}
