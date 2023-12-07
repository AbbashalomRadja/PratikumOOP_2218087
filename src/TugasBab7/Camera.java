/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab7;

/**
 *
 * @author ASUS
 */
public abstract class Camera {
    abstract double hitPembayaran(double bayar);
    abstract double cekKode(String input);
    abstract void tampilkanMember();
    
    String member(Canon member){
        return "Hitam";
    }
    
    String member(Nikon member){
        return "Biru";
    }
    
    String member(DSLR member){
        return "Merah";
    }
}
