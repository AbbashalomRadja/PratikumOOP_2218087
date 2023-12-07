/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab3;

/**
 *
 * @author ASUS
 */
public class KameraDigital extends PersewaanKamera {
    private int jumlahPixel;
    
    public KameraDigital(String jeniskamera, int hargaSewa, int lamaSewa, int jumlahPixel){
        super(jeniskamera, hargaSewa, lamaSewa);
        this.jumlahPixel =  jumlahPixel;
    }
    public void setJumlahPixel(int jumlahPixel){
        this.jumlahPixel = jumlahPixel;
    }
    public int getJumlahPixel(){
        return jumlahPixel;
    }
}
