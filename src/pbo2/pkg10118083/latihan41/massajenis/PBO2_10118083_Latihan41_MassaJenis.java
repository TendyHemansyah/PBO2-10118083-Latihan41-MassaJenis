/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan41.massajenis;

/**
 *
 * @author 
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas: Massa Jenis
 */
public class PBO2_10118083_Latihan41_MassaJenis {

    /**
     * @param args the command line arguments
     */
    private static int volume, MassaJenis;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("===== Massa Jenis Kubus =====");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa());
        
        volume = kubus.hitungVolume(kubus.getSisi());
        MassaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);
        
        System.out.println("\n====== Hasil Perhitungan ======");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + MassaJenis);
    }
    
}
