/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab3;

/**
 *
 * @author ASUS
 */
public class KameraAnalog extends PersewaanKamera{
    private String jenisFilm;
    
    public KameraAnalog(String jenisKamera, int hargaSewa, int lamaSewa, String JenisFilm){
        super(jenisKamera, hargaSewa, lamaSewa);
        this.jenisFilm = JenisFilm;
    }
    
    public void setJenisFilm(String jenisFilm){
        this.jenisFilm = jenisFilm;
    }
    
    public String getJenisFilm(){
        return jenisFilm;
    }
}
