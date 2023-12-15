/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab9;

import TugasBab7.*;

/**
 *
 * @author ASUS
 */
public class Nikon extends Camera {
    public String name,alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public Nikon(){
        this.name = "Abbashalom Radja";
        this.kode = "Nikon";
        this.saldo = 500000;
        this.alamat = "Malang, jl.Bunga Melati";
    }
    @Override
    double cekKode(String input){
        if(input.compareTo(kode) == 0){
            diskon = 0.2;
        } else {
            diskon = 0;
        }
        return diskon;
    }
    @Override
    double hitPembayaran(double bayar){
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo(){
        return this.saldo - total;
    }
    @Override
    void tampilkanMember(){
        System.out.println("Member Nikon dengan diskon 20%");
    }
}
