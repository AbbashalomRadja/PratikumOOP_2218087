/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8.Interface;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");
        mobil.berjalan();
        mobil.carabegerak();
        mobil.kecepatanMax();
        System.out.println("=====================");
        Pesawat pesawat = new Pesawat("Boeing 737");
        pesawat.carabegerak();
        pesawat.kecepatanMax();
        pesawat.berjalan();
        pesawat.berjalan();
        pesawat.terbang();
    }
}
