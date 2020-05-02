package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.motores.MotorDeportivo;
import ar.edu.unahur.obj2.motores.MotorEconomico;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Auto autoCreado = null;

        System.out.println("Bienvenido!");
        System.out.println("Elija que modelo de auto desea:");
        System.out.println("1- Modelo Economico");
        System.out.println("2- Modelo Deportivo");
        //System.out.println("3- Modelo Electrico");

        int seleccion = entrada.nextInt();

        switch (seleccion) {
            case 1:
                autoCreado = new Auto("Eco", new MotorEconomico());
                break;
            case 2:
                autoCreado = new Auto("Sport", new MotorDeportivo());
                break;
            case 3:
                autoCreado = new Auto("Electric", null); //Implementar tipo de motor
                break;
        }

        System.out.println("- Creando vehiculo...");
        System.out.println("- Ficha tecnica:");
        System.out.println("- Modelo: " + autoCreado.getModelo());
        System.out.println("- Caballos de fuerza: " + autoCreado.caballosDeFuerza() + "hp");
        System.out.println("- Trasmision: " + autoCreado.Transmision());
        System.out.println("- Combustible: " + autoCreado.Combustible());
    }
}
