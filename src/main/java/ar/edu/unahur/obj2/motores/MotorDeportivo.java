package ar.edu.unahur.obj2.motores;

public class MotorDeportivo implements Motor{
    private int caballosDeFuerza = 320;
    private String transmision = "Manual";
    private String combustible = "Nafta";


    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getCombustible() {
        return combustible;
    }
}