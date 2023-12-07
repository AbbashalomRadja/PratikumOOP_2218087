/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab3;

/**
 *
 * @author ASUS
 */
public class PersewaanKamera {
    private String jenisKamera;
    private int hargaSewa;
    private int lamaSewa;
    
        public PersewaanKamera(String jenisKamera, int hargaSewa, int lamaSewa) {
        this.jenisKamera = jenisKamera;
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
        }
    public int hitungBiaya(){
        return hargaSewa * lamaSewa;
    }    
}



