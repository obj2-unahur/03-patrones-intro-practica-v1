package ar.edu.unahur.obj2.motores;
/*
* Recordar que esta clase no puede ser modificada!!
*/
public class MotorElectrico {
    private int horsepower;
    private String transmission;
    private String fuel;

    public MotorElectrico() {
        this.horsepower = 220;
        this.transmission = "Automatic";
        this.fuel = "Energy";
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getFuel() {
        return fuel;
    }
}
