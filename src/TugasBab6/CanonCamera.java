/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab6;

/**
 *
 * @author ASUS
 */
class CanonCamera extends Camera {
    public CanonCamera(String model, double rentalPrice) {
        super("Canon", model, rentalPrice);
    }

    @Override
    public String getCameraInfo() {
        return "Canon " + model;
    }
}

