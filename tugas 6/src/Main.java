/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg6.pemlan.asdos;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class Main {
    static Manusia manusia[];
    static MahasiswaFILKOM mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];
    
    public static void main(String[] args) {
        // Class Manusia
        manusia = new Manusia[3];
        System.out.println(" Class Manusia ");
        System.out.println("=================================================");
        manusia[0] = new Manusia("Gertran Micael", "215150707111032", true, false);
        manusia[1] = new Manusia("Rosa", "215612656736", false, true);
        manusia[2] = new Manusia("Daniel", "215124007475", true, true);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        // Class MahasiswaFILKOM
        mahasiswa = new MahasiswaFILKOM[3];
        System.out.println(" Class Mahasiswa ");
        System.out.println("=================================================");
        mahasiswa[0] = new MahasiswaFILKOM("205150400111089", 3.8, "Angel Eros", "199925029106", false, true);
        mahasiswa[1] = new MahasiswaFILKOM("195150200111042", 4.0, "Cinta Devi", "2003829374606", false, false);
        mahasiswa[2] = new MahasiswaFILKOM("215150707111032", 3.7, "Gertran Micael", "2002682923109", true, false);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        // Class Pekerja
        pekerja = new Pekerja[3];
        System.out.println(" Class Pekerja ");
        System.out.println("=================================================");
        pekerja[0] = new Pekerja(7, 22, "292102239283", "Rio Ansu", "2933242352524", true, true);
        pekerja[1] = new Pekerja(9, 28, "101325129957", "Lisa Yan", "243245245224", false, true);
        pekerja[2] = new Pekerja(7, 30, "3032253291648", "Erik Fernan", "203245244642", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

        // Class Manager
        manager = new Manager[3];
        System.out.println(" Class Manager ");
        System.out.println("=================================================");
        manager[0] = new Manager(1100, 7, 29, "200225123106", "Anggie Zee", "100164744367", false, true);
        manager[1] = new Manager(1200, 6, 26, "200225256106", "Zupri Anju", "298745362345", true, true);
        manager[2] = new Manager(1300, 8, 30, "200225389106", "Josua Cahyo", "293451351145", true, false);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());

        // Jumlah
        System.out.println(" Total Keseluruhan yang Terdaftar ");
        System.out.println("=================================================");
        System.out.println("Jumlah Manusia : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja : " + pekerja.length);
        System.out.println("Jumlah Manager : " + manager.length);
    }
    
}
