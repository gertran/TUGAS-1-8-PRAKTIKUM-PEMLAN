/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erigostore;

/**
 *
 * @author user
 */
public class Baju {
    private String jenis;
    private int harga;
    private short jumlah;
    
    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setJumlah(short jumlah) {
        this.jumlah = jumlah;
    }

    void hargaa() {
        if (jumlah > 100) {
            harga = jumlah * 95000;
            System.out.println("Harga Per buah \t\t: " + 95000);
            System.out.println("Total harga    \t\t: " + harga);
        } else {
            harga = jumlah * bajua;
            System.out.println("Harga Per buah \t\t: " + bajua);
            System.out.println("Total harga    \t\t: " + harga);
        }
    }

    void hargab() {
        if (jumlah > 100) {
            harga = jumlah * 120000;
            System.out.println("Harga Per buah \t\t: " + 120000);
            System.out.println("Total harga    \t\t: " + harga);
        } else {
            harga = jumlah * bajub;
            System.out.println("Harga Per buah \t\t: " + bajub);
            System.out.println("Total harga    \t\t: " + harga);
        }
    }

    void hargac() {
        if (jumlah > 100) {
            harga = jumlah * 160000;
            System.out.println("Harga Per buah \t\t: " + 160000);
            System.out.println("Total harga    \t\t: " + harga);
        } else {
            harga = jumlah * bajuc;
            System.out.println("Harga Per buah \t\t: " + bajuc);
            System.out.println("Total harga    \t\t: " + harga);
        }
    }

    void display() {
        if (jenis.equalsIgnoreCase("a")) {
            hargaa();
        } else if (jenis.equalsIgnoreCase("b")) {
            hargab();
        } else if (jenis.equalsIgnoreCase("c")) {
            hargac();
        }

    }

    public void getPrintdata() {
        System.out.println("Jenis yang anda beli \t: " + jenis);
        display();
    }
}