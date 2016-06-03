/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponen.Resistor;

/**
 *
 * @author Agung DP
 */
public class NilaiResistor {
    private static int cincin1;
    private static int cincin2;
    private static int cincin3;
    private static int cincin4;
    private static double nilaitoleransi;
    
    public static void setCincin1(int cincin1){
        NilaiResistor.cincin1 = cincin1;
    }
    
    public static void setCincin2(int cincin2){
        NilaiResistor.cincin2 = cincin2;
    }
    
    public static void setCincin3(int cincin3){
        NilaiResistor.cincin3 = cincin3;
    }
    
    public static void setCincin4(int cincin4){
        NilaiResistor.cincin4 = cincin4;
    }
    
    public static long getHambatanMinimum(){
        long ohm;
        int kali = 1;
        for(int i=0; i<cincin3;i++){
            kali = kali*10;
        }
        ohm = ((10*cincin1)+(cincin2))*kali;
        return ohm;
    }
}
