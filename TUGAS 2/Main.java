/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        
        int s, a, t, r2;
        int pilihan = in.nextInt();
        
        if(pilihan==1){    
            s = in.nextInt();
            persegi.getLuas(s);
            
        }else if(pilihan==2){
            a = in.nextInt();
            t = in.nextInt();
            
            segitiga.getLuas(a, t);
            
        }else if(pilihan==3){
            r2 = in.nextInt();
            lingkaran.getLuas(r2);
        }else{
            System.out.print("Input yang anda masukan tidak sesuai");
        }   
    }
    
}
