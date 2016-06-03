/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponen;

/**
 *
 * @author Agung DP
 */
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

//public class Plot exxtends JFrame{
    
    
//    public Plot() {
//    setLayout(new BorderLayout());
//    add(new DrawSine(), BorderLayout.CENTER);
//    }
//
//    public static void runn(){
//    Plot frame = new Plot();
//    frame.setSize(400, 300);
//    frame.setTitle("Plot");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setLocationRelativeTo(null);
//    frame.setVisible(true);
//}
    
public class Plot extends Oscilloscope{
        private static double amplitudo;
        private static double frekuensi;
        
        public static void setAmplitudo(double nilai){
            Plot.amplitudo = nilai;
        }
        public static void setFrekuensi(double nilai){
            Plot.frekuensi = nilai/50;
        }
        public static double getFrekuensi(){
            return frekuensi;
        }
        public static double getAmplitudo(){
            return amplitudo;
        }
        public static void updatepanel(){
            jPanel1.updateUI();
        }
}
/*
class GraphPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private Vector<Vertex> V=new Vector<Vertex>();
    private Vertex v;
    private int R = 20;

    public GraphPanel() {
        V.add(new Vertex(70,70));
        V.add(new Vertex(10,50));
        paintGraph();
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                for (int i=0;i<V.size();i++) {
                    if ((V.get(i).getX()<=e.getX() && V.get(i).getX()+R>=e.getX()) && ( V.get(i).getY()<=e.getY() && V.get(i).getY()+R>=e.getY())) {
                        v=V.get(i);
                        moveVertex(e.getX(),e.getY());
                        v.changeState();
                    }
                }
            }
            public void mouseReleased(MouseEvent e) {
                v.changeState();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (v.isPressed()) moveVertex(e.getX(),e.getY());
            }
        });
    }

    private void paintGraph() {
        int OFFSET = 1;
        for (int i=0;i<V.size();i++) {
            v=V.get(i);
            repaint(v.getX(),v.getY(),R+OFFSET,R+OFFSET);
        }

    }

    private void moveVertex(int x, int y) {
        int OFFSET = 1;
        if ((v.getX()!=x) || (v.getY()!=y)) {
            repaint(v.getX(),v.getY(),R+OFFSET,R+OFFSET);
            v.setLocation(x-10, y-10);
            repaint(v.getX(),v.getY(),R+OFFSET,R+OFFSET);
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (v!=null) {
            g.setColor(Color.RED);
            g.fillOval(v.getX(),v.getY(),R,R);
            g.setColor(Color.BLACK);
            g.drawOval(v.getX(),v.getY(),R,R);
        }
    }
}

public class Vertex {
    private int x,y;
    boolean isPressed;
    Vertex(int x0,int y0) {x=x0;y=y0;isPressed=false;}
    public void setLocation(int x0,int y0) {x=x0;y=y0;}
    public int getX() {return x;}
    public int getY() {return y;}
    public boolean isPressed() {return isPressed;}
    public boolean changeState() {return isPressed=!isPressed;}

}

public class Tester {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new GraphPanel());
        f.pack();
        f.setVisible(true);
    }
}    
*/