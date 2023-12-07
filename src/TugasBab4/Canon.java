/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab4;

/**
 *
 * @author ASUS
 */
public class Canon extends SewaKamera {
    //atribut
    int Pros, Airs, hargaCanon;
    protected String JenisCanon, internal;
    //konstruksi
    public Canon (){
    this.JenisCanon = "Ipad 12 Pro";
    this.internal = "256 GB";
    }
    //    method
    void datajenisCanon(String JenisCanon){
    this.JenisCanon = JenisCanon;
    }
    void dataInternal(String Internal){
    this.internal = Internal;
    }
    //method dari class Rental_iPhone
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
   // tidak lagi dipake karena khusus iPhone
   // void dataHarga (int Harga){
   // this.harga = Harga;
   // }
   //  void dataJenisiPhone (String JenisiPhone){
   // this.JenisiPhone = JenisiPhone;
   // } 
    // String cetakJenisiPhone(){
   // return JenisiPhone;
   // }
    void dataHargaCanon (int HargaCanon){
    this.hargaCanon = HargaCanon;
    }
    void dataBiasa(int Biasa){
    this.biasa = Biasa;
    }
    void dataLengkap(int Lengkap){
    this.lengkap = Lengkap;
    }
    void dataPros(int Pros){
    this.Pros = Pros;
    }
    void dataAirs(int Airs){
    this.Airs = Airs;
    }
    int cetakBiasa(){
    return biasa;
    }
    int cetakLengkap(){
    return lengkap;
    }
    int cetakPros(){
    return Pros;
    }
    int cetakAirs(){
    return Airs;
    }
    // tidak lagi dipake karena khusus iPhone
   // int cetakHarga(){
   // return harga;
   // }
    int cetakHargaCanon(){
    return hargaCanon;
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
    String cetakJenisCanon(){
    return JenisCanon;
    }
    String cetakInternal(){
    return internal;
    }
    int cetakDurasi(){
    return durasi;
    }
    String cetakJam(){
    return jam;
    }
}
