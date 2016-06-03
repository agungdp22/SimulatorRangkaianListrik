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
public class InitCincinOtomatis {
    private static long nilai;
    
    public static void setNilai(long nilai){
        InitCincinOtomatis.nilai = nilai;
    }
    
    public static void getCincinOtomatis(){
        int p = (int) nilai;
        int cincin1 = 0, cincin2 = 0, cincin3 = 0;
        if(p<10){
            cincin2 = p%10;
            cincin1 = 0;
            cincin3 = 2;
        }
        else{
            while(p > 0){
                if(p<100 && p>=10){
                    cincin2 = p%10;
                }
                else if(p<10){
                    cincin1 = p%10;
                }
                p = p/10;
                cincin3++;
            }
        }
        InitCincin.getCincin3(cincin3 - 2);
        InitCincin.getCincin2(cincin2);
        InitCincin.getCincin1(cincin1);
    }
}
