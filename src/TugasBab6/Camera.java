/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab6;

/**
 *
 * @author ASUS
 */

    
abstract class Camera {
    protected String brand;
    protected String model;
    protected double rentalPrice;

    public Camera(String brand, String model, double rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public abstract String getCameraInfo();
}
