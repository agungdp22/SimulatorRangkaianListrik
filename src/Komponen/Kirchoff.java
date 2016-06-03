/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponen;

import Komponen.Hitung;

/**
 *
 * @author Agung DP
 */
public class Kirchoff {
    private static double arus[];
    private static double hambatan;
    private static double tegangan;
    
    public static void setArus(double arus){
        Kirchoff.arus[0] = arus;
    }
    
    public static void setTegangan(double tegangan){
        Kirchoff.tegangan = tegangan;
    }
    
    public static void setHambatan(double hambatan){
        Kirchoff.hambatan = hambatan;
    }
}
