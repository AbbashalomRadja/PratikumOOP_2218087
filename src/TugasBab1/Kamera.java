/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab1;

/**
 *
 * @author ASUS
 */
public class Kamera {
    private String IDPelanggan;
    private String IDKamera;
    private String TanggalSewa;
    private String TanggalKembali;
    private String DurasiSewa;

    public void dataNIM(String Nim) {
        this.IDPelanggan = Nim;
    }

    public void dataNama(String Nama) {
        this.IDKamera = Nama;
    }

    public void dataJenisKelamin(String JenisKelamin) {
        this.TanggalSewa = JenisKelamin;
    }

    public void dataProdi(String Prodi) {
        this.TanggalKembali = Prodi;
    }

    public void dataAngkatan(String Angkatan) {
        this.DurasiSewa = Angkatan;
    }

    public String cetakNIM() {
        return IDPelanggan;
    }

    public String cetakNama() {
        return IDKamera;
    }

    public String cetakJenisKelamin() {
        return TanggalSewa;
    }

    public String cetakProdi() {
        return TanggalKembali;
    }

    public String cetakAngkatan() {
        return DurasiSewa;
    }
}
