/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProgressBar.java
 *
 * Created on Jan 27, 2011, 9:55:00 PM
 */

package View;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.plaf.PanelUI;

/**
 *
 * @author Ahza
 */
public class LaunchProgressBar extends javax.swing.JDialog{

    /** Creates new form ProgressBar */
    public LaunchProgressBar() {
        setUndecorated(true);
        initComponents();
        //splashPanel.setUI(new BackgroundUI());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width-getWidth())/2;
        int y = (dim.height-getHeight())/2;
        setLocation(x, y);
       progressBar.setStringPainted(true);
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashPanel = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        splashPanel.setBackground(new java.awt.Color(0, 0, 204));
        splashPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setValue(50);
        splashPanel.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 660, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Splash.png"))); // NOI18N
        splashPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -70, 930, 570));

        getContentPane().add(splashPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel splashPanel;
    // End of variables declaration//GEN-END:variables

}

//class BackgroundUI extends PanelUI {
//    ImageIcon background = new ImageIcon(getClass().getResource("/Picture/Splash.png"));
//    @Override
//    public void paint(Graphics g, JComponent c) {
//         g.drawImage(background.getImage(), 0, 0, null);
//    }
//}