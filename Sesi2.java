/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi2;

import static java.time.Clock.system;

/**
 *
 * @author ASUS
 */
public class Sesi2 {
    public static void main(String[] args){
        int a = 100;
        int b = 20;
        int hasil;
        hasil = a & b;
        
        System.out.println(hasil);
        
        int c = 528;
        int d = 70;
        int hasil1;
        hasil1 = a | b;
        
        System.out.println(hasil1);
        
        int e = 256;
        int f = 3;
        int hasil2 = e >> f;
        
        System.out.println(hasil2);
        
        int g = 128;
        int h = 5;
        int hasil3;
        hasil3 = g << h;
        
        System.out.println(hasil3);
        
        int i = 600;
        int j = 4;
        int hasil4;
        hasil4 = i >> j;
        
        System.out.println(hasil4);
        
        int k = 423;
        int l = 2;
        int hasil5;
        hasil5 = k << l;
        
        System.out.println(hasil5);
    }
    
}
