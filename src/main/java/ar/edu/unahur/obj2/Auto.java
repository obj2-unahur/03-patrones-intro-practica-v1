package ar.edu.unahur.obj2;
import ar.edu.unahur.obj2.motores.Motor;

public class Auto {
    private String modelo;
    private Motor tipoDeMotor;

    public Auto(String modelo, Motor tipoDeMotor) {
        this.modelo = modelo;
        this.tipoDeMotor = tipoDeMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getTipoDeMotor() {
        return tipoDeMotor;
    }

    public int caballosDeFuerza() {
        return tipoDeMotor.getCaballosDeFuerza();
    }

    public String Transmision() {
        return tipoDeMotor.getTransmision();
    }

    public String Combustible() {
        return tipoDeMotor.getCombustible();
    }
}
