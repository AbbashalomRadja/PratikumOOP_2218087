/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB2;

/**
 *
 * @author ASUS
 */
public class A {
    public static void main(String[] args){
        Kendaraan mobil = new Kendaraan();
        System.out.println("Nama Kendaraan  : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Merek Kendaraan : " + mobil.pabrikan);
        System.out.println("Jumlah Roda     : " + mobil.speed + "km/jam");
        System.out.println("Cara Kendaraan bergerak : ");
        System.out.println("Saat Maju : " );
        mobil.kendaraanMaju();
        System.out.println("Saat Mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat berhenti : " + mobil.nama);
        mobil.KendaraanBerhenti();
    }
}