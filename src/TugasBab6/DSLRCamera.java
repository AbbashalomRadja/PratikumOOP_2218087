/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab6;

/**
 *
 * @author ASUS
 */
class DSLRCamera extends Camera {
    private String lensType;

    public DSLRCamera(String brand, String model, double rentalPrice, String lensType) {
        super(brand, model, rentalPrice);
        this.lensType = lensType;
    }

    @Override
    public String getCameraInfo() {
        return "DSLR Camera - " + brand + " " + model + " with " + lensType + " lens";
    }
}

