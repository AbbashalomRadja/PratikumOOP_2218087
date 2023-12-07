/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab1;

/**
 *
 * @author ASUS
 */
public class CLI_SewaKamera {
    public static void main(String[] args) {
        PersewaanKamera sewa = new PersewaanKamera();

        // Mengisi data persewaan kamera
        sewa.dataIDPelanggan("12345");
        sewa.dataIDKamera("K001");
        sewa.dataTanggalSewa("2023-10-15");
        sewa.dataTanggalKembali("2023-10-18");
        sewa.dataDurasiSewa("3 hari");

        // Menampilkan informasi persewaan kamera
        System.out.println("Data Persewaan Kamera");
        System.out.println("-----------------------");
        System.out.println("ID Pelanggan: " + sewa.cetakIDPelanggan());
        System.out.println("ID Kamera: " + sewa.cetakIDKamera());
        System.out.println("Tanggal Sewa: " + sewa.cetakTanggalSewa());
        System.out.println("Tanggal Kembali: " + sewa.cetakTanggalKembali());
        System.out.println("Durasi Sewa: " + sewa.cetakDurasiSewa());
    }
}
