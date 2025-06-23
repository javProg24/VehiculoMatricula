package Model;

public class Camion extends Vehiculo{
    public Camion() {
        super();
    }
    public Camion(String placa, String marca, String modelo, int anio, Persona dueno) {
        super(placa, marca, modelo, anio, dueno);
    }
}
