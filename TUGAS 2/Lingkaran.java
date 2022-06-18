/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Lingkaran {
    void getLuas(int r){
        if(r%7==0){
            double hitungLuas = 22/7*r*r;
            int l = (int)hitungLuas;
            System.out.print((double)l);
        }else{
            double hitungLuas = 3.14*r*r;
            int l = (int)hitungLuas;
            System.out.print((double)l);
        }
    }
}
