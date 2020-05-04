package ar.edu.unahur.obj2.avesdeinvierno;

public class AveDeInvierno {
    private Double energia;

    public AveDeInvierno() {}

    public AveDeInvierno(Double energia) {
        this.energia = energia;
    }

    public Double getEnergia() {
        return energia;
    }

    public void volar(int km) {
        if(km < 30) throw new IllegalArgumentException("No hago vuelos tan cortos");
        if(energia < 40) throw new IllegalStateException("No tengo energia");
        energia -= conservarEnergia(km);

    }

    public double conservarEnergia(int km) {
        return km * .5;
    }

    public void mostrarEnergia() {
        System.out.println("Mi energia es: " + energia);
    }
}
