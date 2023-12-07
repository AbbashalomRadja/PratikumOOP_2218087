/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
public class Gaji_reward extends Gaji_abs_reward{
    int waktu;
    double tunj_bonus;
    double gajipokok;
    double tunj_anak;
    double anak;
   public Gaji_reward(){
        this.waktu = waktu;
        this.gajipokok = gajipokok;
        this.tunj_anak = tunj_anak;
        this.anak = anak;
        this.tunj_bonus = 0; // Inisialisasi tunjangan bonus
    }      
        @Override
    public double tunjanganAnak() {
        if (anak == 1) {
            return 0.1 * gajipokok; // Tunjangan 10% untuk satu anak
        } else {
            return 0.2 * gajipokok; // Tunjangan 20% untuk lebih dari satu anak
        }
    }

    @Override
    public double lembur() {
        // Konversi dari menit ke jam
        double jam = waktu / 60.0;

        // Hitung lembur dan bonus pegawai
        double lembur = jam * 25000;
        tunj_bonus = tunjanganAnak() + lembur;

        return lembur;
    }
    }

