/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surat.kaisar;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class SuratKaisar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String plain = scn.nextLine();
        String cipher = "";
        char alfabet;
        int shift = scn.nextInt();
        
        for(int i=0; i < plain.length();i++){  
            alfabet = plain.charAt(i);
            if(alfabet >= 'a' && alfabet <= 'z'){
            alfabet = (char) (alfabet + shift);
            if(alfabet > 'z'){
                alfabet = (char) (alfabet+'a' - 'z' - 1);
            }
            cipher = cipher + alfabet;
        }
            else if(alfabet >= 'A' && alfabet <= 'Z'){
                alfabet = (char) (alfabet + shift);
                
                if(alfabet > 'Z'){
                    alfabet = (char) (alfabet + 'A' - 'Z' - 1);       
                }
                cipher = cipher + alfabet;
            }
            else{
                cipher = cipher + alfabet;
            }    
        }
        System.out.println(cipher);
        
    }
    
}
