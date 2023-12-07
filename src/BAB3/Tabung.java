/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran {
    int t;
    double volume, luaspermukaan;
    
    public Tabung(){
        t=20;
    }
    void Keterangan(){
        Deskripsi();
        System.out.println("Menghitung Volume Tabung");
    }
    double HitVolumeTabung(){
        volume = ((phi * r * r) * t);
        return volume;
    }
    
}
