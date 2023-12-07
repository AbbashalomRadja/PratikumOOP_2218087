/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab1;

/**
 *
 * @author ASUS
 */
class PersewaanKamera {
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

    void dataIDPelanggan(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void dataIDKamera(String k001) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void dataTanggalSewa(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void dataTanggalKembali(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void dataDurasiSewa(String _hari) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String cetakIDPelanggan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String cetakIDKamera() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String cetakTanggalSewa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String cetakTanggalKembali() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String cetakDurasiSewa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}