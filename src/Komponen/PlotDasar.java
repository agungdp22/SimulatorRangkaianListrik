/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponen;

import static Komponen.Plot.layardasar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Agung DP
 */
public class PlotDasar {
    private static double ampli;
    private static double frek;
        private static double Res;
    
    public static void setHambatan(double resistor){
            PlotDasar.Res = resistor;
        }
        public static double getHambatan(){
            return Res;
        }
    public static void setAmpli(double nilai){
            PlotDasar.ampli = nilai;
        }
        public static void setFrek(double nilai){
            PlotDasar.frek = nilai;
        }
        public static double getFrek(){
            return frek;
        }
        public static double getAmpli(){
            return ampli/10;
        }
        
        public static void KurvaDiskret1(){
            Graphics kurvads = layardasar.getGraphics();
            Polygon p = new Polygon();
            int h = (int)(150/frek);
            
            int titikawal = 0;
            int titikakhir = 300;
            for(int y=1; y<=2*frek;y++){
               titikakhir = titikawal + h;
               for (int x = titikawal; x <= titikakhir; x++) {
                    if(y%2 == 1) {
                        p.addPoint(x, (int)(110 - ampli));
                    }else{
                        p.addPoint(x, (int)(110 + ampli));
                    }
                }
               titikawal = titikawal + h;
            }
                
            kurvads.setColor(Color.blue);
            kurvads.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        }
}
