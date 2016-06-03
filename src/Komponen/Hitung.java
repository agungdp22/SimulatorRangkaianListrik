/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponen;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Agung DP
 */
public class Hitung {
    private static double arus;
    private static double tegangan;
    private static double hambatan; 
    
    public static void setArus(double arus){
        Hitung.arus = arus;
    }
    
    public static void setTegangan(double tegangan){
        Hitung.tegangan = tegangan;
    }
    
    public static void setHambatan(double hambatan){
        Hitung.hambatan = hambatan;
    }
    
    public static String getHitungArus(){
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        arus = tegangan/hambatan;
        String hasil = df.format(arus);
        //String hasil = Double.toString(arus);
        return hasil;
    }
    
    public static String getHitungTegangan(){
        tegangan = arus*hambatan;
        String hasil = Double.toString(tegangan);
        return hasil;
    }
    
    public static String getHitungHambatan(){
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        hambatan = tegangan/arus;
        String hasil = df.format(hambatan);
        return hasil;
    }
}
