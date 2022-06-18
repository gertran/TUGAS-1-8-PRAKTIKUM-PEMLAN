/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg4.pemlan.asdos;

/**
 *
 * @author user
 */
public class DataMerchant {
    static Merchant[] merchant = new Merchant[0];
    public static Merchant[] tambahMerchant(Merchant merchan) {
        Merchant[] merch = new Merchant[DataMerchant.merchant.length + 1];
        for (int i = 0; i < DataMerchant.merchant.length; i++) {
            merch[i] = merchant[i];
        }
        merch[DataMerchant.merchant.length] = merchan;
        return merch;
    }
    public static void tampilData() {
        for (Merchant merch : DataMerchant.merchant) {
            System.out.println("====Tampilan Data Merchant UBFOOD====");
            System.out.println("Nama Merchant \t: " + merch.getNamaMerchant());
            System.out.println("Nama Produk \t: " + merch.getNamaProduk());
            System.out.println("Harga \t\t: " + (int) merch.getHargaMakanan());
        }
    }
    public static Merchant cariMerchant(String nama) {
        int index = 0;
        for (int i = 0; i < DataMerchant.merchant.length; i++) {
            if (DataMerchant.merchant[i].getNamaMerchant() == nama) {
                index = i;
                break;
            }
        }
        return merchant[index];
    }
    public static void tampilMerchant(Merchant merch) {
        System.out.println("====Tampilan Data Merchant UBFOOD====");
        System.out.println("Nama Merchant \t: " + merch.getNamaMerchant());
        System.out.println("Nama Produk \t: " + merch.getNamaProduk());
        System.out.println("Harga \t\t: " + (int) merch.getHargaMakanan());
    }
    public static void updateMerchant(Merchant merch, String namaMerchant, String namaProduk, double harga) {
        merch.setNamaMerchant(namaMerchant);
        merch.setNamaProduk(namaProduk);
        merch.setHargaMakanan(harga);
    }
}
