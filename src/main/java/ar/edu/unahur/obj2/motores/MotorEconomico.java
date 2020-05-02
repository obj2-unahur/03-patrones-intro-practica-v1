package ar.edu.unahur.obj2.motores;

public class MotorEconomico implements Motor{
    private int caballosDeFuerza = 92;
    private String transmision = "Automatica";
    private String combustible = "Diesel";


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
