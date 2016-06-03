/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponen;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 *
 * @author Agung DP
 */
public class Trigonometri {

    private static double sudut;
    private static double tegangan;
    
    public static void setNilai(double nilai){
        Trigonometri.tegangan = nilai;
    }
    
    public static double getNilai(){
        return tegangan;
    }
    
    public void setSudut(double sudut){
        Trigonometri.sudut = Math.toRadians(sudut);
    }
    
    public static double getSinus(){
        double x = Math.sin(sudut);
        return x;
    }
    
    public static double getCosinus(){
        double x = Math.cos(sudut);
        return x;
    }
    
    public static double getTangen(){
        double x = Math.tan(sudut);
        return x;
    }
}
