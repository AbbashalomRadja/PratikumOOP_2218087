/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8.Interface;

/**
 *
 * @author ASUS
 */
public class Pesawat extends kendaraan implements Berjalan, Terbang{
    public Pesawat(String merek){
        super(merek);
    }
    
    @Override
    void carabegerak(){
        System.out.println("Pesawat bergereak dalam udara dengan menggunakan mesin-mesin yang memungkinkan untuk terbang");
    }
    
    @Override
    void kecepatanMax(){
        System.out.println("500km/h");
    }
    
    @Override
    public void berjalan(){
        System.out.println("Pesawat " + getMerek()+ "berjalan maju melalui roda yang bersentuhan langsung dengan permukaan tanah");
    }
    
    @Override
    public void terbang(){
        System.out.println("Pesawat " + getMerek() + "mesin yang berkecepatan tinggi, baling2 dan sayap aerodinamic memungkinkan pesawat untuk lepas landas, terbang");
    }
}
