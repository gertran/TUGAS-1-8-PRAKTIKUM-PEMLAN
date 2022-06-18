/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg4.pemlan.asdos;

import java.util.*;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        
        DataMerchant.tampilData();
        System.out.println();
        System.out.println("====Cari Merchant====");
        System.out.print("Input Nama Merchant \t: ");
        String namaMerchant = scn.nextLine();
        System.out.print("Input Nama Produk \t: ");
        String namaProduk = scn.nextLine();
        System.out.print("Input Harga Produk \t: ");
        double harga = scn.nextDouble();
        scn.nextLine();
        
        System.out.println();
        
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, harga));
        System.out.println("====Menampilkan Data Merchant Terbaru====");
        System.out.println();
        
        DataMerchant.tampilData();
        
    }
    
}
