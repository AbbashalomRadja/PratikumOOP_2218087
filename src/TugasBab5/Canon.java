/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab5;

/**
 *
 * @author ASUS
 */
public class Canon extends Kamera {
    // Atribut tambahan untuk menyimpan informasi nikon
    private final int nomorCanon;
    private final String alamat;

    // Konstruktor untuk membuat objek nikon dengan informasi
    public Canon(String merk, String nama, int Tanggal, int nomorCanon, String alamat) {
        super(merk, nama, Tanggal); // Memanggil konstruktor dari superclass
        this.nomorCanon = nomorCanon;
        this.alamat = alamat;
    }

    // Metode getter untuk mengakses atribut privat nikon
    public int getNomorCanon() {
        return nomorCanon;
    }

    public String getAlamat() {
        return alamat;
    }

    // Metode untuk menampilkan informasi nikon, termasuk informasi dari superclass Buku
    public void displayInfoCanon() {
        super.displayInfo(); // Memanggil metode displayInfo dari superclass
        System.out.println("Nomor Canon: " + nomorCanon);
        System.out.println("Alamat: " + alamat);
    }
    
    @Override
    public String generateInfo() {
        return super.generateInfo() + // Call the generateInfo method from the superclass
               "Nomor Canon: " + nomorCanon + "\n" +
               "Alamat: " + alamat + "\n";
    }
}
