/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab6;

/**
 *
 * @author ASUS
 */
class NikonCamera extends Camera {
    public NikonCamera(String model, double rentalPrice) {
        super("Nikon", model, rentalPrice);
    }

    @Override
    public String getCameraInfo() {
        return "Nikon " + model;
    }
}

