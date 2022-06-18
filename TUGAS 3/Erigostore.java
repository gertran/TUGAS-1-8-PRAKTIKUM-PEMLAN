/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erigostore;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Erigostore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Baju baju = new Baju();
        System.out.println("Baju yang tersedia : ");
        
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = scn.nextLine();
        baju.setJenis(jenis);

        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        short jumlah = scn.nextShort();
        baju.setJumlah(jumlah);
        baju.getPrintdata();
    }
    }