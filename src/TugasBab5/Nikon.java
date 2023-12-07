/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab5;

/**
 *
 * @author ASUS
 */
public class Nikon extends Kamera {
        // Atribut tambahan untuk menyimpan informasi nikon
    private final String namaNikon;
    private final String posisi;

    // Konstruktor untuk membuat objek nikon dengan informasi
    public Nikon(String merk, String nama, int tanggal, String namaNikon, String posisi) {
        super(merk, nama, tanggal); // Memanggil konstruktor dari superclass
        this.namaNikon = namaNikon;
        this.posisi = posisi;
    }

    // Metode getter untuk mengakses atribut privat nikon
    public String getNamaNikon() {
        return namaNikon;
    }

    public String getPosisi() {
        return posisi;
    }

    // Metode untuk menampilkan informasi nikon, termasuk informasi dari superclass kamera
    public void displayInfoNikon() {
        super.displayInfo(); // Memanggil metode displayInfo dari superclass
        System.out.println("Nama Nikon: " + namaNikon);
        System.out.println("Posisi: " + posisi);
    }
    @Override
    public String generateInfo() {
        return super.generateInfo() + // Call the generateInfo method from the superclass
               "Nama Nikon: " + namaNikon + "\n" +
               "Posisi: " + posisi + "\n";
    }  
}
