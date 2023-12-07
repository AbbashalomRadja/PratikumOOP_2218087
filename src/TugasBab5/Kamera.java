/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab5;

/**
 *
 * @author ASUS
 */
public class Kamera {
    // Atribut untuk menyimpan informasi Kamera
    private String merk;
    private String nama;
    private int Tanggal;
    private String kameramen;
    private int banyakkamera;

    // Konstruktor untuk membuat objek Kamera dengan informasi
    public Kamera(String merk, String nama, int Tanggal) {
        this.merk = merk;
        this.nama = nama;
        this.Tanggal = Tanggal;
    }

    // Overloaded constructor for method overloading
    public Kamera(String merk, String nama, int Tanggal, String kameramen, int banyakkamera) {
        this.merk = merk;
        this.nama = nama;
        this.Tanggal = Tanggal;
        this.kameramen = kameramen;
        this.banyakkamera = banyakkamera;
    }
    
    // Metode getter untuk mengakses atribut privat
    public String getmerk() {
        return merk;
    }

    public String getnama() {
        return nama;
    }

    public int gettanggal() {
        return Tanggal;
    }

    // Getter methods for the new attributes
    public String getkameramen() {
        return kameramen;
    }

    public int getbanyakkamera() {
        return banyakkamera;
    }
    
    public String generateInfo() {
        return "merk: " + merk + "\n" +
               "nama: " + nama + "\n" +
               "Tahun Terbit: " + Tanggal + "\n";
    }
    
    // Metode untuk menampilkan informasi Kamera
    public void displayInfo() {
        System.out.println("merk: " + merk);
        System.out.println("nama: " + nama);
        System.out.println("Tahun Terbit: " + Tanggal);
    }
}
