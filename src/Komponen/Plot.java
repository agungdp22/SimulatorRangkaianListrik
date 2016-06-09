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
import Komponen.Resistor.NilaiResistor;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import simulatorrangkaianlistrik.RangkaianRC;
    
public class Plot extends Oscilloscope {
        private static double amplitudo;
        private static double frekuensi;
        private static double C;
        private static double R;
        static JPanel layarRC = RangkaianRC.layar;
        
        public static void setAmplitudo(double nilai){
            Plot.amplitudo = nilai;
        }
        public static void setFrekuensi(double nilai){
            Plot.frekuensi = nilai;
        }
        public static void setKapasitor(double kapasitor){
            Plot.C = kapasitor;
        }
        public static void setHambatan(double resistor){
            Plot.R = resistor;
        }
        
        public static double getFrekuensi(){
            return frekuensi;
        }
        public static double getAmplitudo(){
            return amplitudo;
        }
        public static void updatepanel(){
            jPanel1.updateUI();
            layarRC.updateUI();
        }
        
        public static void KurvaSinusoidal(){
            Graphics kurva = jPanel1.getGraphics();
            double F = frekuensi/3;
            Polygon p = new Polygon();
            for (int x = 0; x <= 288; x++) {
                p.addPoint(x, 110 - (int) (amplitudo * Math.sin((x / 100.0) * 2 * F * Math.PI)));
            }
            kurva.setColor(Color.red);
            kurva.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        }
        
        public static void KurvaDiskret(){
            Graphics kurva = jPanel1.getGraphics();
            Graphics kurva2 = layarRC.getGraphics();
            Polygon p = new Polygon();
            int h = (int)(300/frekuensi);
            
            int titikawal = 0;
            int titikakhir = 300;
            for(int y=1; y<=frekuensi;y++){
               titikakhir = titikawal + h;
               for (int x = titikawal; x <= titikakhir; x++) {
                    if(y%2 == 1) {
                        p.addPoint(x, (int)(110 - amplitudo));
                    }else{
                        p.addPoint(x, (int)(110 + amplitudo));
                    }
                }
               titikawal = titikawal + h;
            }
                
            kurva.setColor(Color.blue);
            kurva.drawPolyline(p.xpoints, p.ypoints, p.npoints);
            kurva2.setColor(Color.green);
            kurva2.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        }
        
        public static void KurvaKapasitor(){
            Graphics kurva = layarRC.getGraphics();
            Polygon p = new Polygon();
            int h = (int)(300/frekuensi);
            
            int titikawal = 0;
            int titikakhir ;
            for(int y=1; y<=frekuensi;y++){
               titikakhir = titikawal + h;
               int xx = 0;
               for (int x = titikawal; x <= titikakhir; x++) {
                    if(y%2 == 1) {
                        p.addPoint(x, (int)(110 - ( amplitudo * (1 - Math.exp(-xx/(R*C))) )));
                    }else{
                        p.addPoint(x, (int)(110 + ( amplitudo * (1 - Math.exp(-xx/(R*C))) )));
                    }
                    xx++;
                }
               titikawal = titikawal + h;
            }
            kurva.setColor(Color.black);
            kurva.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        }
        
        public static void KurvaResistor(){
            int waktu = (int) (300/frekuensi);
            double Vc = 1 - Math.exp(-waktu/(R*C));
            
            Graphics kurva = layarRC.getGraphics();
            Polygon p = new Polygon();
            int h = (int)(300/frekuensi);
            
            int titikawal = 0;
            int titikakhir ;
            for(int y=1; y<=frekuensi;y++){
               titikakhir = titikawal + h;
               int xx =0;
               for (int x = titikawal; x <= titikakhir; x++) {
                    if(y%2 == 1) {
                        p.addPoint(x, (int)(110 - ( amplitudo * (Math.exp(-xx/(R*C))) )));
                    }else{
                        p.addPoint(x, (int)(110 + ( amplitudo * (Math.exp(-xx/(R*C))) )));
                    }
                    xx++;
                }
               titikawal = titikawal + h;
            }
            kurva.setColor(Color.black);
            kurva.drawPolyline(p.xpoints, p.ypoints, p.npoints);
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