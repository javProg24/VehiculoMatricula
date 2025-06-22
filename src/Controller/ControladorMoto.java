package Controller;

public class ControladorMoto extends ControladorVehiculo {
    @Override
    public double calcularTarifaMatricula() {
        return 100 + 0.05;
    }
}
