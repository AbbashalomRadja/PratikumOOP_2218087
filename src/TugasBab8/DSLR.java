/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab8;

import TugasBab7.*;

/**
 *
 * @author ASUS
 */
public class DSLR extends Camera implements Kamera{
    public String name,alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public DSLR(){
        this.name = "Abbashalom Radja";
        this.kode = "DSLR";
        this.saldo = 300000;
        this.alamat = "Malang, jl.Atletik";
    }
    @Override
    double cekKode(String input){
        if(input.compareTo(kode) == 0){
            diskon = 0.3;
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
        System.out.println("Member dslr dengan diskon 30%");
    }
    @Override
    public int Merekam(){
        return saldo;
    }
}
