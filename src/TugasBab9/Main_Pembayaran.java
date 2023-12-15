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
public class Main_Pembayaran {
    public static void main(String[] args) {
        Camera payment;
        payment = new Canon();
        payment.tampilkanMember();
        if (payment instanceof Canon){
            Canon canon = (Canon) payment;
            
            System.out.println("Jenis member: " + canon.member(canon));
            System.out.println("Total Pembelian "+ canon.hitPembayaran(500000));
            System.out.println("Sisa Saldo "+ canon.potSaldo());
        }
    }
}
