/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai pegawai;
        
        pegawai = new Pegawai();
        System.out.println("===================================================");
        System.out.println("\t\t Pegawai Tetap");
        System.out.println("===================================================");
        pegawai = new PegawaiTetap("Gertran Micael", "12312894343", 7000000);
        System.out.println(pegawai.toString() + "\n");
        
        System.out.println("===================================================");
        System.out.println("\t\t Pegawai Harian");
        System.out.println("===================================================");
        pegawai = new PegawaiHarian("Ilham Festa", "2345359435934", 3500, 35);
        System.out.println(pegawai.toString() + "\n");
        
        System.out.println("===================================================");
        System.out.println("\t\t Sales");
        System.out.println("===================================================");
        pegawai = new Sales("Andi Kurniawan", "243543643633", 70, 50000);
        System.out.println(pegawai.toString() + "\n");
    }
    
}
