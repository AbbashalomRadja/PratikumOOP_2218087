/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab4;

/**
 *
 * @author ASUS
 */
public class WarnaCam extends Canon {
    // atribut jenis protected
    protected String warna, kamera;
    
    //construction
    public WarnaCam (){
        this.warna = "Hitam";
        this.kamera = "Canon";
    }
    
    //method
    void dataWarna(String warna){
        this.warna= warna;
    }
    void dataKamera(String Kamera){
        this.kamera = Kamera;
    }
    String cetakwarna(){
        return warna;
    }
    String cetakKamera(){
        return kamera;
    }
    
    //method dari class Canon
    void dataJenisCanon(String JenisCanon){
        this.JenisCanon = JenisCanon;
    }
    void dataInternal(String internal){
        this.internal = internal;
    }
    void dataHargaCanon(int HargaCanon){
        this.hargaCanon = HargaCanon;
    }
    void dataPros(int Pros){
        this.Pros = Pros;
    }
    void dataAirs(int Airs){
        this.Airs = Airs;
    }
    int cetakPros(){
        return Pros;
    }
    int cetakAirs(){
        return Airs;
    }
    int cetakHargaCanon(){
    return hargaCanon;
    }
    String cetakJenisCanon(){
    return JenisCanon;
    }
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
    int cetakDurasi(){
    return durasi;
    }
    String cetakJam(){
    return jam;
    }
}