/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab2;

/**
 *
 * @author ASUS
 */
public class SewaKamera {
    int harga, total, lama;// Variabel-variabel untuk harga, total, dan lama sewa.
    String nama;// Variabel untuk nama penyewa.
    
    public SewaKamera(){ // Konstruktor kelas 'SewaKamera'.
        this.harga = 70000;//Menginisialisasi harga default ketika objek dibuat.
    }
    public int total(){// Metode 'total' untuk menghitung total harga sewa
        total = (harga*lama);
        return total;    
    }
    void datanama(String nama){
        this.nama = nama;
    }
    int datasewa(){
        return lama;
    }
    int dataharga(){
        return harga;
    }
    String cetaknama(){
        return nama;
    }
    void PemesananBerhasil(){
        System.out.println("PemesananBerhasil");
    }
    void PemesananGagal(){
        System.out.println("PemesananGagal");
    }

}
