/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab4;

/**
 *
 * @author ASUS
 */
public class SewaKamera {
    //atribut
    String nama, tlp, tgl, bulan, tahun, jam;
    int durasi, biasa, lengkap;
    // atribut private
    private int harga;
    private String JenisKamera;
    //konstruk 
    public SewaKamera(){
        this.nama = "Abbashalom Radja";
        this.tlp = "2218087";
    }
    //method
    void dataNama(String Nama){
         this.nama = Nama;
    }
    void dataTlp(String Tlp){
         this.tlp = Tlp;
    }
    void dataTgl(String Tgl){
          this.tgl = Tgl;
    }
    void dataBulan(String Bulan){
          this.bulan = Bulan;
    }
    void dataTahun(String Tahun){
          this.tahun = Tahun;
    }
    void dataJam (String Jam){
          this.jam = Jam;
    }
    void dataDurasi(int Durasi){
          this.durasi = Durasi;
    }
    void dataJenisKamera (String JenisiPhone){
          this.JenisKamera = JenisiPhone;
    } 
    void dataHarga (int Harga){
          this.harga = Harga;
    }
    void dataBiasa(int Biasa){
          this.biasa = Biasa;
    }
    void dataLengkap(int Lengkap){
          this.lengkap = Lengkap;
    }
    int cetakBiasa(){
          return biasa;
    }
    int cetakLengkap(){
          return lengkap;
    }
    int cetakHarga(){
          return harga;
    }
    String cetakNama(){
          return nama;
    }
    String cetakTlp(){
          return tlp;
    }
    String cetakTgl(){
          return tgl;
    }
    String cetakBulan(){
          return bulan;
    }
    String cetakTahun(){
          return tahun;
    }
    String cetakJenisKamera(){
          return JenisKamera;
    }
    int cetakDurasi(){
          return durasi;
    }
    String cetakJam(){
          return jam;
    }
}
